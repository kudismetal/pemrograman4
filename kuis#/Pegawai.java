public class Pegawai{
	private String id_pegawai;
	private String nama_pegawai;
	private String jabatan;
	int gaji;

	public Pegawai(){

	}

	public void setID_pegawai(String idPgw){
		id_pegawai = idPgw;
	}

	public String getID_pegawai(){
		System.out.println("ID Pegawai : " + id_pegawai);
		return id_pegawai;
	}

	public void setNama_pegawai(String nmPgw){
		nama_pegawai = nmPgw;
	}

	public String getNama_pegawai(){
		System.out.println("Nama Pegawai : " + nama_pegawai);
		return nama_pegawai;
	}

	public void setJabatan(String jbPgw){
		jabatan = jbPgw;
	}

	public String getJabatan(){
		System.out.println("Jabatan : " + jabatan);
		return jabatan;
	}

	public int gaji(){
		gaji = 2000000;
		System.out.println("Gaji : " + gaji);
		return gaji;
	}

	public int gaji(int gjPgw, int tambahan){
		gaji = gjPgw + tambahan;
		System.out.println("Gaji : " + gjPgw + " + " + tambahan + " = " + gaji);
		return gaji;
	}

	public static void main(String[]args){
		Pegawai sisatu = new Pegawai();
		sisatu.setID_pegawai("001");
		sisatu.getID_pegawai();
		sisatu.setNama_pegawai("Pegawai Satu");
		sisatu.getNama_pegawai();
		sisatu.setJabatan("Sekretaris");
		sisatu.getJabatan();
		sisatu.gaji();
		sisatu.gaji(2000000, 1000000);
	}
}