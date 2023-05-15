package Codigo;

import java.util.Scanner;
import java.util.ArrayList;

public class Ejecutor {
    public static void main(String[] args) {
        //Variables usadas
        Scanner entrada = new Scanner(System.in);
        ArrayList<Empleado> listaEmpleados = new ArrayList<>(0);
        int opcionMenu;

        //Desarollo
        opcionMenu = -1;
        while (opcionMenu != 4) {
            System.out.println("------------------- GESTOR DE EMPLEADOS -------------------");
            System.out.println("1) Ingresar empleado");
            System.out.println("2) Mostrar informacion empleados");
            System.out.println("3) Calcular aumento salario");
            System.out.println("4) Salir");
            System.out.println();
            System.out.print("-Ingrese una opcion: ");
            opcionMenu = entrada.nextInt();
            entrada.nextLine();
            switch (opcionMenu) {
                case 1:
                    //Creacion del objeto y entrada de datoa
                    Empleado empleado = new Empleado();
                    System.out.println("--- REGISTRO ---");
                    System.out.print("-Nombre: ");
                    empleado.setNombre(entrada.nextLine());
                    System.out.print("-Edad: ");
                    empleado.setEdad(entrada.nextInt());
                    System.out.print("-Salario: ");
                    empleado.setSalario(entrada.nextDouble());
                    entrada.nextLine();
                    System.out.println();

                    //Añadimos a la lista de empleados
                    listaEmpleados.add(empleado);
                    System.out.println("MENSAJE (Registro exitoso)");
                    System.out.println();
                    break;
                case 2:
                    int contador = 0;
                    for (Empleado elemento: listaEmpleados) {
                        contador++;
                        System.out.println("----- Empleado " +contador+ " -----");
                        System.out.println(elemento);
                    }
                    break;
                case 3:
                    //Obtenemos el ingreso salarial
                    double aumentoSalarial;
                    System.out.print("-Ingrese porcentaje de aumento salarial: ");
                    aumentoSalarial = entrada.nextDouble();
                    //Obtenemos el salario promedio de todos los empleados
                    double promedio = 0;
                    for (int i = 0; i < listaEmpleados.size(); i++) {
                        promedio = listaEmpleados.get(i).getSalario() + promedio;
                    }
                    promedio = promedio / (double) listaEmpleados.size();
                    // Si el salario del empleado es menor al promedio aplicar aumento indicado
                    for (int i = 0; i < listaEmpleados.size(); i++) {
                        if (listaEmpleados.get(i).getSalario() < promedio) {
                            listaEmpleados.get(i).setSalario((listaEmpleados.get(i).getSalario() * aumentoSalarial / (double) 100) + listaEmpleados.get(i).getSalario());
                            // Mostrar en pantalla el nuevo salario
                            System.out.println("---- AUMENTO SALARIAL ----");
                            System.out.printf("-Nombre: %s\n",listaEmpleados.get(i).getNombre());
                            System.out.printf("-Nuevo Salario: %.2f\n",listaEmpleados.get(i).getSalario());

                        }
                    }
                    break;
                case 4:
                    System.out.println();
                    System.out.println("FIN DEL PROGRAMA");
                    break;
                default:
                    System.out.println("MENSAJE (Escoja una opcion disponible)");
            }
        }


    }
}
