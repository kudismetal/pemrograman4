public class KonversiDollar{
	public String KonversiDollar;
	public double vldollar;
	private int ValueDollar;
	private double KonversiNilai;
	private String KonversiInput;

	public KonversiDollar(){

	}

	public String KonversiDollar(){
		return KonversiDollar;
	}

	public String KonversiInput(String knvinput){
		KonversiInput = knvinput;
	    return KonversiInput;
    }

    public String getKonversiInput(){
		System.out.println(KonversiInput);
		return KonversiInput;
	}

	public void setValueDollar(int stdollar){
		ValueDollar = stdollar;
		vldollar = 11437;
	}

	public double getValueDollar(){
		vldollar = vldollar * ValueDollar;
		System.out.println(vldollar);
		return vldollar;
	}
}