package BangunRuangPT12;

public class Prisma extends BangunRuang {
    private double alasSegitiga;
    private double tinggiSegitiga;
    private double tinggiPrisma; 
    
    public Prisma(double alasSegitiga, double tinggiSegitiga, double tinggiPrisma) {
        this.alasSegitiga = alasSegitiga;
        this.tinggiSegitiga = tinggiSegitiga;
        this.tinggiPrisma = tinggiPrisma;
    }
    
    @Override
    public double volume() {
        // Luas Alas (Luas Segitiga): 0.5 * a * tSegitiga
        double luasAlas = 0.5 * alasSegitiga * tinggiSegitiga;
        // Rumus: Luas Alas * tinggi Prisma
        return luasAlas * tinggiPrisma;
    }
}