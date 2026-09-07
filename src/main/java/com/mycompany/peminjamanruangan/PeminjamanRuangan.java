package com.mycompany.peminjamanruangan;

import com.mycompany.peminjamanruangan.model.Peminjaman;
import com.mycompany.peminjamanruangan.model.Ruangan;
import com.mycompany.peminjamanruangan.model.Jadwal;
import java.util.ArrayList;
import java.util.Scanner;

public class PeminjamanRuangan {
    public static void main(String[] args) {
        ArrayList<Peminjaman> daftarPeminjaman = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean berjalan = true;
        while (berjalan) {
            System.out.println("\n=== SISTEM PENGAJUAN SURAT PEMINJAMAN RUANGAN ===");
            System.out.println("1. Pengajuan Surat");
            System.out.println("2. Cek Status");
            System.out.println("3. Hapus Peminjaman");
            System.out.println("4. Ganti Ruangan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {

                case 1 -> {
                    System.out.println("\n=== PENGAJUAN SURAT PEMINJAMAN ===");
                    System.out.print("Nama pihak peminjam      : ");
                    String namaPihak = scanner.nextLine();
                    
                    System.out.print("ID ruangan          (INT): ");
                    int idRuangan = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Nama ruangan             : ");
                    String namaRuangan = scanner.nextLine();
                    
                    System.out.print("Kapasitas ruangan   (INT): ");
                    int kapasitas = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Tujuan peminjaman        : ");
                    String tujuan = scanner.nextLine();
                    
                    System.out.print("Nomor Surat         (INT): ");
                    int nomorSurat = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Tanggal Peminjaman       : ");
                    String tanggal = scanner.nextLine();
                    
                    System.out.print("Jam Mulai                : ");
                    String jamMulai = scanner.nextLine();

                    System.out.print("Jam Selesai              : ");
                    String jamSelesai = scanner.nextLine();

                    Ruangan ruanganBaru = new Ruangan(
                            idRuangan,
                            namaRuangan,
                            kapasitas,
                            false
                    );
                    Jadwal jadwalBaru = new Jadwal(
                            tanggal,
                            jamMulai,
                            jamSelesai
                    );
                    Peminjaman peminjamanBaru = new Peminjaman(
                            namaPihak,
                            tujuan,
                            nomorSurat,
                            ruanganBaru,
                            jadwalBaru
                    );
                    daftarPeminjaman.add(peminjamanBaru);
                    System.out.println("\n>> SURAT BERHASIL DIAJUKAN!");
                    peminjamanBaru.tampilkanInfo();
                    System.out.println("\nTekan ENTER untuk kembali...");
                    scanner.nextLine();
                }

                case 2 -> {
                    System.out.println("\n=== STATUS PEMINJAMAN ===");
                    if (daftarPeminjaman.isEmpty()) {
                        System.out.println(
                                "Belum ada pengajuan peminjaman."
                        );
                    } else {
                        for (Peminjaman p : daftarPeminjaman) {
                            System.out.println("\n--------------------------------");
                            System.out.println("Nomor Surat: " + p.nomorSurat);
                            System.out.println("Nama Pihak   : " + p.namaPihak);
                            System.out.println("Nama Ruangan : " + p.ruangan.namaRuangan);
                            System.out.println("Tujuan       : " + p.tujuan);
                            System.out.println("Tanggal      : " + p.jadwal.tanggal);
                            System.out.println("Waktu        : "+ p.jadwal.jamMulai+ " - "+ p.jadwal.jamSelesai);
                        }
                    }
                    System.out.println("\nTekan ENTER untuk kembali...");
                    scanner.nextLine();
                }
                
                case 3 -> {
                    System.out.println("\n=== HAPUS PEMINJAMAN ===");
                    System.out.print("Masukkan Nomor Surat: ");
                    int nomorTarget = scanner.nextInt();
                    scanner.nextLine();
                    Peminjaman peminjamanDitemukan = null;
                    for (Peminjaman p : daftarPeminjaman) {
                        if (p.nomorSurat == nomorTarget) {
                            peminjamanDitemukan = p;
                            break;
                        }
                    }
                    if (peminjamanDitemukan != null) {
                        peminjamanDitemukan.tampilkanInfo();
                        System.out.print("\nYakin ingin menghapus surat ini? (Y/N): ");
                        String konfirmasi = scanner.nextLine();
                        if (konfirmasi.equalsIgnoreCase("Y")) {
                            daftarPeminjaman.remove(
                                    peminjamanDitemukan
                            );
                            System.out.println(">> Surat peminjaman berhasil dihapus!");
                        } else {

                            System.out.println(">> Penghapusan dibatalkan.");
                        }
                    } else {
                        System.out.println(">> Nomor surat tidak ditemukan.");
                    }
                    System.out.println("\nTekan ENTER untuk kembali...");
                    scanner.nextLine();
                }
                
                case 4 -> {
                    System.out.println("\n=== GANTI RUANGAN ===");
                    System.out.print("Masukkan Nomor Surat: ");
                    int nomorTarget = scanner.nextInt();
                    scanner.nextLine();
                    Peminjaman peminjamanDitemukan = null;
                    for (Peminjaman p : daftarPeminjaman) {
                        if (p.nomorSurat == nomorTarget) {
                            peminjamanDitemukan = p;
                            break;
                        }
                    }
                    if (peminjamanDitemukan != null) {
                        System.out.println("\nRuangan saat ini : "+ peminjamanDitemukan.ruangan.namaRuangan);
                        System.out.print("Apakah ingin mengganti ruangan? (Y/N): ");
                        String konfirmasi = scanner.nextLine();
                        if (konfirmasi.equalsIgnoreCase("Y")) {
                            System.out.print("Masukkan ID Ruangan Baru: ");
                            int idBaru = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Masukkan Nama Ruangan Baru: ");
                            String namaBaru = scanner.nextLine();
                            System.out.print("Masukkan Kapasitas Ruangan Baru: ");
                            int kapasitasBaru = scanner.nextInt();
                            scanner.nextLine();
                            peminjamanDitemukan.ruangan =
                                    new Ruangan(
                                            idBaru,
                                            namaBaru,
                                            kapasitasBaru,
                                            false
                                    );
                            System.out.println(">> Ruangan berhasil diganti!");
                            System.out.println("Ruangan baru : "+ peminjamanDitemukan.ruangan.namaRuangan);
                        } else {
                            System.out.println(">> Penggantian ruangan dibatalkan.");
                        }
                    } else {
                        System.out.println(">> Nomor surat tidak ditemukan.");
                    }
                    System.out.println("\nTekan ENTER untuk kembali...");
                    scanner.nextLine();
                }
                // CASE 5 - KELUAR
                case 5 -> {
                    berjalan = false;
                    System.out.println("\n>> Sistem telah dihentikan.");
                }
                // DEFAULT
                default -> {
                    System.out.println(">> Pilihan tidak valid!");
                }
            }
        }
        scanner.close();
    }
}
