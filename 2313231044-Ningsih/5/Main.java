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
        super(nama); // Memanggil konstruktor superclass
    }

    void suara() {
        System.out.println(nama + " mengeong: Meow Meow!");
    }
}


public class Main {
    public static void main(String[] args) {
        // Membuat objek Kucing
        Kucing kucingSaya = new Kucing("Milo");

        // Memanggil method dari superclass Hewan
        kucingSaya.info();

        // Memanggil method dari subclass Kucing
        kucingSaya.suara();
    }
}
