package Ucilica;


/*
Ako klasa ima apstraktnu metodu, klasa mora biti apstraktna
Ne mozemo instancirati(kreirati) objekte iz apstraktne klase
Apstraktna klasa mora biti naslijeđena,
Moramo implementirati sve apstraktne metode asptraktne klase;
 */
public abstract class GeometrijskiLik {
    private String naziv;
    public abstract double opseg();
    public abstract double povrsina();

    @Override
    public String toString()
    {
        return String.format("%-15s\tP = %5s\tO = %5s",
                naziv,
                String.format("%.2f", povrsina()),
                String.format("%.2f", opseg()));
    }

    GeometrijskiLik(String naziv) {
        this.naziv = naziv;
    }
}
