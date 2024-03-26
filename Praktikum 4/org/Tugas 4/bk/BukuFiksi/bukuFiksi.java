package BukuFiksi;

import buku.*;

public class bukuFiksi extends Buku{
    protected String genre;
    protected int jumlahHalaman;
    protected double harga;

    public bukuFiksi(String judul, String penulis, String tahunTerbit, String genre, int jumlahHalaman, double harga){
        super(judul, penulis, tahunTerbit);
        this.genre = genre;
        this.jumlahHalaman = jumlahHalaman;
        this.harga = harga;
    }

    public String getGenre(){
        return this.genre;
    }

    public int getJumlahHalaman(){
        return this.jumlahHalaman;
    }

    public double getHarga(){
        return this.harga;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setJumlahHalaman(int jumlahHalaman){
        this.jumlahHalaman = jumlahHalaman;
    }

    public void view(){
        System.out.println("Judul: " + getJudul());
        System.out.println("Penulis: " + getPenulis());
        System.out.println("Tahun terbit: " + getTahunTerbit());
        System.out.println("Genre: " + getGenre());
        System.out.println("Jumlah Halaman : " + getJumlahHalaman());
        System.out.println("Harga : " + getHarga());
    }
}