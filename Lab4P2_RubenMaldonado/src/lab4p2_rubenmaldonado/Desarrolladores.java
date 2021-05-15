/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_rubenmaldonado;

/**
 *
 * @author Ruben Dario Maldonado
 */
public class Desarrolladores extends empleados {

    private String nombre;
    private String apellido;
    private int id;
    private String nacionalidad;
    private int proyectos;
    private int experiencia;
    private int contrato;
    private String lenguaje;
    private int horas;
    private double sueldo;

    public Desarrolladores() {
        super();
    }

    public Desarrolladores(String nombre, String apellido, int id, String nacionalidad, int proyectos, int experiencia, int contrato, String lenguaje, int horas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.nacionalidad = nacionalidad;
        this.proyectos = proyectos;
        this.experiencia = experiencia;
        this.contrato = contrato;
        this.lenguaje = lenguaje;
        this.horas = horas;
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

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Desarrolladores{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", nacionalidad=" + nacionalidad
                + ", proyectos=" + proyectos + ", experiencia=" + experiencia + ", contrato=" + contrato + ", lenguaje=" + lenguaje + ", horas=" + horas + ", sueldo=" + sueldo + '}';
    }

    @Override
    public double Sueldo() {
        double aux1 = proyectos * 11500 * 2;
        double aux2 = proyectos + contrato;
        return aux1 / aux2;
    }

}
