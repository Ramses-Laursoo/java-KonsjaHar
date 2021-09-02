package konspektid;

public class konspekt4 {

	public static void main(String[] args) {
		/*
		 massiiv (array) (põhiline mida kaustame)
		 loend (list)
		 hulk (set)
		 magasin (stack)
		 sõnastik (map)
		 järjekord (queue)
		 */
		
		//Nimede (stringide) massiiv
		String[] nimed = {"Kati", "Mati", "Jüri", "Mari", "Malle", "Kalle"};
		//Massiivis on Kati 0, Mati 1, Jüri 2, jne
		int nimedKokku = nimed.length;
		//String viimaneNimi = nimed[nimedKokku-1]; leiab alati viimase elemendi massiivis
		System.out.println("Nimesid on kokku "+nimedKokku);
		//Vanuse (arvude) massiiv
		//int[] vanused1 = {17, 21, 36, 20, 16, 9};
		int suvArv = (int) Math.floor(Math.random()*6);
		System.out.println(nimed[suvArv]);
		
		//Massiivi pikkuse määramine
		int[] juustePikkused = new int[6];
		//Lisame massiivi väärtuseid
		juustePikkused[0] = 30;
		juustePikkused[1] = 45;
		juustePikkused[2] = 76;
		juustePikkused[3] = 11;
		juustePikkused[4] = 4;
		juustePikkused[5] = 18;
		int suvArv2 = (int) Math.floor(Math.random()*6);
		System.out.println("Juuste pikkus on "+juustePikkused[suvArv2]);
		
		//Väljastab kõik elemendid
		for (int i = 0; i < nimed.length; i++) {
		System.out.println(nimed[i]);
		}
		
		//Kahe massivi ühes (mitmemõõtmeline)
		String[][] nimed2 = { {"Kati2", "Mari2", "Malle2"}, {"Mati2", "Jüri2", "Kalle2" } };
		System.out.println(nimed2[1][0]);
		//Väljastab kõik elemendid, alustates ridatest
		for (int i = 0; i < nimed2.length; i++) {
		//Veerud
		for (int j = 0; j < nimed2[i].length; j++) {
		System.out.println(nimed2[i][j]);
		}
		}
		
		String[][] nimed3 = { {"Kati", "Mari", "Malle"},{"Mati", "Jüri", "Kalle"} };
		System.out.println("Mehi kokku: "+nimed3[1].length);
		System.out.println("Kõik kokku: "+(nimed3[0].length+nimed3[1].length));
		
		int[][] vanused2 = new int[4][3]; //Tabel millel on 4 rida (y) ja 3 veergu (x)
		//Esimene rida
		vanused2[0][0] = 3;
		vanused2[0][1] = 15;
		vanused2[0][2] = 5;
		//Teine rida
		vanused2[1][0] = 3;
		vanused2[1][1] = 7;
		vanused2[1][2] = 20;
		//Kolmas rida
		vanused2[2][0] = 11;
		vanused2[2][1] = 17;
		vanused2[2][2] = 10;
		//Neljas rida
		vanused2[3][0] = 15;
		vanused2[3][1] = 20;
		vanused2[3][2] = 17;
		 
		System.out.println(vanused2[1][2]);
		

		String[][] nimed4 = { {"Kati", "Mari", "Malle"},{"Mati","Jüri","Kalle"} };
		//Käib read läbi
		for (int i = 0; i < nimed4.length; i++) {
		//Käime läbi veerud
		for (int j = 0; j < nimed4[i].length; j++) {
		System.out.println(nimed4[i][j]);
		}
		}
	}

}
