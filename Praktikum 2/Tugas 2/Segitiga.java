class Segitiga {
    //Deklarasi atribut
    private double alas;
    private double tinggi;

    //Deklarasi konstruktor
    public Segitiga(){
        alas = 0;
        tinggi = 0;
    }

    //Method
    public Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getAlas(){
        return alas;
    }

    public double getTinggiSegitiga(){
        return tinggi;
    }

    public double hitungLuas(){
        return alas*tinggi*0.5;
    }


}
