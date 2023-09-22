package enumerations;

public enum PHCurrency {
    PISO(1.00f), CENTS(0.25f), FIVEPESO(5.00f), TWENTYPESO(20.00f), FIFTYPESO(50.00F), HUNDREDPESO(100.00f), THOUSANDPESO;

    float value;

    PHCurrency(float value) {
        this.value = value;
    }

    PHCurrency() {

    }
}
