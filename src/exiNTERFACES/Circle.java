package exiNTERFACES;

public record Circle(double radious) implements  GeometricForm {

    private static final double  pi= 3.14;

    @Override
    public double getAre() {
        return pi * (radious*radious);
    }
}
