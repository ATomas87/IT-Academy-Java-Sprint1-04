package n1exercici3;

public class IndexOutOfBounds {
    private int[] numbers;

    public IndexOutOfBounds() {
        this.numbers = new int[8];
        for (int i : numbers) {
            numbers[i] = i;
        }
    }

    public int getNinthElement() {
        return numbers[9];
    }
}
