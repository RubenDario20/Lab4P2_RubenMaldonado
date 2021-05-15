package lab4p2_rubenmaldonado;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruben Dario Maldonado
 */
public class Lab4P2_RubenMaldonado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int resp = 0;
        ArrayList employees = new ArrayList();
        ArrayList<GBX> gbx = new ArrayList();
        while (resp != 2) {
            resp = Integer.parseInt(JOptionPane.showInputDialog("----GBX----\n"
                    + "1. Login\n"
                    + "2. Salir"));

            switch (resp) {
                case 1: {
                    String user = JOptionPane.showInputDialog("User").toLowerCase();
                    int code = Integer.parseInt(JOptionPane.showInputDialog("Password"));
                    if ("admin".equals(user) && code == 1234) {
                        JOptionPane.showMessageDialog(null, "Bienvenido Jefe");
                        int posi = 0;
                        while (posi != 8) {
                            posi = Integer.parseInt(JOptionPane.showInputDialog("----GBX----\n"
                                    + "1. Ver Personal\n"
                                    + "2. Agregar Personal\n"
                                    + "3. Modificar Personal\n"
                                    + "4. Borrar Personal\n"
                                    + "5. Agregar Proyecto\n"
                                    + "6. Eliminar Proyecto\n"
                                    + "7. Ver Proyectos\n"
                                    + "8. Salir"));

                            switch (posi) {
                                case 1: {
                                    if (!employees.isEmpty()) {
                                        for (Object i : employees) {
                                            JOptionPane.showMessageDialog(null, "[" + employees.indexOf(i) + "]" + " " + i);
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No hay personal registrado actualemente");
                                    }
                                    break;
                                }
                                case 2: {
                                    int po = 0;
                                    while (po != 4) {
                                        po = Integer.parseInt(JOptionPane.showInputDialog("====MEN====\n"
                                                + "1. Agregar Desarrollador\n"
                                                + "2. Agregar Consultor\n"
                                                + "3. Agregar Director\n"
                                                + "4. Salir"));
                                        switch (po) {
                                            case 1: {
                                                JOptionPane.showMessageDialog(null, "Desarrollador");
                                                String nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
                                                String apellido = JOptionPane.showInputDialog("Ingrese su apellido");
                                                int Id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
                                                String nacionalidad = JOptionPane.showInputDialog("Nacionalidad");
                                                int proyectos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de proyectos realizados"));
                                                int experience = Integer.parseInt(JOptionPane.showInputDialog("Años de Experiencia"));
                                                int contrato = Integer.parseInt(JOptionPane.showInputDialog("Años de Contrato"));
                                                String lenguaje = JOptionPane.showInputDialog("Lenguaje de Programacion Preferido");
                                                int horas = Integer.parseInt(JOptionPane.showInputDialog("Horas de Trabajo Diarias"));
                                                empleados de = new Desarrolladores(nombre, apellido, Id, nacionalidad, proyectos, experience, contrato, lenguaje, horas);
                                                de.Sueldo();
                                                employees.add(de);
                                                JOptionPane.showMessageDialog(null, "Desarollador se ha agregado correctamente sus datos al sistema");
                                                break;
                                            }
                                            case 2: {
                                                JOptionPane.showMessageDialog(null, "Consultor");
                                                String nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
                                                String apellido = JOptionPane.showInputDialog("Ingrese su apellido");
                                                int Id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
                                                String nacionalidad = JOptionPane.showInputDialog("Nacionalidad");
                                                int proyectos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de proyectos realizados"));
                                                int contrato = Integer.parseInt(JOptionPane.showInputDialog("Años de Contrato"));
                                                String experience = JOptionPane.showInputDialog("Principal campo de experiencia");
                                                String tiempo = JOptionPane.showInputDialog("Tiempo de duracion de la consulteria");
                                                empleados c = new Consultores(nombre, apellido, Id, nacionalidad, proyectos, contrato, experience, tiempo);
                                                c.Sueldo();
                                                employees.add(c);
                                                JOptionPane.showMessageDialog(null, "Consultor se ha agregado correctamente sus datos al sistema");
                                                break;
                                            }
                                            case 3: {
                                                JOptionPane.showMessageDialog(null, "Director");
                                                String nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
                                                String apellido = JOptionPane.showInputDialog("Ingrese su apellido");
                                                int Id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
                                                String nacionalidad = JOptionPane.showInputDialog("Nacionalidad");
                                                int puesto = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de años en su puesto"));
                                                int contrato = Integer.parseInt(JOptionPane.showInputDialog("Años de Contrato"));
                                                int proyectos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de proyectos realizados"));
                                                empleados d = new Directores(nombre, apellido, Id, nacionalidad, puesto, contrato, proyectos);
                                                d.Sueldo();
                                                employees.add(d);
                                                JOptionPane.showMessageDialog(null, "Desarollador se ha agregado correctamente sus datos al sistema");
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                                case 3: {
                                    if (!employees.isEmpty()) {
                                        int posic = Integer.parseInt(JOptionPane.showInputDialog("Que posicion desea modificar"));
                                        if (posic >= 0 && posic <= employees.size()) {
                                            if (employees.get(posic) instanceof Desarrolladores) {
                                                modificardesarolladores(employees, posic);
                                            } else if (employees.get(posic) instanceof Consultores) {
                                                modificar(employees, posic);
                                            } else if (employees.get(posic) instanceof Directores) {
                                                modiyDirectores(employees, posic);
                                            }
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Posicion no valida");
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "NO hay personal registrado actualmente");
                                    }
                                    break;
                                }
                                case 4: {
                                    if (!employees.isEmpty()) {
                                        int posic = Integer.parseInt(JOptionPane.showInputDialog("Que posicion desea Borrar"));
                                        if (posic >= 0 && posic <= employees.size()) {
                                            employees.remove(posic);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Posicion no valida");
                                        }
                                    }
                                    break;
                                }
                                case 5: {
                                    String name = JOptionPane.showInputDialog("Nombre del proyecto");
                                    String empresa = JOptionPane.showInputDialog("Nombre de la empresa que solicito el proyecto");
                                    String descripcion = JOptionPane.showInputDialog("Descripcion del proyecto");
                                    String estado = JOptionPane.showInputDialog("Estado Actual del proyecto");
                                    int duracion = Integer.parseInt(JOptionPane.showInputDialog("Duracion del proyecto años"));
                                    ArrayList aux1 = new ArrayList(), aux2 = new ArrayList(), aux3 = new ArrayList();
                                    if (!employees.isEmpty()) {
                                        for (Object i : employees) {
                                            if (i instanceof Directores) {
                                                aux1.add(i);
                                            } else if (i instanceof Desarrolladores) {
                                                aux2.add(i);
                                            } else {
                                                aux3.add(i);
                                            }
                                        }
                                    }
                                    ArrayList x1 = new ArrayList();
                                    for (Object i : employees) {
                                        JOptionPane.showMessageDialog(null, "[" + employees.indexOf(i) + "]" + " " + i);
                                    }
                                    if (!aux1.isEmpty()) {
                                        char au = 's';
                                        int cont = 0;
                                        boolean supervisor = true;
                                        while (au == 's' && supervisor == true) {
                                            cont++;
                                            int desaro = Integer.parseInt(JOptionPane.showInputDialog("De acuerdo a las posiciones anteriormente mostradas, que director desea agreagar al proyecto"));
                                            if (desaro >= 0 && desaro < employees.size()) {
                                                if (employees.get(desaro) instanceof Directores) {
                                                    x1.add(employees.get(desaro));
                                                }
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Opcion no valida");
                                            }
                                            String d = JOptionPane.showInputDialog("Desea agregar otro director[s|n]").toLowerCase();
                                            au = d.charAt(0);
                                            if (cont == 2) {
                                                JOptionPane.showMessageDialog(null, "Ha llegado al maximo");
                                                supervisor = false;
                                            }
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No hay directores disponibles");
                                    }
                                    ArrayList x2 = new ArrayList();
                                    for (Object i : employees) {
                                        if (i instanceof Desarrolladores) {
                                            JOptionPane.showMessageDialog(null, "[" + employees.indexOf(i) + "]" + " " + i);
                                        }
                                    }
                                    if (!aux2.isEmpty()) {
                                        char au1 = 's';
                                        int cont = 0;
                                        boolean supervisor = true;
                                        while (au1 == 's' && supervisor == true) {
                                            cont++;
                                            int desaro = Integer.parseInt(JOptionPane.showInputDialog("De acuerdo a las posiciones anteriormente mostradas, que desarrollador desea agreagar al proyecto"));
                                            if (desaro >= 0 && desaro < employees.size()) {
                                                if (employees.get(desaro) instanceof Desarrolladores) {
                                                    x2.add(employees.get(desaro));
                                                }
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Opcion no valida");
                                            }
                                            String d = JOptionPane.showInputDialog("Desea agregar otro Desarrollador[s|n]").toLowerCase();
                                            au1 = d.charAt(0);
                                            if (cont == 5) {
                                                JOptionPane.showMessageDialog(null, "Ha llegado al maximo");
                                                supervisor = false;
                                            }
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No hay desarrolladres disponibles");
                                    }
                                    ArrayList x3 = new ArrayList();
                                    for (Object i : employees) {
                                        if (i instanceof Consultores) {
                                            JOptionPane.showMessageDialog(null, "[" + employees.indexOf(i) + "]" + " " + i);
                                        }
                                    }
                                    if (!aux3.isEmpty()) {
                                        char au1 = 's';
                                        int cont = 0;
                                        boolean supervisor = true;
                                        while (au1 == 's' && supervisor == true) {
                                            cont++;
                                            int desaro = Integer.parseInt(JOptionPane.showInputDialog("De acuerdo a las posiciones anteriormente mostradas, que Consultor desea agreagar al proyecto"));
                                            if (desaro >= 0 && desaro < employees.size()) {
                                                if (employees.get(desaro) instanceof Consultores) {
                                                    x3.add(employees.get(desaro));
                                                }
                                            } else {
                                                JOptionPane.showInputDialog("Opcion no valida");
                                            }
                                            String d = JOptionPane.showInputDialog("Desea agregar otro Consultor[s|n]").toLowerCase();
                                            au1 = d.charAt(0);
                                            if (cont == 3) {
                                                JOptionPane.showMessageDialog(null, "Ha llegado al maximo");
                                                supervisor = false;
                                            }
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "NO hay consultores disponibles");
                                    }
                                    gbx.add(new GBX(name, empresa, descripcion, duracion, estado, x1, x2, x3));
                                    break;
                                }
                                case 6: {
                                    if (!gbx.isEmpty()) {
                                        int po = Integer.parseInt(JOptionPane.showInputDialog("Que posicion se ubica el proyecto que desea borrar"));
                                        if (po >= 0 && po <= gbx.size()) {
                                            gbx.remove(po);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Posicion no valida");
                                        }
                                    }
                                    break;
                                }
                                case 7: {
                                    if (!gbx.isEmpty()) {
                                        for (Object i : gbx) {
                                            JOptionPane.showMessageDialog(null, "[" + gbx.indexOf(i) + "]" + " " + i);
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No hay proyectos disponibles");
                                    }
                                    break;
                                }
                            }
                        }
                    } else if ("desarrollador".equals(user)) {
                        JOptionPane.showMessageDialog(null, "Desarrollador");
                        String nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
                        String apellido = JOptionPane.showInputDialog("Ingrese su apellido");
                        int Id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
                        String nacionalidad = JOptionPane.showInputDialog("Nacionalidad");
                        int proyectos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de proyectos realizados"));
                        int experience = Integer.parseInt(JOptionPane.showInputDialog("Años de Experiencia"));
                        int contrato = Integer.parseInt(JOptionPane.showInputDialog("Años de Contrato"));
                        String lenguaje = JOptionPane.showInputDialog("Lenguaje de Programacion Preferido");
                        int horas = Integer.parseInt(JOptionPane.showInputDialog("Horas de Trabajo Diarias"));
                        empleados de = new Desarrolladores(nombre, apellido, Id, nacionalidad, proyectos, experience, contrato, lenguaje, horas);
                        de.Sueldo();
                        employees.add(de);
                        JOptionPane.showMessageDialog(null, "Desarollador se ha agregado correctamente sus datos al sistema");
                        int opc = 0;
                        while (opc != 4) {
                            opc = Integer.parseInt(JOptionPane.showInputDialog(nombre.toUpperCase() + " " + apellido.toUpperCase() + "\n"
                                    + "-----------MENU-----------\n"
                                    + "1. Ver Cuenta\n"
                                    + "2. Eliminar Cuenta\n"
                                    + "3. Ver Proyectos\n"
                                    + "4. Salir"));
                            switch (opc) {
                                case 1: {
                                    JOptionPane.showMessageDialog(null, employees.get(employees.size() - 1));
                                    break;
                                }
                                case 2: {
                                    employees.remove(employees.size() - 1);
                                    opc = 4;
                                    break;
                                }
                                case 3: {
                                    if (!gbx.isEmpty()) {
                                        ArrayList aux = new ArrayList();
                                        for (int t = 0; t < gbx.size(); t++) {
                                            aux.add(gbx.get(t).getDesarolladores());
                                        }
                                        for (int j = 0; j < aux.size(); j++) {
                                            ArrayList s = new ArrayList();
                                            s.add(aux.get(j));
                                            if (s.contains(user)) {
                                                JOptionPane.showMessageDialog(null, "Proyecto Asignado: ");
                                                JOptionPane.showMessageDialog(null, gbx.get(j));
                                            }

                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Acualmente no hay proyectos disponibles");
                                    }
                                    break;

                                }
                            }
                        }

                    } else if ("consultor".equals(user)) {
                        JOptionPane.showMessageDialog(null, "Consultor");
                        String nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
                        String apellido = JOptionPane.showInputDialog("Ingrese su apellido");
                        int Id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
                        String nacionalidad = JOptionPane.showInputDialog("Nacionalidad");
                        int proyectos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de proyectos realizados"));
                        int contrato = Integer.parseInt(JOptionPane.showInputDialog("Años de Contrato"));
                        String experience = JOptionPane.showInputDialog("Principal campo de experiencia");
                        String tiempo = JOptionPane.showInputDialog("Tiempo de duracion de la consulteria");
                        empleados c = new Consultores(nombre, apellido, Id, nacionalidad, proyectos, contrato, experience, tiempo);
                        c.Sueldo();
                        employees.add(c);
                        JOptionPane.showMessageDialog(null, "Consultor se ha agregado correctamente sus datos al sistema");
                        int opc = 0;
                        while (opc != 5) {
                            opc = Integer.parseInt(JOptionPane.showInputDialog(nombre.toUpperCase() + " " + apellido.toUpperCase() + "\n"
                                    + "-----------MENU-----------\n"
                                    + "1. Ver Cuenta\n"
                                    + "2. Modificar Cuenta\n"
                                    + "3. Eliminar Cuenta\n"
                                    + "4. Ver Proyectos\n"
                                    + "5. Salir"));
                            switch (opc) {
                                case 1: {
                                    JOptionPane.showMessageDialog(null, employees.get(employees.size() - 1));
                                    break;
                                }
                                case 2: {
                                    employees = modificar(employees, employees.size());
                                    break;
                                }
                                case 3: {
                                    employees.remove(employees.size() - 1);
                                    opc = 5;
                                    break;
                                }
                                case 4: {
                                    if (!gbx.isEmpty()) {
                                        ArrayList aux = new ArrayList();
                                        for (int t = 0; t < gbx.size(); t++) {
                                            aux.add(gbx.get(t).getConsultores());
                                        }
                                        for (int j = 0; j < aux.size(); j++) {
                                            ArrayList s = new ArrayList();
                                            s.add(aux.get(j));
                                            if (s.contains(user)) {
                                                JOptionPane.showMessageDialog(null, "Proyecto Asignado: ");
                                                JOptionPane.showMessageDialog(null, gbx.get(j));
                                            }

                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Acualmente no hay proyectos disponibles");
                                    }
                                    break;

                                }
                            }
                        }

                    } else if ("director".equals(user)) {
                        JOptionPane.showMessageDialog(null, "Director");
                        String nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
                        String apellido = JOptionPane.showInputDialog("Ingrese su apellido");
                        int Id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
                        String nacionalidad = JOptionPane.showInputDialog("Nacionalidad");
                        int puesto = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de años en su puesto"));
                        int contrato = Integer.parseInt(JOptionPane.showInputDialog("Años de Contrato"));
                        int proyectos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de proyectos realizados"));
                        empleados d = new Directores(nombre, apellido, Id, nacionalidad, puesto, contrato, proyectos);
                        d.Sueldo();
                        employees.add(d);
                        JOptionPane.showMessageDialog(null, "Desarollador se ha agregado correctamente sus datos al sistema");
                        int opc = 0;
                        while (opc != 9) {
                            opc = Integer.parseInt(JOptionPane.showInputDialog(nombre.toUpperCase() + " " + apellido.toUpperCase() + "\n"
                                    + "-----------MENU-----------\n"
                                    + "1. Ver Cuenta\n"
                                    + "2. Ver Desarolladores y Consultores\n"
                                    + "3. Modificar Desarollador/Consultor\n"
                                    + "4. Borrar Desarrollador/Consultor\n"
                                    + "5. Agregar Desarrollador\n"
                                    + "6. Agregar Consultor\n"
                                    + "7. Ver Proyectos\n"
                                    + "8. Proyectos Terminados\n"
                                    + "9. Salir"));
                            switch (opc) {
                                case 1: {
                                    JOptionPane.showMessageDialog(null, employees.get(employees.size() - 1));
                                    break;
                                }
                                case 2: {
                                    if (!employees.isEmpty()) {
                                        for (Object x : employees) {
                                            if (x instanceof Desarrolladores || x instanceof Consultores) {
                                                JOptionPane.showMessageDialog(null, employees.indexOf(x));
                                                JOptionPane.showMessageDialog(null, x);
                                            }
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "NO hay Desarrolladores ni Consultores registrados en el sistema");
                                    }
                                    break;
                                }
                                case 3: {
                                    if (!employees.isEmpty()) {
                                        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Que posicion del Desarrollador o Consultor desea modificar"));
                                        if (posicion >= 0 && posicion < employees.size()) {
                                            if (employees.get(posicion) instanceof Consultores) {
                                                employees = modificar(employees, posicion);
                                            } else if (employees.get(posicion) instanceof Desarrolladores) {
                                                employees = modificardesarolladores(employees, posicion);
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Opcion no disponible");
                                            }

                                        } else {
                                            JOptionPane.showMessageDialog(null, "Posicion no valida");
                                        }

                                    } else {
                                        JOptionPane.showMessageDialog(null, "REGISTRO VACIO");
                                    }
                                    break;
                                }
                                case 4: {
                                    if (!employees.isEmpty()) {
                                        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Que posicion del Desarrollador o Consultor desea Borrar"));
                                        if (posicion >= 0 && posicion < employees.size()) {
                                            if (employees.get(posicion) instanceof Consultores) {
                                                employees.remove(posicion);
                                            } else if (employees.get(posicion) instanceof Desarrolladores) {
                                                employees.remove(posicion);
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Opcion no disponible");
                                            }
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Posicion no valida");
                                        }

                                    } else {
                                        JOptionPane.showMessageDialog(null, "REGISTRO VACIO");
                                    }
                                    break;
                                }
                                case 5: {
                                    JOptionPane.showMessageDialog(null, "Desarrollador");
                                    String nombr = JOptionPane.showInputDialog("Ingrese su Nombre");
                                    String apellio = JOptionPane.showInputDialog("Ingrese su apellido");
                                    int I = Integer.parseInt(JOptionPane.showInputDialog("ID"));
                                    String nacionalida = JOptionPane.showInputDialog("Nacionalidad");
                                    int proyects = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de proyectos realizados"));
                                    int experience = Integer.parseInt(JOptionPane.showInputDialog("Años de Experiencia"));
                                    int contrao = Integer.parseInt(JOptionPane.showInputDialog("Años de Contrato"));
                                    String lenguaje = JOptionPane.showInputDialog("Lenguaje de Programacion Preferido");
                                    int horas = Integer.parseInt(JOptionPane.showInputDialog("Horas de Trabajo Diarias"));
                                    empleados de = new Desarrolladores(nombr, apellio, I, nacionalida, proyects, experience, contrao, lenguaje, horas);
                                    de.Sueldo();
                                    employees.add(de);
                                    JOptionPane.showMessageDialog(null, "Desarollador se ha agregado exitosamente");
                                    break;
                                }
                                case 6: {
                                    JOptionPane.showMessageDialog(null, "Consultor");
                                    String nombr = JOptionPane.showInputDialog("Ingrese su Nombre");
                                    String apellio = JOptionPane.showInputDialog("Ingrese su apellido");
                                    int I = Integer.parseInt(JOptionPane.showInputDialog("ID"));
                                    String nacionalida = JOptionPane.showInputDialog("Nacionalidad");
                                    int proyecto = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de proyectos realizados"));
                                    int contrao = Integer.parseInt(JOptionPane.showInputDialog("Años de Contrato"));
                                    String experience = JOptionPane.showInputDialog("Principal campo de experiencia");
                                    String tiempo = JOptionPane.showInputDialog("Tiempo de duracion de la consulteria");
                                    empleados c = new Consultores(nombr, apellio, I, nacionalida, proyecto, contrao, experience, tiempo);
                                    c.Sueldo();
                                    employees.add(c);
                                    JOptionPane.showMessageDialog(null, "Consultor se ha agregado exitosamente");
                                    break;

                                }
                                case 7: {
                                    if (!gbx.isEmpty()) {
                                        ArrayList aux = new ArrayList();
                                        for (int t = 0; t < gbx.size(); t++) {
                                            aux.add(gbx.get(t).getDirectores());
                                        }
                                        for (int j = 0; j < aux.size(); j++) {
                                            ArrayList s = new ArrayList();
                                            s.add(aux.get(j));
                                            if (s.contains(user)) {
                                                JOptionPane.showMessageDialog(null, "Proyecto Asignado: ");
                                                JOptionPane.showMessageDialog(null, gbx.get(j));
                                            }
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Acualmente no hay proyectos disponibles");
                                    }
                                    break;
                                }
                                case 8: {
                                    if (!gbx.isEmpty()) {
                                        int posi = Integer.parseInt(JOptionPane.showInputDialog("Posicion del proyecto donde desea dar por terminado"));
                                        if (posi >= 0 && posi < gbx.size()) {
                                            gbx.get(posi).setEstadoactual("TERMINADO");
                                        } else {
                                            JOptionPane.showMessageDialog(null, "posicion no valida");
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No hay proyectos disponibles actualemente");
                                    }
                                    break;
                                }

                            }
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Opcion no valida");
                    }
                    break;
                }
            }
        }
    }

    public static ArrayList modificar(ArrayList x, int i) {
        int opcion = 0;
        while (opcion != 9) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu\n"
                    + "1. Nombre\n"
                    + "2. Apellido\n"
                    + "3. Id\n"
                    + "4. Nacionalidad\n"
                    + "5. Proyectos\n"
                    + "6. Contrato\n"
                    + "7. Experiencia\n"
                    + "8. Tiempo\n"
                    + "9. Salir"));
            switch (opcion) {
                case 1: {
                    String nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
                    ((Consultores) x.get(i)).setNombre(nombre);
                    break;
                }
                case 2: {
                    String apellido = JOptionPane.showInputDialog("Ingrese su apellido");
                    ((Consultores) x.get(i)).setApellido(apellido);
                    break;
                }
                case 3: {
                    int Id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
                    ((Consultores) x.get(i)).setId(Id);
                    break;
                }
                case 4: {
                    String nacionalidad = JOptionPane.showInputDialog("Nacionalidad");
                    ((Consultores) x.get(i)).setNacionalidad(nacionalidad);
                    break;
                }
                case 5: {
                    int proyectos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de proyectos realizados"));
                    ((Consultores) x.get(i)).setProyectos(proyectos);
                    break;
                }
                case 6: {
                    int contrato = Integer.parseInt(JOptionPane.showInputDialog("Años de Contrato"));
                    ((Consultores) x.get(i)).setContrato(contrato);
                    break;
                }
                case 7: {
                    String experience = JOptionPane.showInputDialog("Principal campo de experiencia");
                    ((Consultores) x.get(i)).setCampo(experience);
                    break;
                }
                case 8: {
                    String tiempo = JOptionPane.showInputDialog("Tiempo de duracion de la consulteria");
                    ((Consultores) x.get(i)).setDuracion(tiempo);
                    break;
                }
            }
        }
        ((Consultores) x.get(i)).Sueldo();
        return x;
    }

    public static ArrayList modificardesarolladores(ArrayList x, int i) {
        int opcion = 0;
        while (opcion != 10) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu\n"
                    + "1. Nombre\n"
                    + "2. Apellido\n"
                    + "3. Id\n"
                    + "4. Nacionalidad\n"
                    + "5. Cantidad de proyectos Realizados\n"
                    + "6. Experiencia\n"
                    + "7. Contrato\n"
                    + "8. Lenguaje de Programacion preferido\n"
                    + "9. Horas de Trabajo Diarias\n"
                    + "10. Salir"));
            switch (opcion) {
                case 1: {
                    String nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
                    ((Desarrolladores) x.get(i)).setNombre(nombre);
                    break;
                }
                case 2: {
                    String apellido = JOptionPane.showInputDialog("Ingrese su apellido");
                    ((Desarrolladores) x.get(i)).setApellido(apellido);
                    break;
                }
                case 3: {
                    int Id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
                    ((Desarrolladores) x.get(i)).setId(Id);
                    break;
                }
                case 4: {
                    String nacionalidad = JOptionPane.showInputDialog("Nacionalidad");
                    ((Desarrolladores) x.get(i)).setNacionalidad(nacionalidad);
                    break;
                }
                case 5: {
                    int proyectos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de proyectos realizados"));
                    ((Desarrolladores) x.get(i)).setProyectos(proyectos);
                    break;
                }
                case 6: {
                    int contrato = Integer.parseInt(JOptionPane.showInputDialog("Años de Experiencia"));
                    ((Desarrolladores) x.get(i)).setExperiencia(contrato);
                    break;
                }
                case 7: {
                    int experience = Integer.parseInt(JOptionPane.showInputDialog("Años de Contrato"));
                    ((Desarrolladores) x.get(i)).setContrato(experience);
                    break;
                }
                case 8: {
                    String tiempo = JOptionPane.showInputDialog("Lenguaje de Programacion Preferido");
                    ((Desarrolladores) x.get(i)).setLenguaje(tiempo);
                    break;
                }
                case 9: {
                    int horas = Integer.parseInt(JOptionPane.showInputDialog("Horas de Trabajo Diarias"));
                    ((Desarrolladores) x.get(i)).setHoras(horas);
                    break;
                }
            }
        }
        ((Desarrolladores) x.get(i)).Sueldo();
        return x;
    }

    public static ArrayList modifygbx(ArrayList x, int i) {

        return x;
    }

    public static ArrayList modiyDirectores(ArrayList x, int i) {

        int opcion = 0;
        while (opcion != 7) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu\n"
                    + "1. Nombre\n"
                    + "2. Apellido\n"
                    + "3. Id\n"
                    + "4. Nacionalidad\n"
                    + "5. Puesto\n"
                    + "6. Cantidad de proyectos realizados\n"
                    + "7. Salir"));
            switch (opcion) {
                case 1: {
                    String nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
                    ((Directores) x.get(i)).setNombre(nombre);
                    break;
                }
                case 2: {
                    String apellido = JOptionPane.showInputDialog("Ingrese su apellido");
                    ((Directores) x.get(i)).setApellido(apellido);
                    break;
                }
                case 3: {
                    int Id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
                    ((Directores) x.get(i)).setId(Id);
                    break;
                }
                case 4: {
                    String nacionalidad = JOptionPane.showInputDialog("Nacionalidad");
                    ((Directores) x.get(i)).setNacionalidad(nacionalidad);
                    break;
                }
                case 5: {
                    int proyectos = Integer.parseInt(JOptionPane.showInputDialog("Años durante su puesto"));
                    ((Directores) x.get(i)).setPuesto(proyectos);
                    break;
                }
                case 6: {
                    int contrato = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de proyectos realizados"));
                    ((Directores) x.get(i)).setProyectos(contrato);
                    break;
                }
            }
        }
        ((Directores) x.get(i)).Sueldo();
        return x;
    }

}
