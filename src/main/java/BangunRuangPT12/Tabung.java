package BangunRuangPT12;

public class Tabung extends BangunRuang {
    private double radius;
    private double tinggi;
    
    public Tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }
    
    @Override
    public double volume() {
        // Rumus: pi * r^2 * t
        return Math.PI * radius * radius * tinggi;
    }
}