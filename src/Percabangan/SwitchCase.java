package Percabangan;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama;
        System.out.print("Masukkan Nama Anda : ");
        nama = input.nextLine();
        
        System.out.println("--------------------------------------");
        int pilihan;
        System.out.println("Program studi yang dipilih :" );
        System.out.println("1. Ilmu Komputer");
        System.out.println("2. Teknik Mesin");
        System.out.println("3. PGSD");
        System.out.print("Masukkan Pilihan Anda : ");
        pilihan = input.nextInt();
        
        System.out.println("--------------------------------------");
        switch (pilihan) {
            case 1:
                System.out.println("Nama anda adalah " + nama + ", Program Studi yang anda pilih adalah Ilmu Komputer" );
                break;
            case 2:
                System.out.println("Nama anda adalah " + nama + ", Program Studi yang anda pilih adalah Teknik Mesin" );
                break;
            case 3:
                System.out.println("Nama anda adalah " + nama + ", Program Studi yang anda pilih adalah PGSD" );
                break;
            default:
                System.out.println("Pilihan yang anda masukkan salah");
                break;
        }
        }
        
        
    }

