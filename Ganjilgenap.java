import java.util.Scanner;
public class Ganjilgenap {

    
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
          
         
         System.out.println("|-----------------------------------------|");
         System.out.println("|  MENENTUKAN BILANGAN GANJIL DAN GENAP   |");
         System.out.println("|-----------------------------------------|");
          System.out.print("Masukkan bilangan\t\t:");
          long angka = input.nextInt() ;
          
          if(angka % 2 == 0) {
          System.out.println("Angka\t\t\t\t:"+angka + "  Bilangan Genap" ); 
          }
          else { 
                  System.out.println("Angka\t\t\t\t:"+angka + "  Bilangan Ganjil");
          }
    }
    
}