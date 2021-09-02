//Koostaja: Ramses Laursoo, IS20
//Konspekt: 11
//Ülesanne: Java - Ülem- ja alamklassid
package zoo;
 	//extends määrab selle klassi (Imetaja) ülemklassi (Loom)
	public class Imetaja extends Loom{
 
	private String nimi;
 
	public Imetaja(String nimi) {
		this.nimi = nimi;
	}
		
	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
		}
	
	public void haugu(){
		System.out.println("Auh auh");
	}
	
	//Ülekirjutab alamklassis samanimelist meetodit, mis on ülemklassis, üle kirjutada
	@Override
	public void temp(){
	System.out.println("kõigusoojane");
	}
 
}