package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;

public class InicioController {

	@FXML
    private AnchorPane rootPane;

	@FXML
    private TextField tfBuscar;

    @FXML
    private Button botonBuscar;

    @FXML
    private Button Tendencia;

    @FXML
    private ToggleButton botonBusquedaSimple;

    @FXML
    private ToggleButton botonBusquedaAvanzada;

    @FXML
    private Button botonIniciar;

    @FXML
    private Button botonRegistrarse;

    @FXML
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

    @FXML
    void loadBusquedaAvanzada(ActionEvent event) {
    	AnchorPane pane;
		try {
			pane = FXMLLoader.load(getClass().getResource("BusquedaAvanzada.fxml"));
			rootPane.getChildren().setAll(pane);
		} catch (IOException e) {
			Alert alert=new Alert(AlertType.ERROR);
			alert.setHeaderText("ERROR FATAL");
			alert.show();
		}
    }

    @FXML
    void loadBusquedaSimple(ActionEvent event) {
    	AnchorPane pane;
		try {
			pane = FXMLLoader.load(getClass().getResource("BusquedaSimple.fxml"));
			rootPane.getChildren().setAll(pane);
		} catch (IOException e) {
			Alert alert=new Alert(AlertType.ERROR);
			alert.setHeaderText("ERROR FATAL");
			alert.show();
		}
    }

    @FXML
    void loadRegistrarse(ActionEvent event) {
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

    @FXML
    void loadIniciar(ActionEvent event) throws IOException {
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

}
