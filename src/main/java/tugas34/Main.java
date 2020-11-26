/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas34;
import java.util.Scanner;
/**
 *
 * @author
 * Aris Prabowo
 * IF10k - 10119914
 */
public class Main {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        var keyboard = new Scanner(System.in);
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.println("Masukan Angka ke-1: ");
        kalkulator.value1 = keyboard.nextDouble();
        System.out.println("Masukan Angka ke-2: ");
        kalkulator.value2 = keyboard.nextDouble();
        
        System.out.println();
        //memanggil methode class kalkulator;
        System.out.println("Hasil Pertambahan: "+kalkulator.tambahBilangan());
        System.out.println("Hasil Pengurangan: "+kalkulator.kurangBilangan());
        System.out.println("Hasil Perkalian: "+kalkulator.kaliBilangan());
        System.out.println("Hasil Pembagian: "+kalkulator.bagiBilangan());
        System.out.println("Hasil Sisa: "+kalkulator.sisaBilangan());
    }
    
}
