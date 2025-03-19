/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Wayan
 */
// Kelas Kalkulator dengan Overloading
class Kalkulator {

    // Metode pertama: Menjumlahkan dua angka (integer)
    int tambah(int a, int b) {
        return a + b;
    }

    // Metode kedua: Menjumlahkan tiga angka (integer) - Overloading
    int tambah(int a, int b, int c) {
        return a + b + c;
    }

    // Metode ketiga: Menjumlahkan dua angka desimal (double) - Overloading
    double tambah(double a, double b) {
        return a + b;
    }

    // Overloading method untuk pengurangan
    int kurang(int a, int b) {
        return a - b;
    }

    double kurang(double a, double b) {
        return a - b;
    }

    // Overloading method untuk perkalian
    int kali(int a, int b) {
        return a * b;
    }

    double kali(double a, double b) {
        return a * b;
    }

    // Overloading method untuk pembagian
    int bagi(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
            return 0;
        }
        return a / b;
    }

    double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
            return 0;
        }
        return a / b;
    }
}

// Kelas Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();

        // Memanggil metode tambah (overloading)
        System.out.println("Tambah (int, int): " + k.tambah(5, 10));
        System.out.println("Tambah (int, int, int): " + k.tambah(5, 10, 15));
        System.out.println("Tambah (double, double): " + k.tambah(5.5, 2.5));

        // Memanggil metode kurang (overloading)
        System.out.println("Kurang (int, int): " + k.kurang(10, 5));
        System.out.println("Kurang (double, double): " + k.kurang(10.5, 5.2));

        // Memanggil metode kali (overloading)
        System.out.println("Kali (int, int): " + k.kali(4, 3));
        System.out.println("Kali (double, double): " + k.kali(2.5, 3.0));

        // Memanggil metode bagi (overloading)
        System.out.println("Bagi (int, int): " + k.bagi(10, 2));
        System.out.println("Bagi (double, double): " + k.bagi(10.0, 2.5));

        // Contoh pembagian dengan nol
        System.out.println("Bagi dengan nol: " + k.bagi(10, 0));
    }
}
