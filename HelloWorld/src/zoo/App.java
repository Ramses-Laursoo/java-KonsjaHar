//Koostaja: Ramses Laursoo, IS20
//Konspekt: 11
//�lesanne: Java - �lem- ja alamklassid
package zoo;
 
public class App {
 
	public static void main(String[] args) {
 
	//objekt
	Imetaja koer = new Imetaja("Pauka");

	//p�hiklassist
	koer.setSugu("M");
	System.out.println("Sugu: "+koer.sugu);
	koer.toit();
	koer.temp();

	//alamklassist
	koer.setNimi("Pauka");
	System.out.println("Nimi: "+koer.getNimi());
	koer.haugu(); 
	}
}
