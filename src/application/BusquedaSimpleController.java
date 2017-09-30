package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class BusquedaSimpleController implements Initializable{

    @FXML
    private AnchorPane rootPane;

	@FXML
    private GridPane gP;

    @FXML
    private Button botonIniciar;

    @FXML
    private Button botonRegistrarse;

    @FXML
    private ChoiceBox<String> cbCategoria;

    @FXML
    private ChoiceBox<String> cbIdioma;

    @FXML
    private TextField tfBuscar;

    @FXML
    private Button botonBuscar;

    @FXML
    private Button botonReiniciar;

    @FXML
    private Button botonInicio;


	public void initialize(URL arg0, ResourceBundle arg1) {
		cbIdioma.getItems().addAll("Inglés", "Español", "Frances");
		cbCategoria.getItems().addAll("Animales", "Arte","Biografia" ,"Comercio", "Economía", "Fisica", "Historia","Informatica", "Literatura", "Medicina", "Musica", "Novela", "Tecnologia");

	}

	public void loadResultado(ActionEvent event) throws IOException{

		botonBuscar.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event){
				String busqueda=tfBuscar.getText();
					if(!busqueda.isEmpty()){
						AnchorPane pane;
						try {
							pane = FXMLLoader.load(getClass().getResource("ResultadosBusqueda.fxml"));
							rootPane.getChildren().setAll(pane);
						} catch (IOException e) {
							Alert alert=new Alert(AlertType.ERROR);
							alert.setHeaderText("ERROR FATAL");
							alert.show();
						}
					}else{
						Alert alert=new Alert(AlertType.ERROR);
						alert.setHeaderText("Favor de ingresar algún titulo o palabra clave en el campo de busqueda");
						alert.show();
					}

				}
		});
	}

	public void loadIniciar(ActionEvent event) throws IOException{
		AnchorPane pane;
		try {
			pane = FXMLLoader.load(getClass().getResource("loginpage.fxml"));
			rootPane.getChildren().setAll(pane);
		} catch (IOException e) {
			Alert alert=new Alert(AlertType.ERROR);
			alert.setHeaderText("ERROR FATAL");
			alert.show();
		}
	}

	public void loadRegistrarse(ActionEvent event) throws IOException{
		AnchorPane pane;
		try {
			pane = FXMLLoader.load(getClass().getResource("registrarsepage.fxml"));
			rootPane.getChildren().setAll(pane);
		} catch (IOException e) {
			Alert alert=new Alert(AlertType.ERROR);
			alert.setHeaderText("ERROR FATAL");
			alert.show();
		}
	}

	public void loadInicio(ActionEvent event) throws IOException{
		AnchorPane pane;
		try {
			pane = FXMLLoader.load(getClass().getResource("mainPage.fxml"));
			rootPane.getChildren().setAll(pane);
		} catch (IOException e) {
			Alert alert=new Alert(AlertType.ERROR);
			alert.setHeaderText("ERROR FATAL");
			alert.show();
		}
	}
}
