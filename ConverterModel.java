public class ConverterModel {
    // बैकएंड कैलकुलेशन का असली काम
    public double convertValue(double value, String type) {
        if (type.equals("USD to INR")) {
            return value * 83; // 1 USD = 83 INR
        } else if (type.equals("Kilometer to Meter")) {
            return value * 1000; // 1 KM = 1000 Meters
        }
        return 0;
    }

    public String getUnit(String type) {
        return type.equals("USD to INR") ? " INR" : " Meters";
    }
}