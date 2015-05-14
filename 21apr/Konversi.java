public class Konversi{
	public static void main(String[]args){
		KonversiDollar knvdollar = new KonversiDollar();
		knvdollar.KonversiInput("Mata Uang United States Dollar (USD)");
		knvdollar.getKonversiInput();
		knvdollar.setValueDollar(4);
		knvdollar.getValueDollar();

		KonversiYen knvyen = new KonversiYen();
		knvyen.KonversiInput("Mata Uang Japanese Yen (JPY)");
		knvyen.getKonversiInput();
		knvyen.setValueYen(2);
		knvyen.getValueYen();

		KonversiReal knvreal = new KonversiReal();
		knvreal.KonversiInput("Mata Uang Saudi Arabian Real (SAR)");
		knvreal.getKonversiInput();
		knvreal.setValueReal(2);
		knvreal.getValueReal();
	}
}