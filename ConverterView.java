import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ConverterView extends JFrame {
    // UI Elements
    private JTextField inputField = new JTextField();
    private JComboBox<String> typeSelect = new JComboBox<>(new String[]{"Kilometer to Meter", "USD to INR"});
    private JButton convertBtn = new JButton("Convert Now");
    private JLabel resultLabel = new JLabel("", SwingConstants.CENTER);

    public ConverterView() {
        // विंडो की बेसिक सेटिंग्स
        setTitle("Smart Unit & Currency Converter");
        setSize(380, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 1, 10, 10));

        // डार्क थीम डिजाइनिंग
        Color bgColor = new Color(26, 26, 26);
        Color boxColor = new Color(51, 51, 51);
        Color textColor = Color.WHITE;
        Color btnColor = new Color(255, 77, 77);

        getContentPane().setBackground(bgColor);

        JLabel titleLabel = new JLabel("Smart Converter", SwingConstants.CENTER);
        titleLabel.setForeground(btnColor);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));

        JLabel subTitle = new JLabel("Choose Conversion:", SwingConstants.CENTER);
        subTitle.setForeground(textColor);

        typeSelect.setBackground(boxColor);
        typeSelect.setForeground(textColor);

        inputField.setBackground(boxColor);
        inputField.setForeground(textColor);
        inputField.setCaretColor(textColor);
        inputField.setHorizontalAlignment(JTextField.CENTER);

        convertBtn.setBackground(btnColor);
        convertBtn.setForeground(textColor);
        convertBtn.setFont(new Font("Arial", Font.BOLD, 14));

        resultLabel.setFont(new Font("Arial", Font.BOLD, 16));

        // एलिमेंट्स को जोड़ना
        add(titleLabel);
        add(subTitle);
        add(typeSelect);
        add(inputField);
        add(convertBtn);
        add(resultLabel);

        setLocationRelativeTo(null);
    }

    // इनपुट वैल्यू लेने के लिए मेथड्स (Getters)
    public String getInputText() { return inputField.getText().trim(); }
    public String getSelectedType() { return (String) typeSelect.getSelectedItem(); }

    // आउटपुट दिखाने के लिए मेथड्स (Setters)
    public void setResult(String message, Color color) {
        resultLabel.setForeground(color);
        resultLabel.setText(message);
    }

    // बटन क्लिक को सुनने के लिए लिसनर
    public void addConvertListener(ActionListener listener) {
        convertBtn.addActionListener(listener);
    }
}