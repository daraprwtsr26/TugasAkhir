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
public class FXMLburger2Controller implements Initializable {

    @FXML
    private JFXTextField namabg1;
    @FXML
    private JFXTextField haribg1;
    @FXML
    private JFXTextField jambg1;
    @FXML
    private JFXTextField pesananBur;
    @FXML
    private JFXTextField totalbg;
    @FXML
    private Button resetbg;
    @FXML
    private TextField namabg;
    @FXML
    private TextField haribg;
    @FXML
    private TextField jambg;
    @FXML
    private JFXCheckBox bg2;
    @FXML
    private JFXCheckBox bg5;
    @FXML
    private JFXCheckBox bg3;
    @FXML
    private JFXCheckBox bg4;
    @FXML
    private JFXCheckBox bg1;
    @FXML
    private JFXTextField jmlhbg1;
    @FXML
    private JFXTextField jmlhbg2;
    @FXML
    private JFXTextField jmlhbg3;
    @FXML
    private JFXTextField jmlhbg4;
    @FXML
    private JFXTextField jmlhbg5;
    @FXML
    private Button btnNotaBur;
    
    int jumlahmakanbg;
    int hagatotal1bg,hagatotal2bg,hagatotal3bg,hagatotal4bg,hagatotal5bg;
    String menu1bg, menu2bg, menu3bg, menu4bg,menu5bg;
    String menubg="";
    String kasirbg="";
    String atasnamabg, tampilTotalBayarbg, ketbg;
    int hargabg, kembalianbg;
    int totalbayarbg, atasnama1bg;  

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void bghps(ActionEvent event) {
           namabg.setText("");
           jambg.setText("");
           haribg.setText("");
           bg1.setSelected(false);
           bg2.setSelected(false);
           bg3.setSelected(false);
           bg4.setSelected(false);
           bg5.setSelected(false);
           jmlhbg1.setText("");
           jmlhbg2.setText("");
           jmlhbg3.setText("");
           jmlhbg4.setText("");
           jmlhbg5.setText("");
           namabg1.setText("");
           haribg1.setText("");
           jambg1.setText("");
           pesananBur.setText("");
           totalbg.setText("");
    }

    @FXML
    private void burgernota(ActionEvent event) {
        String namapesanbg = namabg.getText();
        System.out.println(namabg1);
        String tglharibg = haribg.getText();
        System.out.println(haribg1);
        String jampsnbg = jambg.getText();
        System.out.println(jambg1);
        String menuubg = null;
        
         if(bg1.isSelected()){
            menuubg = "Burger Ikan Tuna";
            hargabg = 12000;
            menubg += bg1.getText()+", ";
            jumlahmakanbg=Integer.parseInt(jmlhbg1.getText());
            hagatotal1bg=hargabg*jumlahmakanbg;
            System.out.println(hagatotal1bg);
        }
          if(bg2.isSelected()){
            menuubg = "Burger Ikan Salmon";
            hargabg = 20000;
            menubg += bg2.getText()+", ";
            jumlahmakanbg=Integer.parseInt(jmlhbg2.getText());
            hagatotal2bg=hargabg*jumlahmakanbg;
            System.out.println(hagatotal2bg);
        }
           if(bg3.isSelected()){
            menuubg = "Burger Tahu dan Kacang Hitam";
            hargabg = 10000;
            menubg += bg3.getText()+", ";
            jumlahmakanbg=Integer.parseInt(jmlhbg3.getText());
            hagatotal3bg=hargabg*jumlahmakanbg;
            System.out.println(hagatotal3bg);
        }
           if(bg4.isSelected()){
            menuubg = "Burger Ikan";
            hargabg = 15000;
            menubg += bg4.getText()+", ";
            jumlahmakanbg=Integer.parseInt(jmlhbg4.getText());
            hagatotal4bg=hargabg*jumlahmakanbg;
            System.out.println(hagatotal4bg);
        }
           if(bg5.isSelected()){
            menuubg = "Burger Kepiting dengan Slaw";
            hargabg = 23000;
            menubg += bg5.getText()+", ";
            jumlahmakanbg=Integer.parseInt(jmlhbg5.getText());
            hagatotal5bg=hargabg*jumlahmakanbg;
            System.out.println(hagatotal5bg);
        }
        
     if(namabg.getText().equals("")){
         JOptionPane.showMessageDialog(null, "harap masukkan nama");
     }else if(haribg.getText().equals("")){
         JOptionPane.showMessageDialog(null, "harap masukkan hari");
     }else if(jambg.getText().equals("")){
         JOptionPane.showMessageDialog(null, "harap masukkan jam");
     }else{
         String name = namabg.getText();
         String harii = haribg.getText();
         String waktu = jambg.getText();
        namabg1.setText(name);
        haribg1.setText(harii);
        jambg1.setText(waktu);
        pesananBur.setText(menuubg);
        
     }
        totalbayarbg = hagatotal1bg+hagatotal2bg+hagatotal3bg+hagatotal4bg+hagatotal5bg;
        tampilTotalBayarbg=String.valueOf(totalbayarbg);
        totalbg.setText(tampilTotalBayarbg);
    }
    
}
