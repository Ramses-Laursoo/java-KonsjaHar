//Koostaja: Ramses Laursoo, IS20
//Konspekt: 9
//�lesanne: Java - Meetodid, klassid ja objektid
package konspektid;

public class Pindalad {

	public static double roopkylikS(String a, String h) {
		float alus = Float.parseFloat(a);
		float korgus = Float.parseFloat(h);
		double s = alus * korgus;
		return s;
		}
		
		public static double ristkylikS(String a, String h) {
		float alus = Float.parseFloat(a);
		float korgus = Float.parseFloat(h);
		double s = alus * korgus;
		return s;
		}
		
		public static double kolmnurkS(String a, String h) {
		float alus = Float.parseFloat(a);
		float korgus = Float.parseFloat(h);
		double s = alus * korgus/2;
		return s;
		}

}
