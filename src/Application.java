import javax.swing.*;
import java.awt.*;

class Application {
    public static void main(String[] args) {
        JFrame window = new JFrame("Moj chat");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        JTextArea textArea = new JTextArea();
        JTextField textField = new JTextField();
        textField.addActionListener(e -> {
            textArea.append(textField.getText() + "\n");
            textField.setText("");
        });
        JPanel panel = new JPanel();

        panel.setLayout(new BorderLayout());
        panel.add(textField, BorderLayout.PAGE_START);
        panel.add(textArea, BorderLayout.CENTER);

        window.add(panel);

        textArea.setEditable(false);
        window.pack();
        window.setVisible(true);
    }
}
