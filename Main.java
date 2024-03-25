import java.util.Scanner;

public class Main {
    private static String nameBangun;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kubus
        System.out.println("Kubus");
        Kubus kubus;
        kubus = new Kubus(nameBangun);
        kubus.inputNilai();
        kubus.luasPermukaan();
        kubus.volume();

        // Tabung
        System.out.println("\nTabung");
        Tabung tabung = new Tabung(nameBangun);
        tabung.inputNilai();
        tabung.luasPermukaan();
        tabung.volume();

        // Balok
        System.out.println("\nBalok");
        System.out.print("Input panjang: ");
        double panjangBalok = scanner.nextDouble();
        System.out.print("Input lebar: ");
        double lebarBalok = scanner.nextDouble();
        System.out.print("Input tinggi: ");
        double tinggiBalok = scanner.nextDouble();

        Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
        balok.luasPermukaan();
        balok.volume();
    }
}
