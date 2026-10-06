package id.ac.polban.pbo.kantin.model;

public class Minuman extends MenuItem {

    private String ukuran;

    public Minuman(String kode, String nama, int harga, String ukuran) {
        super(kode, nama, harga);
        this.ukuran = ukuran;
    }

    public String getUkuran() {
        return ukuran;
    }

    @Override
    public String info() {
        return super.info()
                + " - Ukuran: " + ukuran;
    }
}