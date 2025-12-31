package BangunRuangPT12;

public class Balok extends BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;
    
    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    @Override
    public double volume() {
        // Rumus: panjang * lebar * tinggi
        return panjang * lebar * tinggi;
    }
}