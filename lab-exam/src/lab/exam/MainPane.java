/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.exam;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

/**
 *
 * @author jamesostmann
 */
public class MainPane extends BorderPane { 
    
    private BudgetPane center;
    private HBox top;
    private HBox bottom;
    
    
    public MainPane(Budget b) {
        
        init(b);
        
        this.setCenter(center); 
        this.setTop(top);
        this.setBottom(bottom); 
    
    }
    
    
    private void init(Budget b) {
        
        center = new BudgetPane(b); 
        
        top = new HBox();
        top.setPadding(new Insets(10.0,0,10.0,0));  
        top.setAlignment(Pos.CENTER); 
        Text t = new Text(b.getDescription() + " " + b.getTotalExpenses()); 
        top.getChildren().add(t); 
        
        
        bottom = new HBox();
        bottom.setAlignment(Pos.CENTER); 
        bottom.setPadding(new Insets(10.0,0,10.0,0));  
        Button button = new Button("Exit");  
        button.setOnAction(new ButtonHandler()); 
        bottom.getChildren().add(button);
        
        
        
        
    }
    
    class ButtonHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            
            System.exit(0); 
            
        }
    
    }
    
}
