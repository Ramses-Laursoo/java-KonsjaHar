package konspektid;
import java.util.Scanner;

public class konspekt5 {

	public static void main(String[] args) {
		//char'i kasutamine (�ks m�rk Unicode tabelist)
		char m2rk = 'G';
		char kood = 65;
		char[] m2rgid = {'a','b','c','d','e'};
		System.out.println(m2rk);
		System.out.println(kood);
		System.out.println(m2rgid[4]);
		
		//Erim�rgid ja nende kasutus
		char uusRida = '\n';
		System.out.println("See " + uusRida + "murrab (rea)!");
		/*
		 \' �ksik jutum�rk
		 \" kaks jutum�rki
		 \\ backslash
		 \t tab
		 \b backspace
		 \r carriage return
		 \f formfeed
		 \n new line
		 */
		
		
		//S�nede liitmine/kasutamine
		String sone = "Tere Maailm!";
		System.out.println(sone);
		
		//K�sib kasutaja sisestust (�leval on olemas import)
		//Tean, et scanner ei ole kinni pantud, aga minu arusaamisest pole m�tet seda parandada
		Scanner scanner = new Scanner (System.in);
		System.out.println("Sisesta oma nimi: ");
		//Lisab sisestuse s�ne muutujasse
		String nimi = scanner.nextLine();
		//Lisab sisestuse t�isarvu muutujasse
		System.out.println("Sisesta oma vanus: ");
		int vanus = scanner.nextInt();
		System.out.println("Tere " + nimi + ", " + vanus + "!");
		
		
		//printf ja vormindamine
		//Teksti vormindamine
		String nimi2 = "Mari";
		//V�ljund: Meie Mari on nii nooruslik!
		System.out.printf("Meie %s on nii nooruslik!", nimi2);
		//V�ljund: Meie Mari Maasikas on nii nooruslik!
		System.out.printf("\n Meie %s %s on nii nooruslik!", nimi2, "Maasikas");
		
		
		//T�isarvude vormindamine
		int arv1 = 6;
		int arv2 = 7;
		String uhik = "tk";
		//V�ljund: 6 + 7 = 13tk
		System.out.printf("\n %d + %d = %d%s", arv1, arv2, arv1+arv2, uhik);
		
		
		//Pesade laius
		String[] ained = {"Eesti keel", "Matemaatika", "Kirjandus"};
		int[] hinded = {4, 5, 3};
		System.out.println("");
		for (int i = 0; i < hinded.length; i++) {
		//V�ljund:          Eesti keel 4         Matemaatika 5           Kirjandus 3
		System.out.printf("%20s %d",ained[i], hinded[i]);
		}
		
		
		String[] ained2 = {"Eesti keel", "Matemaatika", "Kirjandus"};
		int[] hinded2 = {4, 5, 3};
		System.out.println("");
		for (int i = 0; i < hinded2.length; i++) {
		//V�ljund: Eesti keel		 4        
		//	       Matemaatika		 5           
		//	       Kirjandus 		 3
		System.out.printf("%-20s %d%n",ained2[i], hinded2[i]);
		}
		
		
		//Ujukomaarvude vormindamine
		//V�ljund: 123.4560000
		System.out.printf("%f",123.456);
		//V�ljund: 123.46
		System.out.printf("%n%.2f",123.456);
		//V�ljund: 		123.456000
		System.out.printf("%n%15f",123.456);
		//V�ljund: 			123.46
		System.out.printf("%n%15.2f",123.456);
		
		
		//S�nede t��tlemine (meetodid)
		/*length() � leiab m�rkide arvu s�nes
		charAt() � kuvab s�mboli vastavalt antud indeksile
		substring() � v�imaldab kuvada tekstist mingi osa. Kui lisad ainult �he indeksi, siis kuvatakse alates sellest kuni l�puni. Lisades kaks indeksit, saad m��rata nii alguse kui ka l�pu.
		indexOf() � leiab m�rgi v�i terve s�ne asukoha tekstis. Lisades indeksi, saad m��rata, alates mitmendast m�rgist otsimist alustatakse
		toLowerCase() � muudab v�iket�htedeks
		toUpperCase() � muudab suurt�htedeks
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
		
		
		//S�ne teisendamine arvuks ja vastupidi
		String id = "50801100182";
		int esimeneNr = Integer.parseInt(id.substring(0,1)); //teisendame t�isarvuks
		String esimeneT2ht = Integer.toString(esimeneNr); //teisendame s�neks
		System.out.println(esimeneNr);
		System.out.println(esimeneT2ht);
		
		float ujukoma = Float.parseFloat("25");
		String sone2 = Float.toString(25.0f);
		System.out.println(ujukoma);
		System.out.println(sone2);
	}

}
