package pertemuan5.code1;

public class Block extends Calculate {
    private double panjang, lebar, tinggi;

    public Block(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    double Volume() {
        return panjang * lebar * tinggi;
    }

    @Override
    double luasArea() {
        return 2 * (panjang * lebar + lebar * tinggi + tinggi * panjang);
    }
}
