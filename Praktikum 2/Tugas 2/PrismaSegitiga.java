public class PrismaSegitiga {
    //Atribut
    private Segitiga alas;
    private double tinggiPrisma;

    //Method
    public PrismaSegitiga(Segitiga alas, double tinggiPrisma){
        this.tinggiPrisma = tinggiPrisma;
        this.alas = alas;
    }

    public double hitungVolume(){
        return alas.hitungLuas()*tinggiPrisma;
    }

    public double hitungLuasPermukaan(){
        return (2*alas.hitungLuas()) + 3*(tinggiPrisma*Math.sqrt(Math.pow(alas.getAlas(),2) + Math.pow(alas.getTinggiSegitiga(),2)));
    }
}
