/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Wayan
 */
interface Hewan {
    void makan();
}

interface Mamalia {
    void menyusui();
}

class Kucing implements Hewan, Mamalia {
    @Override
    public void makan() {
        System.out.println("Kucing makan ikan.");
    }

    @Override
    public void menyusui() {
        System.out.println("Kucing menyusui anaknya.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek Kucing
        Kucing kucingSaya = new Kucing();

        // Memanggil method-method dari interface Hewan dan Mamalia
        kucingSaya.makan();
        kucingSaya.menyusui();
    }
}

