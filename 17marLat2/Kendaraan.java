public class Kendaraan{
	private int tanggalProduksi;

	public Kendaraan(){

	}

	public int tanggalProduksi(){
		tanggalProduksi = 170315;
		System.out.println("Kendaraan diproduksi tanggal : " + tanggalProduksi);
		System.out.println(" ");
		return tanggalProduksi;
	}

	public void bergerak(){
		System.out.println("Kendaraan dapat bergerak.");
	}

	public void mengerem(){
		System.out.println("Kendaraan dapat mengerem.");
	}
}