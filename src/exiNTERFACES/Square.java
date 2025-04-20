package exiNTERFACES;

public record Square(double side) implements  GeometricForm {
    @Override
    public double getAre() {
        return side*side;
    }
}
