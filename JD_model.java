/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.learning.Model;

/**
 *
 * @author Student
 */
public class JD_model {
 String UserID;
 String Address;
 String Email;
 String Pass;

    public JD_model() {
    }

    public JD_model(String UserID, String Address, String Email, String Pass) {
        this.UserID = UserID;
        this.Address = Address;
        this.Email = Email;
        this.Pass = Pass;
    }

    public String getUserID() {
        return UserID;
    }

    public String getAddress() {
        return Address;
    }

    public String getEmail() {
        return Email;
    }

    public String getPass() {
        return Pass;
    }

    
    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    @Override
    public String toString() {
        return "JD_model{" + "UserID=" + UserID + ", Address=" + Address + ", Email=" + Email + ", Pass=" + Pass + '}';
    }
 
 

    
   
}
