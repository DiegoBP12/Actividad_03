/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import views.ViewCalculadora;
import models.ModelCalculadora;
import controllers.ControllerCalculadora;
/**
 *
 * @author Diego
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModelCalculadora modelCalculadora = new ModelCalculadora();
        ViewCalculadora  viewCalculadora = new ViewCalculadora();
        ControllerCalculadora controllerCalculadora = new ControllerCalculadora(viewCalculadora,modelCalculadora);
    }
    
}
