package BangunRuangPT12;

public class Kubus extends BangunRuang {
    private double sisi;
    
    public Kubus(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public double volume() {
        // Rumus: sisi * sisi * sisi
        return sisi * sisi * sisi;
    }
}