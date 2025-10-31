
#  Program Pengingat Tugas

**Program Pengingat Tugas** adalah aplikasi sederhana berbasis *console* yang digunakan untuk mencatat, menampilkan, dan menghapus daftar tugas.
Dibuat menggunakan bahasa pemrograman **Java**, program ini memanfaatkan konsep **Object-Oriented Programming (OOP)** seperti *class*, *object*, dan *encapsulation*.

---

##  Fitur Utama

1. **Tambah Tugas**
   Pengguna dapat menambahkan tugas baru dengan mengisi *nama tugas*, *tanggal dibuat*, dan *deadline*.

2. **Lihat Daftar Tugas**
   Menampilkan seluruh daftar tugas yang telah dimasukkan dalam format berurutan.

3. **Hapus Tugas**
   Menghapus tugas tertentu berdasarkan nomor urut yang ditampilkan.

4. **Keluar dari Program**
   Mengakhiri program dengan pesan penutup.

---

##  Struktur Kelas

Program ini terdiri dari beberapa kelas utama berikut:

### 1. `Tugas`

Menyimpan data satu tugas dengan atribut:

* `nama` — nama tugas yang harus dikerjakan
* `tanggalBuat` — tanggal pembuatan tugas
* `deadline` — batas waktu penyelesaian tugas

Metode penting:

* *Getter dan Setter* untuk setiap atribut
* `toString()` untuk menampilkan data tugas dalam format:

  ```
  nama | tanggalBuat -> deadline
  ```

---

### 2. `DaftarTugas`

Berfungsi sebagai wadah penyimpanan seluruh daftar tugas.

Fungsi utama:

* `tambahTugas()` — menambahkan tugas baru ke dalam daftar
* `tampilkanTugas()` — menampilkan seluruh tugas yang tersimpan
* `hapusTugas()` — menghapus tugas berdasarkan nomor urutnya

---

### 3. `PengingatTugas`

Kelas pengatur utama (sebagai *controller class*, kosong di versi ini, tapi bisa dikembangkan untuk pengelolaan logika lebih lanjut).

---

### 4. `Main`

Kelas utama yang menjalankan program.

Menampilkan menu interaktif kepada pengguna, seperti:

* Menambah tugas baru
* Melihat daftar tugas
* Menghapus tugas tertentu
* Keluar dari program

---

## ⚙ Cara Menjalankan Program

1. Pastikan **Java** sudah terinstal di perangkat Anda

   ```
   java --version
   ```

2. Simpan semua file dalam satu folder dengan nama `Main.java` (beserta kelas lain dalam file yang sama).

3. Buka **terminal/command prompt** pada folder tersebut.

4. Jalankan perintah berikut:

   ```bash
   javac Main.java
   java Main
   ```

5. Pilih menu sesuai kebutuhan:

    * 1 → Tambah Tugas
    * 2 → Lihat Tugas
    * 3 → Hapus Tugas
    * 4 → Keluar

---

##  Contoh Tampilan Program

```
1. Tambah Tugas
2. Lihat Tugas
3. Hapus Tugas
4. Keluar
Pilih menu: 1
Nama tugas: Membuat laporan
Tanggal dibuat: 2025-10-30
Deadline: 2025-11-05

1. Tambah Tugas
2. Lihat Tugas
3. Hapus Tugas
4. Keluar
Pilih menu: 2
1. Membuat laporan | 2025-10-30 -> 2025-11-05
```

---

##  Konsep OOP yang Digunakan

* **Encapsulation** → Data tugas disimpan secara privat dalam kelas `Tugas` dengan akses melalui *getter* dan *setter*.
* **Composition** → Kelas `DaftarTugas` memiliki daftar objek `Tugas` di dalamnya.
* **Abstraction** → Proses pengaturan daftar dan tampilan tugas dipisahkan dari logika utama di kelas `Main`.
* **Polymorphism (implicit)** → Penggunaan `toString()` untuk menampilkan representasi teks dari objek `Tugas`.

---

## Lisensi

Program ini dibuat untuk keperluan pembelajaran dasar pemrograman Java dan bebas digunakan untuk tujuan akademik atau pribadi.



