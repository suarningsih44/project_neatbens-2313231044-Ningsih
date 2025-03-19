/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Wayan
 */
// Superclass (Induk)
class Hewan {
    void makan() {
        System.out.println("Kucing sedang makan.");
    }
}

// Subclass (Turunan dari Hewan)
class Kucing extends Hewan {
    void suara() {
        System.out.println("ikan!");
    }
}

// Subclass lebih spesifik (Turunan dari Kucing)
class KucingAnggora extends Kucing {
    void jenis() {
        System.out.println("Ini adalah kucing anggora.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        KucingAnggora anggora = new KucingAnggora();

        anggora.makan();  // Dari superclass Hewan
        anggora.suara();  // Dari subclass Kucing
        anggora.jenis();  // Dari subclass KucingAnggora
    }
}

