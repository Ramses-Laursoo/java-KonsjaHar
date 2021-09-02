//Koostaja: Ramses Laursoo, IS20
//Konspekt: 11
//Ülesanne: Java - Ülem- ja alamklassid
package zoo;

public class Loom {
	//protected laseb ligipääsu ainult samal või alamklassidel
	protected String sugu; 
	
	public void toit(){
	System.out.println("Söön kõike");
	}
	
	public void temp(){
	System.out.println("püsisoojane");
	}
	
	public String getSugu() {
		return sugu;
	}
	 
	public void setSugu(String sugu) {
		this.sugu = sugu;
	}
}