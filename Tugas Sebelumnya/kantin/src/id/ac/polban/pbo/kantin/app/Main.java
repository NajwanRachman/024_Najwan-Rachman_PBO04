package id.ac.polban.pbo.kantin.app;

import id.ac.polban.pbo.kantin.model.Mahasiswa;
import id.ac.polban.pbo.kantin.model.MenuItem;
import id.ac.polban.pbo.kantin.model.Pesanan;
import id.ac.polban.pbo.kantin.model.Makanan;
import id.ac.polban.pbo.kantin.model.Minuman;
public class Main {

    public static void main(String[] args) {


        Mahasiswa m1 = new Mahasiswa("241001", "Asep");
        Mahasiswa m2 = new Mahasiswa("241002", "Siti");

        System.out.println("=== DATA MAHASISWA ===");

        System.out.println(
                m1.getNim() + " - " + m1.getNama()
        );

        System.out.println(
                m2.getNim() + " - " + m2.getNama()
        );


       Makanan nasi = new Makanan(
        "M01",
        "Nasi Goreng",
        18000,
        "Makanan Berat"
        );

        Minuman kopi = new Minuman(
        "M02",
        "Kopi Susu",
        12000,
        "Large"
        );

        kopi.tandaiHabis();

        System.out.println("\n=== DATA MENU ===");

        System.out.println(
                nasi.getNama()
                + " tersedia: "
                + nasi.isTersedia()
        );

        System.out.println(
                kopi.getNama()
                + " tersedia: "
                + kopi.isTersedia()
        );

        System.out.println(nasi.info());
        System.out.println(kopi.info());
        


        Pesanan p1 = new Pesanan(m1, nasi, 2);
        Pesanan p2 = new Pesanan(m2, kopi, 1);
        Pesanan p3 = new Pesanan(m1, nasi, 1);
        

        System.out.println("\n=== DATA PESANAN ===");

        System.out.println(p1.ringkasan());

        System.out.println(p2.ringkasan());

        System.out.println(p3.ringkasan());


        System.out.println("\n=== STATIC ===");

        System.out.println(
                "Nomor P1: " + p1.getNomor()
        );

        System.out.println(
                "Nomor P2: " + p2.getNomor()
        );

        System.out.println(
                "Nomor P3: " + p3.getNomor()
        );

        System.out.println(
                "Jumlah pesanan dibuat: "
                + Pesanan.getJumlahPesananDibuat()
        );

        Pesanan.getJumlahPesananDibuat();


    }
}