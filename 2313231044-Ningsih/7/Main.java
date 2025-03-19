/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Wayan
 */
// Superclass
class Hewan {
    void bersuara() {
        System.out.println("Hewan bersuara...");
    }
}

// Subclass Kucing
class Kucing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Meow! Meow!");
    }
}

// Subclass Anjing
class Anjing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Guk! Guk!");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Kucing(); // Polimorfisme
        Hewan hewan2 = new Anjing(); // Polimorfisme

        hewan1.bersuara(); // Memanggil metode bersuara() dari Kucing
        hewan2.bersuara(); // Memanggil metode bersuara() dari Anjing
    }
}
