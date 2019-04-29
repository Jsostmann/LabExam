/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.exam;


import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 *
 * @author jamesostmann
 */
public class AccountPane extends Pane {
    
    private Text accountInfo;
    private Rectangle bar;
    private double paneWidth;
    
    public AccountPane(String category, double total, double amount, Paint color) {
        
        this.paneWidth = 500;
        
        String percent = String.format("%.2f",(amount / total) * 100); 
        this.accountInfo = new Text(category + " $" + amount + " (" + percent + "%)");
        accountInfo.setFont(Font.font("verdana", FontWeight.NORMAL, FontPosture.REGULAR, 12));  
        accountInfo.setX(5.0); 
        accountInfo.setY(10.0); 
        
        this.bar = new Rectangle();
        bar.setX(5.0);
        bar.setY(15.0);
        bar.setHeight(30.0); 
        bar.setWidth((amount / total) * paneWidth); 
        bar.setFill(color); 
      
        
       this.getChildren().addAll(accountInfo,bar); 
        
        
    }
    
    
}
