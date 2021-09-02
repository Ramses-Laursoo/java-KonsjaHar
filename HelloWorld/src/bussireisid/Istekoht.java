//Koostaja: Ramses Laursoo, IS20
//Konspekt: 10
//Ülesanne: Java - Klasside omavahelised seosed
package bussireisid;

public class Istekoht {
	
	public String Koht;
	public int Koht2;
	

	public Istekoht() {
		Koht="<puudub>";
	}
	
	public Istekoht(String Koht) {
		this.Koht = Koht;
	}

	public String getKoht() {
		return Koht;
	}

	public void setKoht(String Koht) {
		this.Koht = Koht;
	}
	
	public Istekoht(int a){
		this.Koht2 = a;
	}

	public void setKoht2(int Koht2) {
		this.Koht2 = Koht2;
	}

	public int getKoht2() {
		return Koht2;
	}
	
}