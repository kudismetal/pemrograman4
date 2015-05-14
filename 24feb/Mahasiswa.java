public class Mahasiswa{
	private String nama;
	int ongkos;

	public Mahasiswa (){

	}

	public Mahasiswa (String nama, int ongkos) {
		System.out.println(nama + " : " + ongkos);
	}

	public void setNama (String nmMhs) {
		nama = nmMhs;
	}

	public String getNama () {
		System.out.println("Nama : " + nama);
		return nama;
	}

	public int ongkos(int ongMhs){
		ongkos = ongMhs * 2;
		System.out.println("Ongkos : " + ongkos);
		System.out.println("");
		return ongkos;
	}

}