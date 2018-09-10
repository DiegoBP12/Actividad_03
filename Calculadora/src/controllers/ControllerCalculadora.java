/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import views.ViewCalculadora;
import models.ModelCalculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
/**
 *
 * @author Diego
 */
public class ControllerCalculadora {
    ViewCalculadora viewCalculadora;
    ModelCalculadora modelCalculadora;
    
    MouseListener ml = new MouseListener () {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource() == viewCalculadora.jb_suma){
                jb_Suma_performed();
            }
            else if (e.getSource() == viewCalculadora.jb_resta){
                jb_Resta_performed();
            }
            else if (e.getSource() == viewCalculadora.jb_multi){
                jb_Multi_performed();
            }
            else if (e.getSource() == viewCalculadora.jb_division){
                jb_Division_performed();
            }
            else if (e.getSource() == viewCalculadora.jb_modulo){
                jb_Modulo_performed();
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
            
        }
    };
    
    public ControllerCalculadora(ViewCalculadora viewCalculadora, ModelCalculadora modelCalculadora) {
        this.viewCalculadora = viewCalculadora;
        this.modelCalculadora = modelCalculadora;
        this.viewCalculadora.jb_suma.addMouseListener(ml);
        this.viewCalculadora.jb_resta.addMouseListener(ml);
        this.viewCalculadora.jb_multi.addMouseListener(ml);
        this.viewCalculadora.jb_division.addMouseListener(ml);
        this.viewCalculadora.jb_modulo.addMouseListener(ml);
        initComponents();
    }
  
    public void Datos(){
        
        modelCalculadora.setNum1(Float.parseFloat(viewCalculadora.jtf_numero1.getText()));
        modelCalculadora.setNum2(Float.parseFloat(viewCalculadora.jtf_numero2.getText()));
        
    }
    
    public void jb_Suma_performed(){
        Datos();
        viewCalculadora.jl_resultado.setText("Resultado = " + modelCalculadora.Suma());
    }
    public void jb_Resta_performed(){
        Datos();
        viewCalculadora.jl_resultado.setText("Resultado = " + modelCalculadora.Resta());
    }
    public void jb_Multi_performed(){
        Datos();
        viewCalculadora.jl_resultado.setText("Resultado = " + modelCalculadora.Multi());
    }
    public void jb_Division_performed(){
        Datos();
        viewCalculadora.jl_resultado.setText("Resultado = " + modelCalculadora.Division());
    }
    public void jb_Modulo_performed(){
        Datos();
        viewCalculadora.jl_resultado.setText("Resultado = " + modelCalculadora.Modulo());
    }
    
    
    private void initComponents(){
        viewCalculadora.setVisible(true);
    }
    
    
}
