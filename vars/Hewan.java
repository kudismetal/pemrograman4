public class Hewan{
	int umur;
	int jumlahKaki;

	public Hewan(){
	}
	public void setJumlahKaki (int jumlahKakiHewan){
		jumlahKaki = jumlahKakiHewan;
	}
	public int getJumlahKaki (){
		System.out.println("Jumlah kaki hewan " + jumlahKaki);
		return jumlahKaki;
	}
	public void setUmur (int umurHewan){
		umur = umurHewan;
	}
	public int getUmur (){
		System.out.println("Umur hewan " + umur);
		return umur;
	}
	public void berbunyi(){
		System.out.println("Hewan dapat berbunyi");
	}
	public void berjalan(){
		System.out.println("Hewan dapat berjalan");
	}
	public static void main(String[]args) {
		Hewan kucing = new Hewan ();
		kucing.setUmur(3);
		kucing.getUmur();
		kucing.setJumlahKaki(4);
		kucing.getJumlahKaki();
		kucing.berbunyi();
		kucing.berjalan();
	}
}