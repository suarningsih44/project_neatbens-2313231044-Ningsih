/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Wayan
 */
class Hewan {
    String nama;

    Hewan(String nama) {
        this.nama = nama;
    }

    void info() {
        System.out.println("Nama: " + nama);
    }
}

class Kucing extends Hewan {
    Kucing(String nama) {
        super(nama);
    }

    void suara() {
        System.out.println(nama + " mengeong: Meow Meow!");
    }
}

class Anjing extends Hewan {
    Anjing(String nama) {
        super(nama);
    }

    void suara() {
        System.out.println(nama + " menggonggong: Guguk Guguk!");
    }
}

public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // Membuat objek Kucing
        Kucing kucingSaya = new Kucing("Moci");
        kucingSaya.info();
        kucingSaya.suara();

        System.out.println(); // Pemisah output

        // Membuat objek Anjing
        Anjing anjingSaya = new Anjing("Moca");
        anjingSaya.info();
        anjingSaya.suara();
    }
}

