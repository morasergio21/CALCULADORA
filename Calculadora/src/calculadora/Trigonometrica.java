/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import static java.lang.Math.*;

public class Trigonometrica extends Principal {

    private double coseno(float x) {
        return cos(x);
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getX() {
        return x;
    }

}
