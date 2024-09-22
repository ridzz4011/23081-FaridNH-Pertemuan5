package pertemuan5.code1;

public class CubeBlock {
    public static void main(String[] args) {
        Cube cb = new Cube(2);
        Block bl = new Block(8, 4, 2);

        System.out.println("Kubus: sisi 2");
        System.out.println("Volume = " + cb.Volume());
        System.out.println("Luas Area = " + cb.luasArea());

        System.out.println("Balok: panjang 8 lebar 4 tinggi 2");
        System.out.println("Volume = " + bl.Volume());
        System.out.println("Luas Area = " + bl.luasArea());
    }
}
