//Koostaja: Ramses Laursoo, IS20
//Konspekt: 10
//Ülesanne: Java - Klasside omavahelised seosed
package bussireisid;

public class App {

	public static void main(String[] args) {
		 
		Pilet p1 = new Pilet();
		Reisija r1 = new Reisija("Mari Maasikas");
		Liin l1 = new Liin("Haapsalu","Tallinn",534);
		Istekoht i1 = new Istekoht(8);

		
		p1.setReisija(r1);
		p1.setLiin(l1);
		p1.setIstekoht(i1);
		
		System.out.println(p1.getReisija().getNimi());
		System.out.println(p1.getLiin().getLahteKoht()+" > "+p1.getLiin().getSihtKoht());
		System.out.println(p1.getOstuAeg());
		System.out.println("Koht: "+p1.getIstekoht().getKoht2());
		 
		}

}
