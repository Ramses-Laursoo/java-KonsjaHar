//Koostaja: Ramses Laursoo, IS20
//Konspekt: 11
//�lesanne: Java - �lem- ja alamklassid
package zoo;

public class Loom {
	//protected laseb ligip��su ainult samal v�i alamklassidel
	protected String sugu; 
	
	public void toit(){
	System.out.println("S��n k�ike");
	}
	
	public void temp(){
	System.out.println("p�sisoojane");
	}
	
	public String getSugu() {
		return sugu;
	}
	 
	public void setSugu(String sugu) {
		this.sugu = sugu;
	}
}