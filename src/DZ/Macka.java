package DZ;

public class Macka extends Zivotinja {

    public Macka(String naziv) {
        super(naziv);
    }

    @Override
    String glasajSe() {
        return "Mjau mjau!";
    }
}
