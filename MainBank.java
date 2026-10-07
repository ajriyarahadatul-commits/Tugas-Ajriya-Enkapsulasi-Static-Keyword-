public class MainBank {
    public static void main(String[] args) {
        System.out.println("=== PEMBUATAN REKENING BARU ===");
        RekeningBank rek1 = new RekeningBank("101", "Ajriya", 500000);
        RekeningBank rek2 = new RekeningBank("102", "Alina", 200000);

        System.out.println("\n=== TES TRANSFER BERHASIL ===");
        rek1.transfer(150000, rek2);
        System.out.println("Sisa saldo " + rek1.getNamaPemilik() + " : Rp " + rek1.getSaldo());
        System.out.println("Sisa saldo " + rek2.getNamaPemilik() + " : Rp " + rek2.getSaldo());

        System.out.println("\n=== TES TRANSFER GAGAL (OVER SALDO) ===");
        rek1.transfer(1000000, rek2); // Nyoba transfer 1 juta padahal saldo sisa 350rb

        System.out.println("\n=== CEK SALDO AKHIR ===");
        System.out.println("Saldo akhir " + rek1.getNamaPemilik() + " : Rp " + rek1.getSaldo());
        System.out.println("Saldo akhir " + rek2.getNamaPemilik() + " : Rp " + rek2.getSaldo());

        System.out.println("\n=== CEK TOTAL REKENING ===");
        System.out.println("Total akun terdaftar: " + RekeningBank.totalRekening);
    }
}