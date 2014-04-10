//created By:muhamad alfian nur
//date		: 10 april 2014
package Praktikum03d.bin;
public class DemoVariabel {
	public static void main(String[]alfian){
		int x=10;
		System.out.println("nilai x adalah " +x);
		char z='a';
		System.out.println("nilai z adalah " +z);
		
		//isi data ke tipe yang tidak tepat
		int y=z;
		System.out.println("nilai y adalah " +y);
		
		//tidak bisa compile (error)
		//char w=x;
		//System.out.println("nilai w adalah " +x);
		
		//type casting
		char v=(char) x;
		System.out.println("nilai v adalah " +v);
		System.out.println("baris selanjutnya??");	
	}
	public static void coba() {
		//System.out.println("nilai v adalah " +v);
	}
}