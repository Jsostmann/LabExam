/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.exam;

import java.util.Random;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

/**
 *
 * @author jamesostmann
 */
public class BudgetPane extends GridPane {
    
    public BudgetPane(Budget budget) {
    
        budget.sortAccounts();
        
        for(int i = 0; i < budget.getNumAccounts(); i++) {
        
            Account tempAccount = budget.getAccount(i); 
            String tempAccountCategory = tempAccount.getCategory();
            double tempAccountAmount = tempAccount.getAmount();
            
            AccountPane tempAccountPane = new AccountPane(tempAccountCategory,budget.getTotalExpenses(),tempAccountAmount,generateColor()); 
            
            this.add(tempAccountPane,0,i); 
        }
        
        
    }
    
    private Paint generateColor() {
        
        Random rand = new Random();
        return Color.rgb(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
}
    
}
