/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplointerfazdefault;

/**
 *
 * @author Jamex
 */
public class Calculadora implements Operaciones {

    public int sumar(int a, int b) {
        return a + b;
    }
    
    public int restar(int a, int b) {
        return a - b;
    }
    
   
    @Override
    public int multiplicar(int a, int b) {
        return a * b * FACTOR * 2;
    }
}
