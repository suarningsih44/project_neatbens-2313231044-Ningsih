/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Wayan
 */
// Kelas induk (superclass)
class Hewan {
    protected String nama;

    // Constructor
    public Hewan(String nama) {
        this.nama = nama;
    }

    void makan() {
        System.out.println(nama + " sedang makan.");
    }
}

// Kelas anak (subclass) - Kucing
class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama); // Memanggil constructor superclass
    }

    void suara() {
        System.out.println(nama + " mengeong: Meow!");
    }
}

// Kelas anak (subclass) - Anjing
class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama); // Memanggil constructor superclass
    }

    void suara() {
        System.out.println(nama + " menggonggong: Guguk! Guguk!");
    }
}

// Main class untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing("Tom");
        Anjing anjing1 = new Anjing("Moca");

        // Memanggil metode dari superclass
        kucing1.makan();
        anjing1.makan();

        // Memanggil metode dari subclass
        kucing1.suara();
        anjing1.suara();
    }
}
