	import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
       
       Scanner input = new Scanner (System.in);
        
        String nama, umur, nim, asal;
        
        System.out.print("Masukkan nama: ");
        nama=input.nextLine();
        System.out.print("Masukkan umur: ");
        umur=input.nextLine();
        System.out.print("Masukkan nim: ");
        nim=input.nextLine();
        System.out.print("Masukkan alamat: ");
        String alamat=input.nextLine();
        
        System.out.println("nama: " + nama);
        System.out.println("umur: " + umur);
        System.out.println("nim: " + nim);
        System.out.println("alamat: " + alamat);
        
     
        
	}
}
