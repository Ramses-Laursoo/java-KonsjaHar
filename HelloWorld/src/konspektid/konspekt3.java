package konspektid;

public class konspekt3 {

	public static void main(String[] args) {
		/*
		 + = liitmine
		 - = lahutamine
		 * = korrutamine
		 / = jagamine
		 % = jääk (9:5=4)
		 */
		
		double a,b;
		a = 3;
		b = 2;
		double jagamine;
		jagamine = a / b;
		System.out.println(jagamine);
		
		/*
		 i++ asendab i = i + 1
		 i-- asendab i = i - 1
		 
		 i+=j asendab i = i + j
		 i-=j asendab i = i - j
		 i*=j asendab i = i * j
		 i/=j asendab i = i / j
		 i%=j asendab i = i % j
		 
		 m > n tähendab m on suurem kui n
		 m >) n tähendab m on suurem või võrdne n'iga
		 m < n tähendab m on väiksem kui n
		 m <= m on väiksem või võrdne n'iga
		 m == n tähendab m ja n on võrdsed
		 m != n m tähendab m ei ole võrdne n'iga
		 */
		
		//Kui x ja y on suuremad kui 5, liidetakse neid kokku (z)
		//Muul juhul on vastus 0
		int x, y, z;
		x = 7;
		y = 6;
		if(x>5 && y>5) {
		z = x + y;
		} else {
		z = 0;
		}
		//Väljastab z
		System.out.println(z);
		
		//Teisendab arvu tüübi teiseks
		int q, w;
		q = 7;
		w = 6;
		float e;
		e = (float)q /w;
		System.out.println(e);
		
		double r, t, u;
		r = Math.random()*100; //Genereerib suvalise arvu
		t = Math.round(r*100.0)/100.0; //Ümmardab 2 kohta
		u = Math.pow(8, 3);
		System.out.println(r+" "+t+" "+u);
		
		//Alamprogramm kutsutakse välja
		ytleTere("Java");
		
		//Alamprogramm kutsutakse välja
		int p = ruuduPindala(4);
		System.out.println("Selle ruudu pindala on "+p);
	}
	
	//Alamprogramm, mis tervitab sisestatud nime (e Java)
	static void ytleTere(String nimi) {
	System.out.println("Tere "+nimi+"!");
	}
	
	//
	static int ruuduPindala(int p) {
	int pindala = p * p;
	return pindala;
	}

}
