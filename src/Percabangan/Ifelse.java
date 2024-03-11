package Percabangan;
import java.util.Scanner;
        
public class Ifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a;
        System.out.print("Hasil Penjumlahan dari 2 + 2 = ");
        a = input.nextInt();
        
        //jika true maka operasi di dalam if akan dijalankan
        if (a == 4){
        System.out.println("Selamat!! Jawaban anda benar");
        }
        
        //jika false maka operasi di di dalam else akan dijalankan
        else{
        System.out.println("Maaf, Jawaban anda salah");
        }
}
}
