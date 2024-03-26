package main;

import BukuFiksi.*;
import bukunonFiksi.*;

public class MBuku {
    public static void main(String[] args){
        bukuFiksi bF1 = new bukuFiksi("Harry Potter", "J.K.Rowling", "2002","Fantasi", 208, 80000);

        bukuNovel bN1 = new bukuNovel("Summer in Seoul", "Ilana Tan", "2015", "Romance", 187, 50000);

        bukuNonFiksi bNF1 = new bukuNonFiksi("Why? Series", "Kwang Woong Lee", "2009", "Sains", 250, 100000);

        bukuAkademik bA1 = new bukuAkademik("Diktat Dasar Pemrograman", "Inggriani Liem", "2008", "Rock",150, 80000);

        bF1.view();
        bN1.view();
        bNF1.view();
        bA1.view();
    }
}
