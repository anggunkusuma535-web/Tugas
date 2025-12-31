package BangunRuangPT12;

public class Bola extends BangunRuang {
    private double radius;
    
    public Bola(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double volume() {
        // Rumus: (4/3) * pi * r^3
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}