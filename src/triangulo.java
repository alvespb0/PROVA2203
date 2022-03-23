/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFSC
 */
public class triangulo extends figura {

    double altura;
    double base;

    public triangulo(double altura, double base, String cor) {
        this.altura = altura;
        this.base = base;
        this.cor = cor;
    }

    double area() {
        return (base * altura)/2;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public String toString() {
        System.out.println("----TRIANGULO----");
        return " a base do triangulo é: " + base + "\n a altura do triangulo é: " + altura + "\n e sua area é: " + area() + "\n e sua cor é:" + cor;
    }

}
