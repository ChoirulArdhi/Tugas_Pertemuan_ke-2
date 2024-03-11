package Perulangan;

public class While {
    public static void main(String[] args) {
        //Menampilkan Bilangan Ganjil dari 1 - 10
        System.out.print("Bilangan Ganjil dari 1 - 10 = ");
        int ganjil = 1;
        while (ganjil <= 10) {
            if(ganjil % 2 == 1){
            System.out.print(ganjil + " ");
            }
            ganjil++;
        }
        System.out.println(" ");
    }
}
