package Ucilica;

public class Pravokutnik extends GeometrijskiLik {
    private double a;
    private double b;

    public Pravokutnik(String naziv, double b, double a) {
        super(naziv);
        this.b = b;
        this.a = a;
    }

    @Override
    public double povrsina() {
        return a*b;
    }

    @Override
    public double opseg() {
        return 2*(a+b);
    }
}
