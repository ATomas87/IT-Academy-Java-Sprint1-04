package n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class Months {
    private List<String> months;

    public Months() {
        this.months = new ArrayList<>();
        this.months.add("enero");
        this.months.add("febrero");
        this.months.add("marzo");
        this.months.add("abril");
        this.months.add("mayo");
        this.months.add("junio");
        this.months.add("julio");
        this.months.add("agosto");
        this.months.add("septiembre");
        this.months.add("octubre");
        this.months.add("noviembre");
        this.months.add("diciembre");
    }

    public List<String> getMonths() {
        return months;
    }
}
