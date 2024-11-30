//ATTANABIL RABBANI 50421230 4IA14
import java.util.Scanner;

class Activity1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Keliling dan Luas Bangun Datar");
        System.out.println("1. Persegi/Persegi Panjang\n2. Segitiga\n3. Lingkaran");
        System.out.print("Pilih (1/2/3): ");
        int choice = scanner.nextInt();

        switch(choice){
            case 1:
                System.out.print("Masukkan Panjang: ");
                int p = scanner.nextInt();
                System.out.print("Masukkan lebar: ");
                int l = scanner.nextInt();

                int luas = p*l;
                int kel = 2*(p+l);

                System.out.println("Luas: "+luas);
                System.out.println("Keliling: "+kel);
                break;
            case 2:
                System.out.print("Masukkan panjang alas segitiga: ");
                int alas = scanner.nextInt();
        
                System.out.print("Masukkan tinggi segitiga: ");
                int tinggi = scanner.nextInt();
        
                System.out.print("Masukkan panjang sisi kedua (b): ");
                int b = scanner.nextInt();
        
                System.out.print("Masukkan panjang sisi ketiga (c): ");
                int c = scanner.nextInt();
                
                int luasseg = (alas*tinggi)/2;
                int kelilingseg = alas+b+c;

                System.out.println("Luas: "+luasseg);
                System.out.println("Keliling: "+kelilingseg);
                break;
            case 3:
                System.out.print("Masukkan Radius: ");
                int radius = scanner.nextInt();

                double luasling = Math.PI * Math.pow(radius,2);
                double kelling = 2 * Math.PI * radius;

                System.out.println("Luas: "+luasling);
                System.out.println("Keliling: "+kelling);
                break;
            default:
                System.out.println("Pilihan anda tidak valid");
                break;
        }

    }
}