package Perulangan;

public class DoWhile {
    public static void main(String[] args) {
        //Menampilkan Bilangan Ganjil dari 1 - 10
        System.out.print("Bilangan Ganjil dari 1 - 10 = ");
        int ganjil = 1;
        do {
            if(ganjil % 2 == 1){
            System.out.print(ganjil + " ");
            }
            ganjil++;
        }
        while (ganjil <= 10);
        System.out.println(" ");
    }
}
