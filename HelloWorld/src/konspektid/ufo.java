//Koostaja: Ramses Laursoo, IS20
//Konspekt: 9
//�lesanne: Java - Meetodid, klassid ja objektid
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
	
	//Konstruktorite �lelaadimine
	public void Ufo(){
		this.nimi = "<tundmatu>";
		this.vanus = 0;
		}
	
	//isendimeetodid
	public void tutvustaEnd(){
		System.out.println("Mina olen "+nimi+". "+vanus+"! Tulen rahus!");
	}
}
