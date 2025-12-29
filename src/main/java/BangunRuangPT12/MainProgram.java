package BangunRuangPT12; 

public class MainProgram {
    public static void main(String[] args) {
        
        System.out.println("=== Program Pewarisan Volume Bangun Ruang ===");
        
        // Inisialisasi Objek dengan data contoh (menggunakan double agar akurat)
        Kubus kubus = new Kubus(4.0);
        Balok balok = new Balok(5.0, 3.0, 2.0);
        Tabung tabung = new Tabung(3.0, 7.0);
        Kerucut kerucut = new Kerucut(3.0, 7.0);
        Limas limas = new Limas(4.0, 5.0, 6.0); 
        Prisma prisma = new Prisma(3.0, 4.0, 10.0);
        Bola bola = new Bola(5.0);

        System.out.println("----------------------------------------");
        
        // Menampilkan Hasil Volume dengan memanggil method volume()
        System.out.println("Volume Kubus (sisi 4.0): " + kubus.volume());
        System.out.println("Volume Balok (5.0x3.0x2.0): " + balok.volume());
        
        // Menggunakan String.format untuk pembulatan agar tampilan lebih rapi
        System.out.println(String.format("Volume Tabung (r=3.0, t=7.0): %.2f", tabung.volume())); 
        System.out.println(String.format("Volume Kerucut (r=3.0, t=7.0): %.2f", kerucut.volume()));
        System.out.println("Volume Limas (Alas 4x5, t=6.0): " + limas.volume());
        System.out.println("Volume Prisma (Alas Segitiga 3x4, tP=10.0): " + prisma.volume());
        System.out.println(String.format("Volume Bola (r=5.0): %.2f", bola.volume()));
        
        System.out.println("----------------------------------------");
        
        BangunRuang brBalok = new Balok(1, 2, 3);
        System.out.println("Volume Balok (via ref. BangunRuang): " + brBalok.volume());
    }
}