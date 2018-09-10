/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
/**
 *
 * @author Diego
 */
public class ModelCalculadora {
    private float num1 = 0.0f;
    private float num2 = 0.0f;
    private float resultado = 0.0f;

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
    public float Suma(){
        resultado = num1 + num2;
        return resultado;
    }
    public float Resta(){
        resultado = num1 - num2;
        return resultado;
    }
    public float Multi(){
        resultado = num1 * num2;
        return resultado;
    }
    public float Division(){
        resultado = num1 / num2;
        return resultado;
    }
    public float Modulo(){
        resultado = num1 % num2;
        return resultado;
    }
}
