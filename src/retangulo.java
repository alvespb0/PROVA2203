/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFSC
 */
public class retangulo extends figura {
    protected double lado1;
    protected double lado2;

    public retangulo(double lado1, double lado2, String cor) {
        this.lado1 = lado1;
        this.lado2 = lado2;    
        this.cor = cor;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    double area (){
        return lado1 * lado2;      
    }
    @Override
    public String toString (){
        System.out.println("----RETANGULO----");
    return " o lado 1 vale: "+lado1+"\n o lado 2 vale: "+lado2+"\n e sua area é: "+area()+"\n e sua cor é: "+cor;
}
}
