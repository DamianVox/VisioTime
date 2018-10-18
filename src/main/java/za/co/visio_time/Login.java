/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.visio_time;

import javax.faces.bean.ManagedBean;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author DMHT
 */
@ManagedBean(name = "Login")
@RequestScoped
public class Login {
    API api = new API();
    
    private String email;
    private String passwd;

    public String login() throws Exception{
    if(api.login(email, passwd)){
        System.out.println("User found");
        return "home?faces-redirect=true";
    }else{
    System.out.println("! ! ! User not found ! ! !");
    return "index?faces-redirect=true";
    }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    
}
