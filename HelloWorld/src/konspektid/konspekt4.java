package konspektid;

public class konspekt4 {

	public static void main(String[] args) {
		/*
		 massiiv (array) (p�hiline mida kaustame)
		 loend (list)
		 hulk (set)
		 magasin (stack)
		 s�nastik (map)
		 j�rjekord (queue)
		 */
		
		//Nimede (stringide) massiiv
		String[] nimed = {"Kati", "Mati", "J�ri", "Mari", "Malle", "Kalle"};
		//Massiivis on Kati 0, Mati 1, J�ri 2, jne
		int nimedKokku = nimed.length;
		//String viimaneNimi = nimed[nimedKokku-1]; leiab alati viimase elemendi massiivis
		System.out.println("Nimesid on kokku "+nimedKokku);
		//Vanuse (arvude) massiiv
		//int[] vanused1 = {17, 21, 36, 20, 16, 9};
		int suvArv = (int) Math.floor(Math.random()*6);
		System.out.println(nimed[suvArv]);
		
		//Massiivi pikkuse m��ramine
		int[] juustePikkused = new int[6];
		//Lisame massiivi v��rtuseid
		juustePikkused[0] = 30;
		juustePikkused[1] = 45;
		juustePikkused[2] = 76;
		juustePikkused[3] = 11;
		juustePikkused[4] = 4;
		juustePikkused[5] = 18;
		int suvArv2 = (int) Math.floor(Math.random()*6);
		System.out.println("Juuste pikkus on "+juustePikkused[suvArv2]);
		
		//V�ljastab k�ik elemendid
		for (int i = 0; i < nimed.length; i++) {
		System.out.println(nimed[i]);
		}
		
		//Kahe massivi �hes (mitmem��tmeline)
		String[][] nimed2 = { {"Kati2", "Mari2", "Malle2"}, {"Mati2", "J�ri2", "Kalle2" } };
		System.out.println(nimed2[1][0]);
		//V�ljastab k�ik elemendid, alustates ridatest
		for (int i = 0; i < nimed2.length; i++) {
		//Veerud
		for (int j = 0; j < nimed2[i].length; j++) {
		System.out.println(nimed2[i][j]);
		}
		}
		
		String[][] nimed3 = { {"Kati", "Mari", "Malle"},{"Mati", "J�ri", "Kalle"} };
		System.out.println("Mehi kokku: "+nimed3[1].length);
		System.out.println("K�ik kokku: "+(nimed3[0].length+nimed3[1].length));
		
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
		

		String[][] nimed4 = { {"Kati", "Mari", "Malle"},{"Mati","J�ri","Kalle"} };
		//K�ib read l�bi
		for (int i = 0; i < nimed4.length; i++) {
		//K�ime l�bi veerud
		for (int j = 0; j < nimed4[i].length; j++) {
		System.out.println(nimed4[i][j]);
		}
		}
	}

}
