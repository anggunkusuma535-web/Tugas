package BangunRuangPT12;

public class Kerucut extends BangunRuang {
    private double radius;
    private double tinggi;
    
    public Kerucut(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }
    
    @Override
    public double volume() {
        // Rumus: (1/3) * pi * r^2 * t
        return (1.0 / 3.0) * Math.PI * radius * radius * tinggi;
    }
}