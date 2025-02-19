package Ucilica;

public class Trokut extends GeometrijskiLik {
    private double a;
    private double b;
    private double c;

    public Trokut(String naziv, double a, double b, double c) {
        super(naziv);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double povrsina() {
        // heronova formula, kad imamo tri duzine
        double s = 0.5*(a+b+c);
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    @Override
    public double opseg() {
        return a+b+c;
    }
}
