//Koostaja: Ramses Laursoo, IS20
//Konspekt: 10
//Ülesanne: Java - Klasside omavahelised seosed
package bussireisid;

public class Liin {
	
	public String LahteKoht;
	public String SihtKoht;
	public int LiiniNumber;

	public Liin() {
		LahteKoht="<puudub>";
	}
	
	public Liin(String LahteKoht) {
		this.LahteKoht = LahteKoht;
	}

	public String getLahteKoht() {
		return LahteKoht;
	}

	public void setLahteKoht(String LahteKoht) {
		this.LahteKoht = LahteKoht;
	}

	public Liin(String a,String b, int c){
		this.LahteKoht = a;
		this.SihtKoht = b;
		this.LiiniNumber = c;
	}
	/*
	public Liin2() {
		SihtKoht="<puudub>";
	}
	
	public Liin2(String SihtKoht) {
		this.SihtKoht = SihtKoht;
	}
	*/
	public String getSihtKoht() {
		return SihtKoht;
	}

	public void setSihtKoht(String SihtKoht) {
		this.SihtKoht = SihtKoht;
	}
	
}