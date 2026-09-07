package com.mycompany.peminjamanruangan.model;

public class Ruangan {
    public int idRuangan;
    public String namaRuangan;
    public int kapasitas;
    public boolean tersedia;

    public Ruangan(int idRuangan, String namaRuangan, 
                   int kapasitas, boolean tersedia) {
        this.idRuangan = idRuangan;
        this.namaRuangan = namaRuangan;
        this.kapasitas = kapasitas;
        this.tersedia = tersedia;
    }

    public void tampilkanInfo() {
        System.out.println("ID Ruangan   : " + idRuangan);
        System.out.println("Nama Ruangan : " + namaRuangan);
        System.out.println("Kapasitas    : " + kapasitas + "kursi");
        System.out.println("Status       : " + (tersedia ? "tersedia" : "tidak Tersedia"));
    }
}