//Koostaja: Ramses Laursoo, IS20
//Konspekt: 9
//�lesanne: Java - Meetodid, klassid ja objektid
package konspektid;
import java.util.Scanner;

public class konspekt9 {

	public static void main(String[] args) {
		//Meetod
		kuubiRuumala(4,5,6);
		
		minuTsykkel();
		
		System.out.println(leiaSumma(1,2,3,4,5,6));
		
		tervita("Karin", 18);
		tervita("Karin", "Eegreid");
		tervita("Karin");
				
		Scanner scanner = new Scanner (System.in);
		System.out.print("R��pk�liku pindala (1) \nRistk�liku pindala (2) \nKolmnurga pindala (3)\nVali tegevus: "); 
		String valik = scanner.next();
		System.out.print("Sisesta alus: ");
		String alus = scanner.next();
		System.out.print("Sisesta k�rgus: ");
		String korgus = scanner.next();
		double s;
		switch (Integer.parseInt(valik)) {
		//Valides nr.1 saad r��pk�liku pindala arvutata
		case 1:
		s = Pindalad.roopkylikS(alus, korgus);
		System.out.printf("R��pk�liku pindala on %.2f ",s);
		break;
		//Valides nr.2 saad ristk�liku pindala arvutata
		case 2:
		s = Pindalad.ristkylikS(alus, korgus);
		System.out.printf("Ristk�liku pindala on %.2f ",s);
		break;
		//Valides nr.3 saad kolmnurga pindala arvutata
		case 3:
		s = Pindalad.kolmnurkS(alus, korgus);
		System.out.printf("Kolmnurga pindala on %.2f ",s);
		break;
		//Vale valiku korral saad teavituse sellest
		default:
		System.out.print("Valikust arusaamine eba�nnestus!");
		break;
		}
		
		//Need enam ei t��ta, kuna need pole konstruktoris defineeritud, aga neid pole vaja
		/*
		ufo tyyp1 = new ufo();
		tyyp1.nimi = "XZXZXX";
		tyyp1.vanus = 765;
		tyyp1.tutvustaEnd();

		ufo tyyp2 = new ufo();
		tyyp2.nimi = "���L�";
		tyyp2.vanus = 385;
		tyyp2.tutvustaEnd();
		*/
		
		//Konstruktoriga ufo v�lja kutsumine
		 ufo tyyp3 = new ufo("XZXZXX", 765);
		 tyyp3.tutvustaEnd();
		
		}
	
	public static void kuubiRuumala(int a, int b, int c) {
		int v = a * b * c;
		System.out.printf("Kuubi ruumala: %d", v);
		}
	

	 
	/*
	Meetodid:
	public� on nn. ligip��su modifikaator. V�imaldab ligip��su igast klassist. Lisaks sellele on olemas veel:
		private� ligip��setav ainult sama klassi p�hiselt
		protected� v�imaldab liigip��se k�ikidele klassidele samas paketis v�i kui nad laiendavad klassi, siis ka teise paketi klassidele.
		default� vaikimisi, kui j�tad n�htavuse deklareerimata. Sel juhul on ligip��s igast klassist, mis asub samas paketis.
		static� lisame, kui soovime, et tegemist on klassi meetodiga. Muul juhul on tegemist instantsi meetodiga ehk kasutame siis kui loome objekte.
		void� tagastust��p. Kuna meetod midagi ise ei tagasta ja lihtsalt tr�kib tulemust,
		siis see n�itabki seda. Kui meie meetod peaks v�ljastama n�iteks arve v�i teksti, siis kasutaksime tagastust��bina vastavalt int, float, double, String jne.
	 */
	
	
	//Meetodi loomine Eclipse'is
	private static void minuTsykkel() {
		for(int i=1 ; i <= 5 ; i++) {
			System.out.println("I = " + i);
		}
	}
	
	
	//Teadmata hulk atribuute
	private static int leiaSumma(int... arvud) {
		int kokku = 0;
		for(int arv:arvud) {
			kokku= kokku+arv;
		}
		return kokku;
	}
	
	
	//Parameetrite �let�ituvus (overload)
	private static void tervita(String nimi) {
		System.out.println("Tere "+nimi);
	}

	private static void tervita(String nimi, String perenimi) {
		System.out.println("Tere "+nimi+" "+perenimi);
	}
	
	private static void tervita(String nimi, int vanus) {
		System.out.println("Tere "+nimi+". "+vanus);
	}
	
	
	//Klass
	//Selle jaoks tehti Pindalad.java klass
	
	
	//Klassi nime muutmine
	//Refractor > Rename...
	
	
	//Objekti loomine ja kasutamine
	//Selle jaoks tehti ufo.java klass
	/*
	klass � on nagu mall v�i �hine reegel, mille j�rgi objekte luuakse
	isendimuutujad � ehk v�ljad, mis kirjeldavad antud objekti
	isendimeetodid � ehk konkreetse objekti tegevused
	*/
	
	
	//Konstruktor
	//Selle jaoks kasutati edasi ufo.java klassi
	
	
	//Konstruktorite �lelaadimine
	//Selle jaoks kasutati edasi ufo.java klassi
	//Peatab �lelaadimist
}
