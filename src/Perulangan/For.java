package Perulangan;

public class For {
    public static void main(String[] args) {
        
        //Menampilkan Bilangan Genap dari 1 - 10
        System.out.print("Bilangan Genap dari 1 - 10 = ");
        int genap;
        for (genap = 1; genap <=10; genap++ ){
        if(genap % 2 == 0){
            System.out.print(genap + " ");
            }
        }
        System.out.println(" ");
    }
}
