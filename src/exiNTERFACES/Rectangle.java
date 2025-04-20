package exiNTERFACES;

public record Rectangle(double height, double base) implements  GeometricForm {
    @Override
    public double getAre() {
        return base*height;
    }
}
