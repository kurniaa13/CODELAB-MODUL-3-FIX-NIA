import java.util.Scanner;
public class App {
    private static String nameBangun;

    public static void main(String[] args) {
        Tabung tabung = new Tabung(nameBangun);
        Kubus kubus = new Kubus(nameBangun);

        kubus.inputNilai();
        kubus.luasPermukaan();
        kubus.volume();

        tabung.inputNilai();
        tabung.luasPermukaan();
        tabung.volume();

        // Balok
        System.out.println("\nBalok");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input panjang: ");
        double panjangBalok = scanner.nextDouble();
        System.out.print("Input lebar: ");
        double lebarBalok = scanner.nextDouble();
        System.out.print("Input tinggi: ");
        double tinggiBalok = scanner.nextDouble();

        double luasPermukaanBalok = 2 * ((panjangBalok * lebarBalok) + (panjangBalok * tinggiBalok) + (lebarBalok * tinggiBalok));
        double volumeBalok = panjangBalok * lebarBalok * tinggiBalok;

        System.out.println("Luas permukaan balok: " + luasPermukaanBalok);
        System.out.println("Volume balok: " + volumeBalok);
    }
}