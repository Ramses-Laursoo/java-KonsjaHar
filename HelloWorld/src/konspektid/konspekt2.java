package konspektid;

public class konspekt2 {

	public static void main(String[] args) {
		int a,b,c;
		a = 2;
		b = 5;
		c = 7;
		int arv = a + b + c;
		System.out.println(arv);

		/*
		 int = arv
		 float = komaarv
		 double = komaarv
		 final = asub kusagil kunagi kui vaja
		 */
		
		//Teeb uue stringi, mille sisuks on nimi "Karin"
		String eesnimi = new String();
		eesnimi = "Karin";
		System.out.println(eesnimi);
		
		//Väljastab kõik eelmised asjad koos
		System.out.println(eesnimi+" "+arv);
		
		//
		final double PI = 3.14;
		int r = 6;
		double s = 2*PI*r;
		System.out.println(s);
		
	}

}
