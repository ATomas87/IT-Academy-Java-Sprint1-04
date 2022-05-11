package n1exercici2;

public class CalculoDni {
    private final int dniNumber;
    private final char[] dniLetters = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public CalculoDni(int dniNumber) {
        this.dniNumber = dniNumber;
    }

    public char calculateLetter() {
        return dniLetters[this.dniNumber % 23];
    }
}
