public class Pegawai {
    String nama;
    String alamat;
    int umur;
    int gaji;

    public String setNamaPegawai(String nmPgw) {
        nama = nmPgw;
        return nama;
    }

    public String setAlamatPegawai(String almtPgw) {
        alamat = almtPgw;
        return alamat;
    }

    public int setUmurPegawai(int umrPgw) {
        umur = umrPgw;
        return umur;
    }

    public int setGajiPegawai(int gjPgw) {
        gaji = gjPgw;
        return gaji;
    }

    public void cetak(){
        this.setNamaPegawai("Yudhistira Putra N.");
        this.setUmurPegawai(19);
        this.setAlamatPegawai("Jl. Girimargo 92 RT 2 / RW 5, Wonosobo");
        this.setGajiPegawai(1850000);

        System.out.println("Nama   : " + nama);
        System.out.println("Umur   : " + umur);
        System.out.println("Alamat : " + alamat);
        System.out.println("Gaji   : " + gaji); //dF.format(gaji));
    }

    public static void main(String[] args) {
        Pegawai Pgw = new Pegawai();
        Pgw.cetak();
    }
}
