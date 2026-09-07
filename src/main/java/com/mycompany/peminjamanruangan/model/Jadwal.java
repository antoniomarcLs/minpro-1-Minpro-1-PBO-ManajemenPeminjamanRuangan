package com.mycompany.peminjamanruangan.model;

public class Jadwal {
    public String tanggal;
    public String jamMulai;
    public String jamSelesai;

    public Jadwal(String tanggal, String jamMulai, String jamSelesai) {
        this.tanggal = tanggal;
        this.jamMulai = jamMulai;
        this.jamSelesai = jamSelesai;
    }

    public void tampilkanJadwal() {
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Waktu  : " + jamMulai + " - " + jamSelesai);
    }
}