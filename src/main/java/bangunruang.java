/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ANGGUN
 */
 import java.util.Scanner;
 
public class bangunruang {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // input dan objek
        Kubus kubus = new Kubus(5);
        Balok balok = new Balok(4,3,2);
        Tabung tabung = new Tabung(3,7);
        Kerucut kerucut = new Kerucut(3,8);
        Limas limas = new Limas(12,10);
        Prisma prisma = new Prisma(10,8);
        Bola bola = new Bola(6);

        System.out.println("Volume Kubus : " + kubus.hitungVolume());
        System.out.println("Volume Balok : " + balok.hitungVolume());
        System.out.println("Volume Tabung : " + tabung.hitungVolume());
        System.out.println("Volume Kerucut : " + kerucut.hitungVolume());
        System.out.println("Volume Limas : " + limas.hitungVolume());
        System.out.println("Volume Prisma : " + prisma.hitungVolume());
        System.out.println("Volume Bola : " + bola.hitungVolume());
    }
}

// --- Kelas Induk ---
class BangunRuang {
    double hitungVolume() { return 0; }
}

// --- Kelas Turunan ---
class Kubus extends BangunRuang { 
    double sisi; 
    Kubus(double sisi){ this.sisi=sisi; } 
    @Override double hitungVolume(){ return sisi*sisi*sisi; } 
}

class Balok extends BangunRuang {
    double p,l,t;
    Balok(double p,double l,double t){ this.p=p; this.l=l; this.t=t; }
    @Override double hitungVolume(){ return p*l*t; }
}

class Tabung extends BangunRuang {
    double r,t;
    Tabung(double r,double t){ this.r=r; this.t=t; }
    @Override double hitungVolume(){ return Math.PI*r*r*t; }
}

class Kerucut extends BangunRuang {
    double r,t;
    Kerucut(double r,double t){ this.r=r; this.t=t; }
    @Override double hitungVolume(){ return (1.0/3.0)*Math.PI*r*r*t; }
}

class Limas extends BangunRuang {
    double luasAlas, tinggi;
    Limas(double luasAlas,double tinggi){ this.luasAlas=luasAlas; this.tinggi=tinggi; }
    @Override double hitungVolume(){ return (1.0/3.0)*luasAlas*tinggi; }
}

class Prisma extends BangunRuang {
    double luasAlas, tinggi;
    Prisma(double luasAlas,double tinggi){ this.luasAlas=luasAlas; this.tinggi=tinggi; }
    @Override double hitungVolume(){ return luasAlas*tinggi; }
}

class Bola extends BangunRuang {
    double r;
    Bola(double r){ this.r=r; }
    @Override double hitungVolume(){ return (4.0/3.0)*Math.PI*r*r*r; }
}



