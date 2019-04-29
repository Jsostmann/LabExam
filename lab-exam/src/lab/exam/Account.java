/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.exam;

/**
 *
 * @author jamesostmann
 */
public class Account implements Comparable<Account> {

 private String accountID;
 private double amount;
 private String category;

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
 
 
 public Account(){
     accountID = "";
     amount = 0.0;
     category = "";
 }   
 public Account(String accountID, double ammount, String category){
 
     this.accountID = accountID;
     this.amount = ammount;
     this.category = category;
 }
    
 
    @Override 
    public String toString(){
    
       return this.accountID + "#" + this.amount + "#" + this.category;
        
    }
    
    
    @Override
    public int compareTo(Account other) {
        
        return this.category.compareTo(other.category);
        
    }
    
}
