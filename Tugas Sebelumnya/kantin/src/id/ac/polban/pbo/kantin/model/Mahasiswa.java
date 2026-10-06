package id.ac.polban.pbo.kantin.model;

public class Mahasiswa {

    private String nama;
    private String nim;

    public Mahasiswa(String nim, String nama) {
        this.nama = nama;
        this.nim = nim;
    }



    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }
}