public class KonversiYen{
	public String KonversiYen;
	public double vlyen;
	private int ValueYen;
	private double KonversiNilai;
	private String KonversiInput;

	public KonversiYen(){

	}

	public String KonversiYen(){
		return KonversiYen;
	}

	public String KonversiInput(String knvinput){
		KonversiInput = knvinput;
	    return KonversiInput;
    }

    public String getKonversiInput(){
		System.out.println(KonversiInput);
		return KonversiInput;
	}

	public void setValueYen(int styen){
		ValueYen = styen;
		vlyen = 113.04;
	}

	public double getValueYen(){
		vlyen = vlyen * ValueYen;
		System.out.println(vlyen);
		return vlyen;
	}
}