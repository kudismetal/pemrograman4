public class Buah extends BuahBerbiji{
	private String nama;
	private String warna;
	int harga;

	public Buah (){

	}

	public Buah (String nama, String warna) {
		System.out.println("Buah " + nama + ", berwarna " + warna);
	}

	public int harga(){
		harga = 3000;
		System.out.println("Harga Buah " + harga);
		return harga;
	}

	public static void main(String[]args){
		Buah bh1 = new Buah("Apel", "Merah");
		bh1.harga();
		bh1.harga(2500);
	}
}