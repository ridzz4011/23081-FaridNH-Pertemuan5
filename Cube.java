package pertemuan5.code1;

public class Cube extends Calculate {
    private double sisi;

    public Cube(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double Volume() {
        return sisi * sisi * sisi;
    }

    @Override
    double luasArea() {
        return 6 * (sisi * sisi);
    }
}
