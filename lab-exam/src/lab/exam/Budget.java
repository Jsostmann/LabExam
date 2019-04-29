/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author jamesostmann
 */
public class Budget {
    
    private String description;
    private ArrayList<Account> accounts;
    private double totalExpenses;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public double getTotalExpenses() {
        return totalExpenses;
    }

    public void setTotalExpenses(double totalExpenses) {
        this.totalExpenses = totalExpenses;
    }
    
    
    public Budget(){
    
        accounts = new ArrayList<>();
        
    }
    
    public int getNumAccounts(){
        return accounts.size();
    }
    
    public Account getAccount(int i){
    
        if(i >= 0 && i < accounts.size()) {
            return accounts.get(i);
        } else {
            return null;
        }
        
    }
    
    public void addAccount(Account account) {
        accounts.add(account);
    }
    
    public Account removeAccount(int i) {
        Account answer = null;
        
        if(i >=0 && i < accounts.size()) {
            answer = accounts.get(i);
            accounts.remove(i);
        }
        
        return answer;
    }
    
    public void readBudget(String fName){
    
        try {
            
            Scanner scan = new Scanner(new File(fName));
            
            this.description = scan.nextLine();
            
            while(scan.hasNextLine()) {
            
                String[] tempData = scan.nextLine().split("#"); 
                
                String accountID = tempData[0];
                String category = tempData[1];
                double amount = Double.parseDouble(tempData[2]);

                
                this.totalExpenses += amount;
                
                Account tempAccount = new Account(accountID,amount,category);
                
                this.accounts.add(tempAccount); 
                
                
            
            }
            
            scan.close();
            
            
            
        } catch (FileNotFoundException  e) {
        
            System.err.println("Could not find budget file for reading.");
            System.exit(0); 
        }
        
    }
    
    public void sortAccounts(){
        
        Collections.sort(accounts); 
        
    }
    
    @Override
    public String toString(){
        String result = "";
        
        for(Account temp: accounts) {
        
            result += temp.toString() + System.lineSeparator();
        
        }
        return result;
    }
    
    
    
    
}

