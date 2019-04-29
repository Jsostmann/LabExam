/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.exam;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author jamesostmann
 */
public class LabExam extends Application {

   
    Budget budget = new Budget();
    
    
    @Override
    public void start(Stage window) {
       
       
        budget.readBudget("budget.txt"); 
        
        MainPane main = new MainPane(budget);  
              
        Scene scene = new Scene(main,budget.getNumAccounts() * 60.0, budget.getNumAccounts() * 60.0); 
        
        
        window.setScene(scene);
        window.setTitle("Final Exam");
        window.show();
        
       
    }
    
}
