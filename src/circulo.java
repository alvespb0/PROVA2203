/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFSC
 */
public class circulo extends figura {

    double raio;

    public circulo(double raio, String cor) {
        this.raio = raio;
        this.cor = cor;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    double area() {
        return 2 * 3.14 * raio;
    }

    double diametro() {
        return raio * 2;
    }

    @Override
    public String toString() {
        System.out.println("----CIRCULO----");
        return " o seu raio é: " + raio + "\n o seu diametro é: " + diametro() + "\n a sua cor é: " + cor + "\n e a sua area é: " + area();
    }

}
