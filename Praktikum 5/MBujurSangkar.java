import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
    }
}

//Apabila kelas BujurSangkar tidak membuat implementasi method abstrak yang ada pada kelas BangunDatar maka tidak bisa memproses method karena setiap method abstrak pada superclass harus diimplementasikan dalam subclassnya untuk bisa dioperasikan.
