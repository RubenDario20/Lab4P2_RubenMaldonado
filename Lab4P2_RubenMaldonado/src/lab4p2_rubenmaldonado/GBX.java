/*2
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_rubenmaldonado;

import java.util.ArrayList;

/**
 *
 * @author Ruben Dario Arias
 */
public class GBX  {
    
    private String nombre;
    private String empresa;
    private String descripcion;
    private int duracion;
    private String estadoactual;
    ArrayList<Directores> directores;
    ArrayList<Desarrolladores> desarolladores;
    ArrayList<Consultores> consultores;

    public GBX() {
        
    }

    public GBX(String nombre, String empresa, String descripcion, int duracion, String estadoactual, ArrayList<Directores> directores, ArrayList<Desarrolladores> desarolladores, ArrayList<Consultores> consultores) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.estadoactual = estadoactual;
        this.directores = directores;
        this.desarolladores = desarolladores;
        this.consultores = consultores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getEstadoactual() {
        return estadoactual;
    }

    public void setEstadoactual(String estadoactual) {
        this.estadoactual = estadoactual;
    }

    public ArrayList<Directores> getDirectores() {
        return directores;
    }

    public void setDirectores(ArrayList<Directores> directores) {
        this.directores = directores;
    }

    public ArrayList<Desarrolladores> getDesarolladores() {
        return desarolladores;
    }

    public void setDesarolladores(ArrayList<Desarrolladores> desarolladores) {
        this.desarolladores = desarolladores;
    }

    public ArrayList<Consultores> getConsultores() {
        return consultores;
    }

    public void setConsultores(ArrayList<Consultores> consultores) {
        this.consultores = consultores;
    }

    @Override
    public String toString() {
        return "Proyecto=" + nombre + ", \nempresa=" + empresa + ", \ndescripcion=" + descripcion + ", \nduracion=" + duracion + 
                ", \nestadoactual=" + estadoactual + ", \ndirectores=" + directores + ", \ndesarolladores=" + desarolladores + ", \nconsultores=" + consultores ;
    }


    
    
}
