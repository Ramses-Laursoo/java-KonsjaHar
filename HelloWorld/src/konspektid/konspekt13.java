//Koostaja: Ramses Laursoo, IS20
//Konspekt: 13
//Ülesanne: Java - Graafiline kasutajaliides (JavaFX)
package konspektid;

public class konspekt13 {

	public static void main(String[] args) {
		//Mis on JavaFx ja selle paigaldamine?
		//vali Eclipse menüüst Help > Install New Software
		//JavaFx allalaadimiseks sisesta uus aadress (Add...)
		//http://download.eclipse.org/efxclipse/updates-released/2.4.0/site
		//ning tee valik a(fx)eclipse - install
		
		
		//JavaFX projekti loomine
		//Tee uus projekt valge ala peal, ning vali seal JavaFX Project
		//Nimeks pantud "GraafilineJava"
		
		
		//Akna paameetrid ja sisu paigutus
		//Tehtud GraafiliseJava Main.java failis
		//Mindud üle GridPane display valikule
		
		
		//Elemendide lisamine
		//Nupude ja teksti lisamine kasutajaliideses
		
		
		//Väljadelt saadud info töötlemine ja väljastamine
		
		//GraafiliseJava projekti all olev Main.java sisu:
		//(Minu jaoks see ei töötand, kõik oli punane, kuna mul ei ole Java 8'at)
		/*
		import javafx.application.Application;
		import javafx.geometry.Insets;
		import javafx.stage.Stage;
		import javafx.scene.Scene;
		import javafx.scene.layout.GridPane;
		import javafx.scene.control.Button;
		import javafx.scene.control.Label;
		import javafx.scene.control.TextField;
 
		public class Main extends Application {
 
			@Override
			public void start(Stage primaryStage) {
				GridPane pane = new GridPane();
				primaryStage.setTitle("Java GUI harjutus");
				Scene scene = new Scene(pane,400,300);
				primaryStage.setScene(scene);
				pane.setPadding(new Insets(10, 10, 10, 10));
				pane.setVgap(10);
				pane.setHgap(10);
 
				Label nr1_label = new Label("Number 1:");
				TextField nr1_txt = new TextField();
				pane.add(nr1_label, 0, 0);
				pane.add(nr1_txt, 1, 0);
 
				Label nr2_label = new Label("Number 2:");
				TextField nr2_txt = new TextField();
				pane.add(nr2_label, 0, 1);
				pane.add(nr2_txt, 1, 1);
 
				Label vastus_label = new Label("Vastus:");
				Label vastus = new Label("0");
				pane.add(vastus_label, 0, 2);
				pane.add(vastus, 1, 2);
 
				Button nupp = new Button();
				nupp.setText("Arvuta");
				pane.add(nupp, 2, 3);
 
				primaryStage.show();
				}
				//Väljadelt saadud info töötlemine ja väljastamine
				nupp.setOnAction(event->{
					int arv1 = Integer.parseInt(nr1_txt.getText().toString());
					int arv2 = Integer.parseInt(nr2_txt.getText().toString());
					//Korrutab sisestatud arvud
					int korrutis = arv1 * arv2;
					vastus.setText(String.valueOf(korrutis));
					});
 
				public static void main(String[] args) {
				launch(args);
 				}
		}
		*/
	}

}
