public class KonversiReal{
	public String KonversiReal;
	public double vlreal;
	private int ValueReal;
	private double KonversiNilai;
	private String KonversiInput;

	public KonversiReal(){

	}

	public String KonversiReal(){
		return KonversiReal;
	}

	public String KonversiInput(String knvinput){
		KonversiInput = knvinput;
	    return KonversiInput;
    }

    public String getKonversiInput(){
		System.out.println(KonversiInput);
		return KonversiInput;
	}

	public void setValueReal(int streal){
		ValueReal = streal;
		vlreal = 3168;
	}

	public double getValueReal(){
		vlreal = vlreal * ValueReal;
		System.out.println(vlreal);
		return vlreal;
	}
}