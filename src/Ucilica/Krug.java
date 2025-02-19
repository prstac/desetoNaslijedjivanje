package Ucilica;

public class Krug  extends GeometrijskiLik {
    private double radijus;

    public Krug(String naziv, double radijus) {
        super(naziv);
        this.radijus = radijus;
    }

    @Override
    public double povrsina() {
        return radijus*radijus*Math.PI;
    }

    @Override
    public double opseg() {
        return 2*radijus*Math.PI;
    }
}
