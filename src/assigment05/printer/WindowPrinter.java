package assigment05.printer;

import javax.swing.*;

public class WindowPrinter extends JFrame implements Printer {

    private JTextArea textField;
    private JScrollPane scrollPane;

    public WindowPrinter() {
        super("WindowPrinter");
        textField = new JTextArea();
        scrollPane = new JScrollPane(textField);
        this.setBounds(100,100,800,512);
        this.add(scrollPane);
        this.setVisible(true);
    }

    /** Prints
     * @param message to window console */
    @Override
    public void print(String message) {
        textField.setText(textField.getText() + "\n" + message);
    }

    /** Prints
     * @param object to window console */
    @Override
    public void print(Object object) {
        print(object.toString());
    }
}
