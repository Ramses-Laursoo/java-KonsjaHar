//Koostaja: Ramses Laursoo, IS20
//Konspekt: 11
//�lesanne: Java - �lem- ja alamklassid
package zoo;
 	//extends m��rab selle klassi (Imetaja) �lemklassi (Loom)
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
	
	//�lekirjutab alamklassis samanimelist meetodit, mis on �lemklassis, �le kirjutada
	@Override
	public void temp(){
	System.out.println("k�igusoojane");
	}
 
}