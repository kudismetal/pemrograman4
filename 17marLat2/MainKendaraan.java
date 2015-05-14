public class MainKendaraan{
	public static void main(String[]args){
		Mobil mobil1 = new Mobil();
		mobil1.bergerak();
		mobil1.mengerem();
		mobil1.berjalanMundur();
		mobil1.tanggalProduksi();

		Pesawat pesawat1 = new Pesawat();
		pesawat1.mengerem();
		pesawat1.terbang();
		pesawat1.tanggalProduksi();
	}
}