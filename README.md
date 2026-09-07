# Sistem Pengajuan Peminjaman Ruangan

## Deskripsi Singkat Program

Program ini merupakan sistem sederhana untuk mengelola pengajuan peminjaman ruangan. Program memungkinkan admin untuk mengajukan peminjaman dengan memasukkan nama pihak, nama ruangan, tujuan penggunaan, nomor surat, serta jadwal peminjaman. Data peminjaman, ruangan, dan jadwal dikelola menggunakan `ArrayList` dan dihubungkan melalui ID. Selain melakukan pengajuan, program juga menyediakan fitur untuk melihat status peminjaman, menghapus data peminjaman, mengganti ruangan, dan mengakhiri program.

## Penjelasan Alur Program

### Case 1 – Pengajuan Surat

* Admin memilih menu **Pengajuan Surat**.
* Program meminta nama pihak yang mengajukan peminjaman.
* Admin memasukkan nama ruangan yang ingin digunakan.
* Admin memasukkan tujuan penggunaan ruangan.
* Admin memasukkan nomor surat.
* Admin memasukkan tanggal serta waktu mulai dan selesai peminjaman.
* Data ruangan dan jadwal kemudian dihubungkan dengan data peminjaman menggunakan ID.
* Program menampilkan informasi bahwa surat peminjaman berhasil diajukan.
* Admin kembali ke menu utama.

### Case 2 – Cek Status

* Admin memilih menu **Cek Status**.
* Program menampilkan data peminjaman yang telah diajukan.
* Informasi yang ditampilkan meliputi nama pihak, ruangan, dan tujuan peminjaman.
* Program juga menampilkan informasi tanggal dan waktu peminjaman.
* Setelah selesai, admin menekan **Enter** untuk kembali ke menu utama.

### Case 3 – Hapus Peminjaman

* Admin memilih menu **Hapus Peminjaman**.
* Program meminta nomor surat dari peminjaman yang ingin dihapus.
* Program mencari data berdasarkan nomor surat.
* Jika data ditemukan, program meminta konfirmasi kepada admin.
* Setelah dikonfirmasi, data peminjaman dihapus dari daftar.
* Program menampilkan pesan bahwa peminjaman berhasil dihapus.
* Admin kembali ke menu utama.

### Case 4 – Ganti Ruangan

* Admin memilih menu **Ganti Ruangan**.
* Program meminta nomor surat dari peminjaman yang ingin diubah.
* Program mencari data peminjaman berdasarkan nomor surat.
* Program menampilkan ruangan yang sedang digunakan.
* Admin melakukan konfirmasi untuk mengganti ruangan.
* Jika dikonfirmasi, admin memasukkan ruangan baru.
* ID ruangan pada data peminjaman diperbarui dengan ID ruangan yang baru.
* Program menampilkan informasi bahwa ruangan berhasil diganti.
* Admin kembali ke menu utama.

### Case 5 – Keluar

* Admin memilih menu **Keluar**.
* Nilai variabel pengulangan diubah sehingga perulangan menu berhenti.
* Program menghentikan proses dan keluar dari sistem.

<h1>Deskripsi singkat program<h1>
Program ini merupakan sistem sederhana untuk mengelola pengajuan peminjaman ruangan. Program memungkinkan admin untuk mengajukan peminjaman dengan memasukkan nama pihak, nama ruangan, tujuan penggunaan, nomor surat, serta jadwal peminjaman. Data peminjaman, ruangan, dan jadwal dikelola menggunakan `ArrayList` dan dihubungkan melalui ID. Selain melakukan pengajuan, program juga menyediakan fitur untuk melihat status peminjaman, menghapus data peminjaman, mengganti ruangan, dan mengakhiri program.




<h1>Alur program<h1>
1. **Case 1 – Pengajuan Surat**

   * Admin memilih menu pengajuan surat.
   * Program meminta nama pihak yang mengajukan peminjaman.
   * Admin memasukkan nama ruangan yang ingin digunakan.
   * Admin memasukkan tujuan penggunaan ruangan.
   * Admin memasukkan nomor surat.
   * Admin memasukkan tanggal serta waktu mulai dan selesai peminjaman.
   * Data ruangan dan jadwal kemudian dihubungkan dengan data peminjaman menggunakan ID.
   * Program menampilkan informasi bahwa surat peminjaman berhasil diajukan.
   * Admin kembali ke menu utama.

2. **Case 2 – Cek Status**

   * Admin memilih menu cek status peminjaman.
   * Program menampilkan data peminjaman yang telah diajukan.
   * Informasi yang ditampilkan meliputi nama pihak, ruangan, dan tujuan peminjaman.
   * Program juga menampilkan informasi tanggal dan waktu peminjaman.
   * Setelah selesai, admin menekan Enter untuk kembali ke menu utama.

3. **Case 3 – Hapus Peminjaman**

   * Admin memilih menu hapus peminjaman.
   * Program meminta nomor surat dari peminjaman yang ingin dihapus.
   * Program mencari data berdasarkan nomor surat.
   * Jika data ditemukan, program meminta konfirmasi kepada admin.
   * Setelah dikonfirmasi, data peminjaman dihapus dari daftar.
   * Program menampilkan pesan bahwa peminjaman berhasil dihapus dan kembali ke menu utama.

4. **Case 4 – Ganti Ruangan**

   * Admin memilih menu ganti ruangan.
   * Program meminta nomor surat dari peminjaman yang ingin diubah.
   * Program mencari data peminjaman berdasarkan nomor surat.
   * Program menampilkan ruangan yang sedang digunakan.
   * Admin melakukan konfirmasi untuk mengganti ruangan.
   * Jika dikonfirmasi, admin memasukkan ruangan baru.
   * ID ruangan pada data peminjaman diperbarui dengan ID ruangan yang baru.
   * Program menampilkan informasi bahwa ruangan berhasil diganti dan kembali ke menu utama.

5. **Case 5 – Keluar**

   * Admin memilih menu keluar.
   * Nilai variabel pengulangan diubah sehingga perulangan menu berhenti.
   * Program menghentikan proses dan keluar dari sistem.
