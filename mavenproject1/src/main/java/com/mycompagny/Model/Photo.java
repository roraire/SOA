/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompagny.Model;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author BoukarabilaA
 */
@XmlRootElement
public class Photo {
    int id;
    String User;
    String Visibilité;
    Date date;

    public Photo() {
    }

    public Photo(int id, String User, String Visibilité, Date date) {
        this.id = id;
        this.User = User;
        this.Visibilité = Visibilité;
        this.date = date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public void setVisibilité(String Visibilité) {
        this.Visibilité = Visibilité;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getUser() {
        return User;
    }

    public String getVisibilité() {
        return Visibilité;
    }

    public Date getDate() {
        return date;
    }
    
    
    
}
