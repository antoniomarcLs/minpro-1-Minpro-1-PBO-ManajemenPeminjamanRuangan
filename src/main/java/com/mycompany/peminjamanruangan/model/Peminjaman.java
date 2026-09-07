package com.mycompany.peminjamanruangan.model;


public class Peminjaman {

    public String namaPihak;
    public String tujuan;
    public int nomorSurat;
    public Ruangan ruangan;
    public Jadwal jadwal;

    public Peminjaman(String namaPihak, String tujuan, int nomorSurat,Ruangan ruangan, Jadwal jadwal) {
        
        this.namaPihak = namaPihak;
        this.tujuan = tujuan;
        this.nomorSurat = nomorSurat;
        this.ruangan = ruangan;
        this.jadwal = jadwal;
    }

    public void tampilkanInfo() {

        System.out.println("\n=== DATA SURAT PEMINJAMAN ===");
        System.out.println("Nomor Surat  : " + nomorSurat);
        System.out.println("Nama Pihak   : " + namaPihak);
        System.out.println("Tujuan       : " + tujuan);
        System.out.println("Nama Ruangan : " + ruangan.namaRuangan);

        jadwal.tampilkanJadwal();
    }
}