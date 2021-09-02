package konspektid;

public class konspekt6 {

	public static void main(String[] args) {
		/*
		 m>n  = m on suurem kui n
		 m>=n = m on suurem või võrdne n'ga
		 m<n  = m on väiksem kui n
		 m<=n = m on väiksem või võrdne n'ga
		 m==n = m ja n on võrdsed
		 m!=n = m ei ole võrdne n'ga
		 */
		//Tingimuslause IF
		int pikkus = 203;
		if (pikkus>=200) {
		//Kui pikkus on väiksem/suurem kui või võrdne 200'ga, väljastab sobiva sõnumi
		System.out.println("Täitsa pikk poiss");
		} else {
		System.out.println("Liiga lühike");
		}
		//Sõltuvalt punkti summast annab erineva vastuse
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
		//Jagab kahega ja siis leiab kas on olemas jääk, et teada kas on olemas paaris arv
		int arv = 7;
		if (arv%2 == 0) {
		System.out.println("Paaris");
		} else {
		System.out.println("Paaritu");
		}
		
		
		//Mitu valikut AND
		int arv2 = 16;
		//Arv peab olema suurem kui või võrdne 15'ga, kuid väiksem või võrdne 18'ga
		if (arv2>=15 && arv <=18) {
		System.out.println("Sobib!");
		} else {
		System.out.println("Ei sobi.");
		}
		
		
		//Üks valikust OR
		int vanus = 19;
		int sunniaasta = 1999;
		//Vanus peab olema 18 VÕI sünniaasta peab olema 2000
		if (vanus>=18 || sunniaasta>=2000) {
		System.out.println("Sobib!");
		}
		
		
		//Sõnede võrdlemine
		String roll = "kasutaja";
		if (roll.equals("admin")) {
		System.out.println("Tere admin!");
		} else {
		System.out.println("Tere kasutaja!");
		//Eitamise jaoks pane roll'i ette hüüumärk (!roll.equals)
		}
		
		
		//Eriti lühike IF
		int arv3 = -5;
		String tulemus = arv3 >= 0 ? "Sobib" : "Liiga väike";
		System.out.println(tulemus);
		
		
		//SWITCH lause
		//SWITCH'i on kasutatud if-elseif-else lausete asemel
		int hinne = 4;
		switch (hinne) {
		case 5: System.out.println("Väga hea");
		break;
		case 4: System.out.println("Hea");
		break;
		case 3: System.out.println("Rahuldav");
		break;
		default: System.out.println("Kasin");
		}
		
		
		//Tsükkel FOR
		//Tsükkel jookseb 10 korda ja väljastab oma teksti
		for (int i = 1; i <= 10; i++) {
			System.out.println(i+". Hello world!");
		}
		
		String[] nimed = {"Kati", "Mati", "Jüri", "Mari", "Malle", "Kalle"};
		for (int i = 0; i < nimed.length; i++) {
			System.out.println(i+1+". "+nimed[i]);
		}
		
		
		//Tsükkel tsüklis
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
				}
			System.out.println("*");
		}
		
		
		//foreach tsükkel
		String[] nimed2 = {"Kati", "Mati", "Jüri", "Mari", "Malle", "Kalle"};
		for (String t : nimed2) {
			System.out.println(t);
		}
		
		
		//Tsükkel WHILE
		//for tsüklile sarnane kuid muutuja algväärtus on väljaspool blokki
		int arv4 = 1;
		while(arv4<=10) {
			System.out.println(arv4);
			arv4++;
		}
	}
}
