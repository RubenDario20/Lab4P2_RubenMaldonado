/*
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
public class Directores extends empleados {

    private String nombre;
    private String apellido;
    private int id;
    private String nacionalidad;
    private int puesto;
    private int contrato;
    ArrayList<Desarrolladores> list;
    private int proyectos;
    private double sueldo;

    public Directores() {
        super();
    }

    public Directores(String nombre, String apellido, int id, String nacionalidad, int puesto, int contrato, int proyectos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.nacionalidad = nacionalidad;
        this.puesto = puesto;
        this.contrato = contrato;
        this.proyectos = proyectos;
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

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public ArrayList<Desarrolladores> getList() {
        return list;
    }

    public void setList(ArrayList<Desarrolladores> list) {
        this.list = list;
    }

    public int getProyectos() {
        return proyectos;
    }

    public void setProyectos(int proyectos) {
        this.proyectos = proyectos;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Directores{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", nacionalidad=" + nacionalidad
                + ", puesto=" + puesto + ", contrato=" + contrato + ", list=" + list + ", proyectos=" + proyectos + ", sueldo=" + sueldo + '}';
    }

    @Override
    public double Sueldo() {
        return (proyectos * proyectos * 5.23) / (proyectos * contrato * 2.28);
    }

}
