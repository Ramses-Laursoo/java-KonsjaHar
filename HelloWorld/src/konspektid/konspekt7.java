package konspektid;
import java.util.ArrayList;
import java.io.*;

public class konspekt7 {

	public static void main(String[] args) throws IOException {
		//Dünaamiline loend (ArrayList)
		//Array'd on kindlas järjekorras, ning paindlikuma suurusega kui massiivid
		ArrayList<String> linnad = new ArrayList<String>();
		linnad.add("Haapsalu");
		linnad.add("Tallinn");
		linnad.add("Pärnu");
		System.out.println(linnad);
		
		for (String linn : linnad) {
		System.out.println(linn);
		}
		
		/*
		 Loendist eemaldamine:
		 	linnad.remove("Haapsalu") 	 – eemaldamine nimetuse järgi
		 	linnad.remove(0)			 – eemaldamine indeksi järgi
		 	linnad.clear()				 – kustutab kogu loendi tühjaks
		 Loendi suurus:					 – linnad.size()
		 Elemendi indeksi leidmine: 	 – linnad.indexOf("Tallinn")
		 Kas loend on tühi või mitte:    – linnad.isEmpty()
		 Kas element on loendis olemas:  – linnad.contains("Haapsalu"
		 */
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(1);
		//Väljastab ja samal ajal eemaldab esimese arvu Array seest
		System.out.println(list.remove((int) 1));
		
		
		//Tekstifaili kirjutamine ja lugemine
		int nViis = 5;
		File minuFail = new File("MinuTekstiFail.txt");
		FileWriter fw = new FileWriter(minuFail);
		PrintWriter pw = new PrintWriter(fw);
		pw.println("Esimene rida "+nViis);
		pw.println("Teine rida");
		pw.println("Kolmas rida");
		pw.close();
	}
}

