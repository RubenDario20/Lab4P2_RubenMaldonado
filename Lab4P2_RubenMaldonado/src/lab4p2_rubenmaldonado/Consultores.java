/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_rubenmaldonado;

/**
 *
 * @author Ruben Dario Arias
 */
public class Consultores extends empleados {

    private String nombre;
    private String apellido;
    private int id;
    private String nacionalidad;
    private int proyectos;
    private int contrato;
    private String campo;
    private String duracion;

    public Consultores() {
        super();
    }

    public Consultores(String nombre, String apellido, int id, String nacionalidad, int proyectos, int contrato, String campo, String duracion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.nacionalidad = nacionalidad;
        this.proyectos = proyectos;
        this.contrato = contrato;
        this.campo = campo;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getProyectos() {
        return proyectos;
    }

    public void setProyectos(int proyectos) {
        this.proyectos = proyectos;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Consultores{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", nacionalidad=" + nacionalidad + 
                ", proyectos=" + proyectos + ", contrato=" + contrato + ", campo=" + campo + ", duracion=" + duracion + '}';
    }
    
    @Override
    public double Sueldo(){
        double aux = proyectos * 13280 * 4.13;
        double aux2 = proyectos * contrato;
        return aux/aux2;
    }
    
}
