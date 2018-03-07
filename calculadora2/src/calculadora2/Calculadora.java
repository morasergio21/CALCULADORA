/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora2;

/**
 *
 * @author Sergio
 */
public class Calculadora {

    float x;
    private float y;
    private float r;

    void sumar() {
        r = x + y;
    }

    void restar() {
        if (x < y) {
            float a;
            a = x;
            x = y;
            y = a;

            r = x - y;
        }
    }

    void dividir() {
        r = x + y;
    }

    void multiplicar() {
        r = x + y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getR() {
        return r;
    }

}
