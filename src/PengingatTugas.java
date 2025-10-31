import java.util.ArrayList;

/**
 * Kelas ini digunakan untuk menyimpan data satu tugas,
 * yang memiliki nama, tanggal dibuat, dan deadline.
 */
class Tugas {
    String nama;
    String tanggalBuat;
    String deadline;

    /**
     * Konstruktor untuk membuat objek tugas baru.
     *
     * @param nama nama tugas
     * @param tanggalBuat tanggal saat tugas dibuat
     * @param deadline batas waktu pengumpulan tugas
     */
    public Tugas(String nama, String tanggalBuat, String deadline) {
        this.nama = nama;
        this.tanggalBuat = tanggalBuat;
        this.deadline = deadline;
    }

    /** Mengambil nama tugas. */
    public String getNama() {
        return nama;
    }

    /** Mengubah nama tugas. */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /** Mengambil tanggal pembuatan tugas. */
    public String getTanggalBuat() {
        return tanggalBuat;
    }

    /** Mengubah tanggal pembuatan tugas. */
    public void setTanggalBuat(String tanggalBuat) {
        this.tanggalBuat = tanggalBuat;
    }

    /** Mengambil deadline tugas. */
    public String getDeadline() {
        return deadline;
    }

    /** Mengubah deadline tugas. */
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    /**
     * Mengubah data tugas menjadi format teks yang mudah dibaca.
     *
     * @return teks berisi nama tugas, tanggal dibuat, dan deadline
     */
    @Override
    public String toString() {
        return nama + " | " + tanggalBuat + " -> " + deadline;
    }
}

/**
 * Kelas ini berfungsi untuk mengatur daftar tugas,
 * seperti menambah, menampilkan, dan menghapus tugas.
 */
class DaftarTugas {
    ArrayList<Tugas> daftar = new ArrayList<>();

    /**
     * Menambah tugas baru ke daftar.
     *
     * @param nama nama tugas
     * @param tanggalBuat tanggal dibuat
     * @param deadline batas waktu tugas
     */
    public void tambahTugas(String nama, String tanggalBuat, String deadline) {
        daftar.add(new Tugas(nama, tanggalBuat, deadline));
    }

    /** Menampilkan semua tugas yang ada di daftar. */
    public void tampilkanTugas() {
        if (daftar.isEmpty()) {
            System.out.println("Belum ada tugas.");
        } else {
            for (int i = 0; i < daftar.size(); i++) {
                System.out.println((i + 1) + ". " + daftar.get(i));
            }
        }
    }

    /**
     * Menghapus tugas berdasarkan urutan di daftar.
     *
     * @param index posisi tugas yang ingin dihapus (dimulai dari 0)
     */
    public void hapusTugas(int index) {
        if (index >= 0 && index < daftar.size()) {
            daftar.remove(index);
            System.out.println("Tugas berhasil dihapus.");
        } else {
            System.out.println("Nomor tugas tidak valid!");
            System.out.println("kiki");
        }
    }
}

/**
 * Kelas utama program pengingat tugas.
 * Program ini berfungsi untuk menampilkan daftar tugas sederhana.
 */
public class PengingatTugas {
    public static void main(String[] args) {
        DaftarTugas daftar = new DaftarTugas();

        // Contoh data tugas
        daftar.tambahTugas("Tugas IMK", "31-10-2025", "05-11-2025");
        daftar.tambahTugas("Tugas PBO", "31-10-2025", "07-11-2025");

        System.out.println("Daftar Tugas:");
        daftar.tampilkanTugas();

        daftar.hapusTugas(0);
        System.out.println("\nSetelah dihapus:");
        daftar.tampilkanTugas();
    }
}
