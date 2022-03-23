/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFSC
 */
public class quadrado extends retangulo {
    
    public quadrado(double lado1, double lado2, String cor) {
        super(lado1, lado2, cor);
    }
    @Override
    double area(){
        return lado1*lado2;
    }
    @Override
    public String toString (){
        System.out.println("----QUADRADO----");
        return " o lado 1 vale: "+lado1+"\n o lado 2 vale: "+lado2+"\n a sua cor é: "+cor+"\n e sua area é: "+area();
    }
}
