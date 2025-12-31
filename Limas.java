package BangunRuangPT12;

public class Limas extends BangunRuang {
    private double panjangAlas;
    private double lebarAlas;
    private double tinggi;
    
    public Limas(double panjangAlas, double lebarAlas, double tinggi) {
        this.panjangAlas = panjangAlas;
        this.lebarAlas = lebarAlas;
        this.tinggi = tinggi;
    }
    
    @Override
    public double volume() {
        // Rumus: (1/3) * Luas Alas (p*l) * tinggi
        double luasAlas = panjangAlas * lebarAlas;
        return (1.0 / 3.0) * luasAlas * tinggi;
    }
}