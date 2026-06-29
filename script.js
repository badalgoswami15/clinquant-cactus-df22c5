function convert() {
    const conversionType = document.getElementById("conversionType").value;
    const inputValue = parseFloat(document.getElementById("inputValue").value);
    const resultDisplay = document.getElementById("resultDisplay");

    if (isNaN(inputValue)) {
        resultDisplay.innerText = "Please enter a valid number!";
        resultDisplay.style.color = "#ff4d4d";
        return;
    }

    let result = 0;
    let unit = "";

    if (conversionType === "usdToInr") {
        result = inputValue * 83;
        unit = " INR";
    } else if (conversionType === "inrToUsd") {
        result = inputValue / 83;
        unit = " USD";
    } else if (conversionType === "kmToMeter") {
        result = inputValue * 1000;
        unit = " Meters";
    } else if (conversionType === "meterToKm") {
        result = inputValue / 1000;
        unit = " KM";
    }

    resultDisplay.innerText = "Output: " + result.toFixed(2) + unit;
    resultDisplay.style.color = "#2ecc71";
}