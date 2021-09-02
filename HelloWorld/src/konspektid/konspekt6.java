package konspektid;

public class konspekt6 {

	public static void main(String[] args) {
		/*
		 m>n  = m on suurem kui n
		 m>=n = m on suurem v�i v�rdne n'ga
		 m<n  = m on v�iksem kui n
		 m<=n = m on v�iksem v�i v�rdne n'ga
		 m==n = m ja n on v�rdsed
		 m!=n = m ei ole v�rdne n'ga
		 */
		//Tingimuslause IF
		int pikkus = 203;
		if (pikkus>=200) {
		//Kui pikkus on v�iksem/suurem kui v�i v�rdne 200'ga, v�ljastab sobiva s�numi
		System.out.println("T�itsa pikk poiss");
		} else {
		System.out.println("Liiga l�hike");
		}
		//S�ltuvalt punkti summast annab erineva vastuse
		int punktid = 70;
		if (punktid >= 90) {
		System.out.println("hinne: 5");
		} else if(punktid >=70) {
		System.out.println("hinne: 4");
		} else if(punktid >=50) {
		System.out.println("hinne: 3");
		} else {
		System.out.println("hinne: 2");
		}
		//Jagab kahega ja siis leiab kas on olemas j��k, et teada kas on olemas paaris arv
		int arv = 7;
		if (arv%2 == 0) {
		System.out.println("Paaris");
		} else {
		System.out.println("Paaritu");
		}
		
		
		//Mitu valikut AND
		int arv2 = 16;
		//Arv peab olema suurem kui v�i v�rdne 15'ga, kuid v�iksem v�i v�rdne 18'ga
		if (arv2>=15 && arv <=18) {
		System.out.println("Sobib!");
		} else {
		System.out.println("Ei sobi.");
		}
		
		
		//�ks valikust OR
		int vanus = 19;
		int sunniaasta = 1999;
		//Vanus peab olema 18 V�I s�nniaasta peab olema 2000
		if (vanus>=18 || sunniaasta>=2000) {
		System.out.println("Sobib!");
		}
		
		
		//S�nede v�rdlemine
		String roll = "kasutaja";
		if (roll.equals("admin")) {
		System.out.println("Tere admin!");
		} else {
		System.out.println("Tere kasutaja!");
		//Eitamise jaoks pane roll'i ette h��um�rk (!roll.equals)
		}
		
		
		//Eriti l�hike IF
		int arv3 = -5;
		String tulemus = arv3 >= 0 ? "Sobib" : "Liiga v�ike";
		System.out.println(tulemus);
		
		
		//SWITCH lause
		//SWITCH'i on kasutatud if-elseif-else lausete asemel
		int hinne = 4;
		switch (hinne) {
		case 5: System.out.println("V�ga hea");
		break;
		case 4: System.out.println("Hea");
		break;
		case 3: System.out.println("Rahuldav");
		break;
		default: System.out.println("Kasin");
		}
		
		
		//Ts�kkel FOR
		//Ts�kkel jookseb 10 korda ja v�ljastab oma teksti
		for (int i = 1; i <= 10; i++) {
			System.out.println(i+". Hello world!");
		}
		
		String[] nimed = {"Kati", "Mati", "J�ri", "Mari", "Malle", "Kalle"};
		for (int i = 0; i < nimed.length; i++) {
			System.out.println(i+1+". "+nimed[i]);
		}
		
		
		//Ts�kkel ts�klis
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
				}
			System.out.println("*");
		}
		
		
		//foreach ts�kkel
		String[] nimed2 = {"Kati", "Mati", "J�ri", "Mari", "Malle", "Kalle"};
		for (String t : nimed2) {
			System.out.println(t);
		}
		
		
		//Ts�kkel WHILE
		//for ts�klile sarnane kuid muutuja algv��rtus on v�ljaspool blokki
		int arv4 = 1;
		while(arv4<=10) {
			System.out.println(arv4);
			arv4++;
		}
	}
}
