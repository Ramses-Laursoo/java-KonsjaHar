package konspektid;
import java.util.Scanner;

public class konspekt5 {

	public static void main(String[] args) {
		//char'i kasutamine (üks märk Unicode tabelist)
		char m2rk = 'G';
		char kood = 65;
		char[] m2rgid = {'a','b','c','d','e'};
		System.out.println(m2rk);
		System.out.println(kood);
		System.out.println(m2rgid[4]);
		
		//Erimärgid ja nende kasutus
		char uusRida = '\n';
		System.out.println("See " + uusRida + "murrab (rea)!");
		/*
		 \' üksik jutumärk
		 \" kaks jutumärki
		 \\ backslash
		 \t tab
		 \b backspace
		 \r carriage return
		 \f formfeed
		 \n new line
		 */
		
		
		//Sõnede liitmine/kasutamine
		String sone = "Tere Maailm!";
		System.out.println(sone);
		
		//Küsib kasutaja sisestust (üleval on olemas import)
		//Tean, et scanner ei ole kinni pantud, aga minu arusaamisest pole mõtet seda parandada
		Scanner scanner = new Scanner (System.in);
		System.out.println("Sisesta oma nimi: ");
		//Lisab sisestuse sõne muutujasse
		String nimi = scanner.nextLine();
		//Lisab sisestuse täisarvu muutujasse
		System.out.println("Sisesta oma vanus: ");
		int vanus = scanner.nextInt();
		System.out.println("Tere " + nimi + ", " + vanus + "!");
		
		
		//printf ja vormindamine
		//Teksti vormindamine
		String nimi2 = "Mari";
		//Väljund: Meie Mari on nii nooruslik!
		System.out.printf("Meie %s on nii nooruslik!", nimi2);
		//Väljund: Meie Mari Maasikas on nii nooruslik!
		System.out.printf("\n Meie %s %s on nii nooruslik!", nimi2, "Maasikas");
		
		
		//Täisarvude vormindamine
		int arv1 = 6;
		int arv2 = 7;
		String uhik = "tk";
		//Väljund: 6 + 7 = 13tk
		System.out.printf("\n %d + %d = %d%s", arv1, arv2, arv1+arv2, uhik);
		
		
		//Pesade laius
		String[] ained = {"Eesti keel", "Matemaatika", "Kirjandus"};
		int[] hinded = {4, 5, 3};
		System.out.println("");
		for (int i = 0; i < hinded.length; i++) {
		//Väljund:          Eesti keel 4         Matemaatika 5           Kirjandus 3
		System.out.printf("%20s %d",ained[i], hinded[i]);
		}
		
		
		String[] ained2 = {"Eesti keel", "Matemaatika", "Kirjandus"};
		int[] hinded2 = {4, 5, 3};
		System.out.println("");
		for (int i = 0; i < hinded2.length; i++) {
		//Väljund: Eesti keel		 4        
		//	       Matemaatika		 5           
		//	       Kirjandus 		 3
		System.out.printf("%-20s %d%n",ained2[i], hinded2[i]);
		}
		
		
		//Ujukomaarvude vormindamine
		//Väljund: 123.4560000
		System.out.printf("%f",123.456);
		//Väljund: 123.46
		System.out.printf("%n%.2f",123.456);
		//Väljund: 		123.456000
		System.out.printf("%n%15f",123.456);
		//Väljund: 			123.46
		System.out.printf("%n%15.2f",123.456);
		
		
		//Sõnede töötlemine (meetodid)
		/*length() – leiab märkide arvu sõnes
		charAt() – kuvab sümboli vastavalt antud indeksile
		substring() – võimaldab kuvada tekstist mingi osa. Kui lisad ainult ühe indeksi, siis kuvatakse alates sellest kuni lõpuni. Lisades kaks indeksit, saad määrata nii alguse kui ka lõpu.
		indexOf() – leiab märgi või terve sõne asukoha tekstis. Lisades indeksi, saad määrata, alates mitmendast märgist otsimist alustatakse
		toLowerCase() – muudab väiketähtedeks
		toUpperCase() – muudab suurtähtedeks
		*/
		String tekst = "Lorem iPsum";
		System.out.println(tekst.length()); //11
		System.out.println(tekst.charAt(0)); //L
		System.out.println(tekst.substring(1)); //orem iPsum
		System.out.println(tekst.substring(2,5)); //rem
		System.out.println(tekst.indexOf("m")); //4
		System.out.println(tekst.indexOf("m",5)); //10
		System.out.println(tekst.toLowerCase()); //lorem ipsum
		System.out.println(tekst.toUpperCase()); //LOREM IPSUM
		
		
		//Sõne teisendamine arvuks ja vastupidi
		String id = "50801100182";
		int esimeneNr = Integer.parseInt(id.substring(0,1)); //teisendame täisarvuks
		String esimeneT2ht = Integer.toString(esimeneNr); //teisendame sõneks
		System.out.println(esimeneNr);
		System.out.println(esimeneT2ht);
		
		float ujukoma = Float.parseFloat("25");
		String sone2 = Float.toString(25.0f);
		System.out.println(ujukoma);
		System.out.println(sone2);
	}

}
