public class MOperasiTitik{
    public static void main(String[] args){
        Titik t = new Titik(4, 4);
        OperasiTitik o = new OperasiTitik();
        Titik u = new Titik(3,4);
        System.out.println("titik (" + t.getAbsis() + "," + t.getOrdinat() + ")");

        //o.refleksiSumbuX(t);
        o.refleksiX(t);
        System.out.println("titik ref sbX:(" + t.getAbsis() + "," + t.getOrdinat() + ")");

        //o.refleksiSumbuY(t);
        o.refleksiY(u);
        System.out.println("titik ref sbY:(" + u.getAbsis() + "," + u.getOrdinat() + ")");


    }
}
