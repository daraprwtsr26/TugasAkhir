/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onfast;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Daraprwtsr
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button btnBurger;
    @FXML
    private Button btnIce;
    @FXML
    private Button btnWaffle;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void burger(ActionEvent event) throws IOException {
        
        ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLburger2.fxml"));
            Scene scene = new Scene (fxmlLoader.load(), 1144, 542);         
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Ice Cream OnFast");
            stage.show();
        
        
    }

    @FXML
    private void icecream(ActionEvent event) throws IOException {
        
        ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLeskrim.fxml"));
            Scene scene = new Scene (fxmlLoader.load(), 1247, 632);         
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Ice Cream OnFast");
            stage.show();
    }

    @FXML
    private void waffle(ActionEvent event) throws IOException {
        
        
        ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLWaffle.fxml"));
            Scene scene = new Scene (fxmlLoader.load(), 1187, 576);         
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Waffle OnFast");
            stage.show();
    }
    
}
