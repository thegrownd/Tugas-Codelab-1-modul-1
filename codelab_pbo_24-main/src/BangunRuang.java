public class BangunRuang {
   private String name;

    public BangunRuang(String name) {
        this.name = name;
    }

    public void inputNilai() {
        System.out.println("Input nilai");
    }

    public void luasPermukaan() {
        System.out.println("Menghitung luas permukaan bangun " + name);
    }

    public void volume() {
        System.out.println("Menghitung volume bangun " + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getName(String name) {
        this.name = name;
    }
}
