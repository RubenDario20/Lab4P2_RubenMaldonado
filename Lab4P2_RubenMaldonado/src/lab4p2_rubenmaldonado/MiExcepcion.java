/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_rubenmaldonado;

import java.awt.Color;

/**
 *
 * @author Ruben Dario Arias
 */
public class MiExcepcion extends Exception {
    private Color color;

    public MiExcepcion() {
        super();
    }

    public MiExcepcion(Color color, String string) {
        super(string);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "MiExcepcion{" + "color=" + color + '}';
    }
    
    
    
    
}
