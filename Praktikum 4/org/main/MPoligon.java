package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args){
        
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        Segitiga segi3 = new Segitiga(5,10,3);
        
        persegi.printInfo();
        segi3.printInfo();
        
        System.out.println("Luas Persegi Panjang : " + persegi.hitungLuas());

        System.out.println("Luas Segitiga : " + segi3.hitungLuas());
    }
}