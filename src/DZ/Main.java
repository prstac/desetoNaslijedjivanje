package DZ;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Zivotinja> zivotinje = new ArrayList<Zivotinja>();

        zivotinje.add(new Macka("Garfield"));
        zivotinje.add(new Pas("Snoopy"));
        zivotinje.add(new Zivotinja("Životinja"));
        zivotinje.add(new Macka("Maca"));
        zivotinje.add(new Pas("Peso"));
        zivotinje.add(new Zivotinja("Životinja2"));

        zivotinje.forEach(zivotinja -> zivotinja.printInfo());

    }
}
