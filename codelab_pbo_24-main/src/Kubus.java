import java.util.Scanner;

public class Kubus extends BangunRuang {
    Scanner scanner = new Scanner(System.in);
    private double tinggi;

    public Kubus(String name) {
        super(name);
    }

    public void inputNilai() {
        super.inputNilai();
        System.out.print("Input sisi: ");
        tinggi = scanner.nextDouble();
    }

    public void luasPermukaan() {
        double hasil = 6 * tinggi * tinggi;
        super.luasPermukaan();
        System.out.println("Hasil luas permukaan: " + hasil);
    }

    public void volume() {
        double hasil = Math.pow(tinggi, 3);
        super.volume();
        System.out.println("Hasil volume: " + hasil);
    }
}
