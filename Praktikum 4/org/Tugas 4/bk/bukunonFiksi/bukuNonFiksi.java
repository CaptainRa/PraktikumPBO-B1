package bukunonFiksi;

import buku.*;

public class bukuNonFiksi extends Buku{
    protected String subjek;
    protected int jumlahHalaman;
    protected double harga;

    public bukuNonFiksi(String judul, String penulis, String tahunTerbit, String subjek, int jumlahHalaman, double harga){
        
        super(judul, penulis, tahunTerbit);

        this.subjek = subjek;
        this.jumlahHalaman = jumlahHalaman;
        this.harga = harga;
    }

    public String getSubjek(){
        return this.subjek;
    }

    public double getHarga(){
        return this.harga;
    }

    public int getJumlahHalaman(){
        return this.jumlahHalaman;
    }

    public void view(){
        System.out.println("Judul: " + getJudul());
        System.out.println("Penulis: " + getPenulis());
        System.out.println("Tahun terbit: " + getTahunTerbit());
        System.out.println("Subjek: " + getSubjek());
        System.out.println("Jumlah Halaman : " + getJumlahHalaman());
        System.out.println("Harga : " + getHarga());
    }
}