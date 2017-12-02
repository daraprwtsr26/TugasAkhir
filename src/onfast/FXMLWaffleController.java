/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onfast;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Daraprwtsr
 */
public class FXMLWaffleController implements Initializable {

    @FXML
    private TextField namawf;
    @FXML
    private TextField hariwf;
    @FXML
    private TextField jamwf;
    @FXML
    private JFXCheckBox wf2;
    @FXML
    private JFXCheckBox wf5;
    @FXML
    private JFXCheckBox wf3;
    @FXML
    private JFXCheckBox wf4;
    @FXML
    private JFXCheckBox wf1;
    @FXML
    private JFXCheckBox wf6;
    @FXML
    private JFXTextField jmlhwf1;
    @FXML
    private JFXTextField jmlhwf2;
    @FXML
    private JFXTextField jmlhwf3;
    @FXML
    private JFXTextField jmlhwf4;
    @FXML
    private JFXTextField jmlhwf5;
    @FXML
    private JFXTextField jmlhwf6;
    @FXML
    private Button Notawaffle;
    @FXML
    private JFXTextField namawf1;
    @FXML
    private JFXTextField hariwf1;
    @FXML
    private JFXTextField jamwf1;
    @FXML
    private JFXTextField pesananWaf;
    @FXML
    private JFXTextField totalwf;
    @FXML
    private Button resetwf;
    
    int jumlahmakanwf;
    int hagatotal1wf,hagatotal2wf,hagatotal3wf,hagatotal4wf,hagatotal5wf,hagatotal6wf;
    String menu1wf, menu2wf, menu3wf, menu4wf,menu5wf,menu6wf;
    String menuwf="";
    String kasirwf="";
    String atasnamawf, tampilTotalBayarwf, ketwf;
    int hargawf, kembalianwf;
    int totalbayarwf, atasnama1wf;  

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void wafflenota(ActionEvent event) {
        String namapesanwf = namawf.getText();
        System.out.println(namawf1);
        String tglhariwf = hariwf.getText();
        System.out.println(hariwf1);
        String jampsnwf = jamwf.getText();
        System.out.println(jamwf1);
        String menuuwf = null;
        
         if(wf1.isSelected()){
            menuuwf = "Waffle with Tiramisu Jam";
            hargawf = 12000;
            menuwf += wf1.getText()+", ";
            jumlahmakanwf=Integer.parseInt(jmlhwf1.getText());
            hagatotal1wf=hargawf*jumlahmakanwf;
            System.out.println(hagatotal1wf);
        }
          if(wf2.isSelected()){
            menuuwf = "Waffle Tripple Chocolates Bites";
            hargawf = 20000;
            menuwf += wf2.getText()+", ";
            jumlahmakanwf=Integer.parseInt(jmlhwf2.getText());
            hagatotal2wf=hargawf*jumlahmakanwf;
            System.out.println(hagatotal2wf);
        }
          if(wf3.isSelected()){
            menuuwf = "Waffle and Smoothies ";
            hargawf = 15000;
            menuwf += wf3.getText()+", ";
            jumlahmakanwf=Integer.parseInt(jmlhwf3.getText());
            hagatotal3wf=hargawf*jumlahmakanwf;
            System.out.println(hagatotal3wf);
        }
          if(wf4.isSelected()){
            menuuwf = "Waffle with Ice Cream Strawberry";
            hargawf = 13000;
            menuwf += wf4.getText()+", ";
            jumlahmakanwf=Integer.parseInt(jmlhwf4.getText());
            hagatotal4wf=hargawf*jumlahmakanwf;
            System.out.println(hagatotal4wf);
        }
          if(wf5.isSelected()){
            menuuwf = "Waffle with Ice Cream Chocolate";
            hargawf = 13000;
            menuwf += wf5.getText()+", ";
            jumlahmakanwf=Integer.parseInt(jmlhwf5.getText());
            hagatotal5wf=hargawf*jumlahmakanwf;
            System.out.println(hagatotal5wf);
        }
          if(wf6.isSelected()){
            menuuwf = "Waffle with Ice Cream Vanila";
            hargawf = 13000;
            menuwf += wf6.getText()+", ";
            jumlahmakanwf=Integer.parseInt(jmlhwf6.getText());
            hagatotal6wf=hargawf*jumlahmakanwf;
            System.out.println(hagatotal6wf);
        }
        
     if(namawf.getText().equals("")){
         JOptionPane.showMessageDialog(null, "harap masukkan nama");
     }else if(hariwf.getText().equals("")){
         JOptionPane.showMessageDialog(null, "harap masukkan hari");
     }else if(jamwf.getText().equals("")){
         JOptionPane.showMessageDialog(null, "harap masukkan jam");
     }else{
         String name = namawf.getText();
         String harii = hariwf.getText();
         String waktu = jamwf.getText();
        namawf1.setText(name);
        hariwf1.setText(harii);
        jamwf1.setText(waktu);
        pesananWaf.setText(menuuwf);
        
     }
        totalbayarwf = hagatotal1wf+hagatotal2wf+hagatotal3wf+hagatotal4wf+hagatotal5wf+hagatotal6wf;
        tampilTotalBayarwf=String.valueOf(totalbayarwf);
        totalwf.setText(tampilTotalBayarwf);
    }

    @FXML
    private void wfhps(ActionEvent event) {
           namawf.setText("");
           jamwf.setText("");
           hariwf.setText("");
           wf1.setSelected(false);
           wf2.setSelected(false);
           wf3.setSelected(false);
           wf4.setSelected(false);
           wf5.setSelected(false);
           wf6.setSelected(false);
           jmlhwf1.setText("");
           jmlhwf2.setText("");
           jmlhwf3.setText("");
           jmlhwf4.setText("");
           jmlhwf5.setText("");
           jmlhwf5.setText("");
           namawf1.setText("");
           hariwf1.setText("");
           jamwf1.setText("");
           pesananWaf.setText("");
           totalwf.setText("");
    }
    
}
