/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsmanagementsystem;

import classes.financial.financialposition;
import classes.financial.incomestatement;
import itp.project.x.Interfaces.login;

/**
 *
 * @author Rashan
 */
public class BSManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new login().setVisible(true);
        
        
        
        //new MainPage().setVisible(true);
        // TODO code application logic here
    }
   /* 
 private void calculationsForStatements(){
     
     incomestatement inc = new incomestatement();
     financialposition finpos = new financialposition();
     
     boolean status1, status2, status3;
     
     status1 = inc.initiate(start, end);
     status2 = finpos.initiate(start, end);
     status3 = initiate(start, end);
     
 }   
    */
}
