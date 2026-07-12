import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // फ्रंटएंड और बैकएंड दोनों को लोड करना
        ConverterView view = new ConverterView();
        ConverterModel model = new ConverterModel();

        // बटन दबने पर दोनों को आपस में कनेक्ट करना
        view.addConvertListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = view.getInputText();
                
                if (inputText.isEmpty()) {
                    view.setResult("Please enter a value", Color.RED);
                    return;
                }

                try {
                    double inputValue = Double.parseDouble(inputText);
                    String selectedType = view.getSelectedType();

                    // बैकएंड से कैलकुलेशन करवाना
                    double result = model.convertValue(inputValue, selectedType);
                    String unit = model.getUnit(selectedType);

                    // फ्रंटएंड पर आउटपुट भेजना
                    view.setResult("Result: " + String.format("%.2f", result) + unit, new Color(46, 204, 113));

                } catch (NumberFormatException ex) {
                    view.setResult("Please enter numbers only", Color.RED);
                }
            }
        });

        // सॉफ्टवेयर को स्क्रीन पर दिखाना
        view.setVisible(true);
    }
}