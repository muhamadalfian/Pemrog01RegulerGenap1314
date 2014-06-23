package praktikum14e.bin;

public class TestMobil{
	public static void main(String[] alfian){
		Mobil mobil = new Mobil(){
	public void injakPedalGas(){
		System.out.println("mobil berjalan...");
	}
	};
		Kijang kijang = new Kijang();
		BMW bmw = new BMW();
		mobil.injakPedalGas();
		mobil = kijang;
		mobil.injakPedalGas();
		mobil = bmw;
		mobil.injakPedalGas();
	}
}