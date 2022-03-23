/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFSC
 */
public class principal {
    public static void main(String[] args) {
        retangulo r = new retangulo (3,5,"vermelho");
        triangulo t = new triangulo (9,6,"amarelo");
        quadrado q = new quadrado (3,3,"verde");
        circulo c = new circulo (10,"azul");
        System.out.println(r);
        System.out.println(t);
        System.out.println(q);
        System.out.println(c);
    }
}
