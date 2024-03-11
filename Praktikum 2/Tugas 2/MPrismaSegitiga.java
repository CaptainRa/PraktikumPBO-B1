public class MPrismaSegitiga {
    public static void main(String[] args) {
        Segitiga s = new Segitiga(3, 4);
        PrismaSegitiga prisma = new PrismaSegitiga(s, 5.0);
        System.out.println("Volume prisma: " + prisma.hitungVolume());
        System.out.println("Luas permukaan prisma: " + prisma.hitungLuasPermukaan());
    }
}
