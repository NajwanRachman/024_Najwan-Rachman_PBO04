package id.ac.polban.pbo.kantin.model;

public class Makanan extends MenuItem {

    private String jenis;

    public Makanan(String kode, String nama, int harga, String jenis) {
        super(kode, nama, harga);
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    @Override
    public String info() {
        return super.info()
                + " - Jenis: " + jenis;
    }
}