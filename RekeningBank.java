public class RekeningBank {
    // Variabel privat biar terenkapsulasi
    private String noRekening;
    private String namaPemilik;
    private double saldo;

    // Untuk ngitung jumlah total akun yang udah dibuat
    public static int totalRekening = 0;

    // Constructor buat inisialisasi akun baru
    public RekeningBank(String noRekening, String namaPemilik, double saldoAwal) {
        this.noRekening = noRekening;
        this.namaPemilik = namaPemilik;

        // Cek syarat saldo awal minimal 50rb
        if (saldoAwal >= 50000) {
            this.saldo = saldoAwal;
        } else {
            System.out.println("Gagal bikin akun! Saldo awal minimal Rp 50.000 yaa.");
            this.saldo = 0;
        }

        // Nambah total rekening tiap bikin objek baru
        totalRekening++;
    }

    // Method buat ngambil nilai saldo
    public double getSaldo() {
        return this.saldo;
    }

    // Method buat ngubah saldo
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Opps, saldo gak boleh bernilai minus!");
        }
    }

    // Method buat proses transfer uang
    public void transfer(double nominal, RekeningBank tujuan) {
        if (nominal <= 0) {
            System.out.println("Nominal transfer harus lebih dari 0!");
        } else if (this.saldo >= nominal) {
            this.saldo -= nominal;
            tujuan.saldo += nominal;
            System.out.println("Sip! Transfer Rp " + nominal + " dari " + this.namaPemilik + " ke " + tujuan.namaPemilik + " berhasil diselesaiin.");
        } else {
            System.out.println("Waduh, saldo " + this.namaPemilik + " gak cukup nih! Saldo sekarang Rp " + this.saldo + ", tapi mau transfer Rp " + nominal);
        }
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }
}