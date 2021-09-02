//Koostaja: Ramses Laursoo, IS20
//Konspekt: 9
//Ülesanne: Java - Meetodid, klassid ja objektid
package konspektid;

public class ufo {
	//isendimuutujad
	public String nimi;
	public int vanus;
	
	//Konstruktor
	public ufo(String n, int v){
		this.nimi = n;
		this.vanus = v;
	}
	
	//Konstruktorite ülelaadimine
	public void Ufo(){
		this.nimi = "<tundmatu>";
		this.vanus = 0;
		}
	
	//isendimeetodid
	public void tutvustaEnd(){
		System.out.println("Mina olen "+nimi+". "+vanus+"! Tulen rahus!");
	}
}
