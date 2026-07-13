document.getElementById("convertBtn").addEventListener("click", function() {
    const inputRaw = document.getElementById("inputValue").value.trim();
    const type = document.getElementById("conversionType").value;
    const resultDisplay = document.getElementById("resultDisplay");

    if (inputRaw === "") {
        resultDisplay.innerText = "Please enter a value";
        resultDisplay.style.color = "#ff4d4d";
        return;
    }

    const value = parseFloat(inputRaw);
    const result = ConverterModel.convertValue(value, type);
    const unit = ConverterModel.getUnit(type);

    resultDisplay.innerText = "Result: " + result.toFixed(2) + unit;
    resultDisplay.style.color = "#2ecc71";
});