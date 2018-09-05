/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.time.LocalDateTime;
import java.util.Objects;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author hantsy
 */
@Named
@RequestScoped
public class HelloBean {

    private String message = "Teste";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void sayHi() {
        this.message = this.message+ " received at " + LocalDateTime.now();
       System.out.println("Teste"); 
       
    }


}
