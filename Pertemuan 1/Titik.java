class Titik{
    //deklarasi atribut
    double absis;
    double ordinat;
    static int counterTitik;

    //deklarasi konstruktor
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik ++;
    }

    Titik(double x, double y){
        absis = x;
        ordinat = y;
        counterTitik ++;
    }

    //deklarasi method
    void setAbsis(double x){
        absis = x;
    }
    void setOrdinat(double y){
        ordinat = y;
    }
    double getAbsis(){
        return absis;
    }
    double getOrdinat(){
        return ordinat;
    }
    int getCounterTitik(){
        return counterTitik;
    }
}