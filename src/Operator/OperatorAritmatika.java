package Operator;
      
public class OperatorAritmatika {
    public static void main(String[] args) {
        //Deklarasi Variabel
        int angka1 = 12;
        int angka2 = 6;
        int hasil1 = angka1 + angka2;
        int hasil2 = angka1 - angka2;
        int hasil3 = angka1 * angka2;
        int hasil4 = angka1 / angka2;
        System.out.println("------- Operator Aritmatika --------");
        //Penjumlahan
        System.out.println("Hasil Penjumlahan dari " + angka1 + " + " + angka2 
                + " \t= " + hasil1);
        //Pengurangan
        System.out.println("Hasil Pengurangan dari " + angka1 + " - " + angka2 
                + " \t= " + hasil2);
        //Perkalian
        System.out.println("Hasil Perkalian dari " + angka1 + " x " + angka2 
                + "\t= " + hasil3);
        //Pembagian
        System.out.println("Hasil Pembagian dari " + angka1 + " / " + angka2 
                + "\t= " + hasil4);
    }     
}
