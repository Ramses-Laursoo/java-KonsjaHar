//Koostaja: Ramses Laursoo, IS20
//Konspekt: 10
//Ülesanne: Java - Klasside omavahelised seosed
package konspektid;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.time.LocalDate;

public class konspekt10 {

	public static void main(String[] args) {
		//Kuupäeva loomine ja vormindamine (import java.util.Date)
		Date kp = new Date();
		System.out.println(kp);
		//Aja formaadi muutmiseks (import java.text.SimpleDateFormat)
		SimpleDateFormat uusKp = new SimpleDateFormat("dd.MM.y H:m");
		System.out.println(uusKp.format(kp));
		/*
		Y 	 = aasta (2021)				D = päeva number aastas (164)
		YY 	 = aasta (21)				w = nädala number aastas (12)
		M 	 = kuu (8)					W = nädala number kuus (4)
		MM	 = kuu (08)					h = tunnid 1-12 (12)
		MMM  = kuu (aug)				H = tunnis 0-23 (23)
		MMMM = kuu (august)				m = minutid (30)
		d	 = päev (3)					s = sekundid (59)
		dd	 = päev (03)				S = millisekundid (999)
		E 	 = nädalapäeva täht (E)		a = enne või pärast lõunat (PM)
		*/
		
		
		//Teksti teisendamine kuupäevaks (import java.text.ParseException)
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		String minuKellaaeg = "13:21";
		Date aeg;
		try {
			aeg = sdf.parse(minuKellaaeg);
			System.out.println(sdf.format(aeg));
		} catch (ParseException e) {
		System.out.println("Valesti sisestatud aeg)");
		}
		
		
		//Tehted kuupäevadega (import java.time.LocalDate)
		/*
		Kuupäevade loomiseks kasutame kahte meetodit:
		now() – loob hetkekuupäeva
		of() – saad defineerida ise kuupäeva (aasta,kuu,päev)
		Kuupäevast info kättesaamiseks kasutame meetodeid eesliidesega (get);
		getYear()
		getMonth()
		getDayOfMonth()
		getDayOfWeek()
		getDayOfYear()
		ja kui vaja arvutada, siis:
		plusDays()
		plusWeeks()
		plusMonths()
		plusYears()	
		minusDays()
		minusWeeks()
		minusMonths()
		minusYears()
		*/
		//Praeguse hetke kuupäev
		LocalDate tana = LocalDate.now();
		//Etteantud kuupäev
		LocalDate sunnipaev = LocalDate.of(1980, 11, 6);
		//Operatsioonid kuupäevadega
		int aasta = tana.getYear();
		LocalDate homme = tana.plusDays(1);
		LocalDate kymneAastaParast = tana.plusYears(10);
		LocalDate kolmKuudTagasi = tana.minusMonths(3);
		
		System.out.println(tana);
		System.out.println(sunnipaev);
		System.out.println(aasta);
		System.out.println(homme);
		System.out.println(kymneAastaParast);
		System.out.println(kolmKuudTagasi);
		//Kuupäevade ja aegade vahe leidmiseks kasuta (Period) või (Duration) klasse
		
		
		//Klasside omavahelised suhted
		//Reisija.java sisaldab reisija nime, Liin.java sisaldab lähtepunkti, shitpunkit ja liininumbrit, Istekoht.java sisaldab istekoha numbrit
		//Loome paketi (new Package bussireisid)
		//Kõik ülejäänud töö tehti seal
	}

}
