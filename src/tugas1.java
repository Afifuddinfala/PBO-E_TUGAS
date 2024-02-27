import java.util.Scanner;//mengimpor

public class tugas1 {//menampilkan
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan; //tipe data

        System.out.println("Selamat datang di sistem login library.");
        System.out.println("Silakan pilih jenis user:");
        System.out.println("1. Mahasiswa");
        System.out.println("2. Admin");
        System.out.print("Pilihan: ");
        pilihan = input.nextInt();

        if (pilihan == 1) {
            // Login mahasiswa
            String nim;

            System.out.print("Masukkan NIM: ");
            nim = input.next(); // gunakan input.next() untuk membaca string dengan panjang tunggal

            if (nim.length() == 15) {
                // Login berhasil
                System.out.println("Login berhasil sebagai mahasiswa dengan NIM " + nim);
            } else {
                // Login gagal
                System.out.println("Login gagal. NIM harus terdiri dari 15 karakter.");
            }
        } else if (pilihan == 2) {
            // Login admin
            String username, password;

            System.out.print("Masukkan username: ");
            username = input.next();

            System.out.print("Masukkan password: ");
            password = input.next();

            if (username.equals("admin") && password.equals("kamu")) {
                // Login berhasil
                System.out.println("Login berhasil sebagai admin.");
            } else {
                // Login gagal
                System.out.println("Login gagal. Username atau password salah.");
            }
        } else {
            // Pilihan tidak valid
            System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}