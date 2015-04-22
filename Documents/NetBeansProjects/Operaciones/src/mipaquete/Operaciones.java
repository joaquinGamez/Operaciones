/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mipaquete;

/**
 * 
 * @author Joaquín Gámez
 * @version 12/03/2015
 * @deprecated Esta clase está obsoleta.
 * @see <a href="http://docs.oracle.com/javase/7/docs/api/index.html"> Clase Math</a>
 * @serial Esta es una clase serializable
 * @since JDK 1.1
 */
public class Operaciones {


    private static final double SMI = 5322.234;

    private int a;

    private int b;

    /**
     * 
     * @param a Entero para operar
     * @param b Entero para operar
     */

    /**
     * Asigna a "a" y a "b" el valor 0.
     */
    public Operaciones() {
        this(0,0);
    }
    
    /**
     * 
     * @param a Primer operando
     * @param b Segundo operando
     */
    public Operaciones(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Get the value of b
     *
     * @return the value of b
     */
    public int getB() {
        return b;
    }

    /**
     * Set the value of b
     *
     * @param b new value of b
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * Get the value of a
     *
     * @return the value of a
     */
    public int getA() {
        return a;
    }

    /**
     * Set the value of a
     *
     * @param a new value of a
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * Get the value of SMI
     *
     * @return the value of SMI
     */
    public static double getSMI() {
        return SMI;
    }

    /**
     * Devuelve la suma de a y b
     * 
     * @return La suma de a y b
     */
    public int calculaSuma() {
        return a + b;
    }

    /**
     * Devuelve la resta de a menos b
     * 
     * @return La resta de a menos b
     */
    public int calculaResta() {
        return a - b;
    }

    /**
     * Devuelve el producto de a, b 
     * y el parámetro que le demos
     * 
     * @param c Número para multiplicar
     * @return El producto de a, b y c
     * @throws NullPointerException
     */
    public int multiplicaNumero(int c) {
        return a * b * c;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
