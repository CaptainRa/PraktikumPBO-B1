public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13){
            throw new AngkaSialException();
        }
        System.out.println((angka+" bukan angka sial"));
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hait-hati memasukkan angka!!!");
        }
    }
}

//Baris 6 pada AngkaSial.java di atas dieksekusi karena perintah pertama cobaAngka(10) bukan angka sial jadi tetep dieksekusi tapi untuk cobaAngka(12) tidak dieksekusi karena sudah masuk ke block exception di perintah cobaAngka(13)
//Baris 15 pada AngkaSial.java di atas dieksekusi ketika masuk ke perintah cobaAngka(13)