const ConverterModel = {
    convertValue: function(value, type) {
        if (type === "usdToInr") {
            return value * 83;
        } else if (type === "kmToMeter") {
            return value * 1000;
        }
        return 0;
    },
    getUnit: function(type) {
        return type === "usdToInr" ? " INR" : " Meters";
    }
};