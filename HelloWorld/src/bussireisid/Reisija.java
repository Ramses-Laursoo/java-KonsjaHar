//Koostaja: Ramses Laursoo, IS20
//Konspekt: 10
//Ülesanne: Java - Klasside omavahelised seosed
package bussireisid;

public class Reisija {

	private String nimi;
		
		public Reisija() {
		nimi="<puudub>";
		}
		
		public Reisija(String nimi) {
		this.nimi = nimi;
		}

		public String getNimi() {
			return nimi;
		}

		public void setNimi(String nimi) {
			this.nimi = nimi;
		}
}
