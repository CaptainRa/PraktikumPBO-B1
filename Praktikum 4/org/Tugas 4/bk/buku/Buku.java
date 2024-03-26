package buku;

public class Buku{
    //Atribut
    protected String judul;
    protected String penulis;
    protected String tahunTerbit;

    public Buku(String judul, String penulis, String tahunTerbit){
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    //method
    public String getJudul(){
        return judul;
    }

    public String getPenulis(){
        return penulis;
    }

    public String getTahunTerbit(){
        return tahunTerbit;
    }

    public void setJudul(String title){
        judul = title;
    }

    public void setPenulis(String author){
        penulis = author;
    }

    public void view(){
        System.out.println("Judul: " + getJudul());
        System.out.println("Penulis: " + getPenulis());
        System.out.println("Tahun terbit: " + getTahunTerbit());
    }
}