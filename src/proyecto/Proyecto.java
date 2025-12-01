/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import java.util.Scanner;

/**
 *
 * @author zunig
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creacion de vehículos
        Vehiculo v1 = new Vehiculo("ABC123", "Toyota", "Corolla", 2020, 9000, "Auto");
        Vehiculo v2 = new Vehiculo("SAS884", "Honda", "Civic", 2018, 10760, "Auto");
        Vehiculo v3 = new Vehiculo("XLR854", "Ford", "Explorer", 2025, 54000, "SUV");
        Vehiculo v4 = new Vehiculo("HGF635", "Lexus", "NX", 2022, 18000, "Auto");
        Vehiculo v5 = new Vehiculo("ABE321", "Toyota", "HILUX GR", 2024, 32070, "Pickup");
        Vehiculo v6 = new Vehiculo("ADF553", "BYD", "Shark", 2025, 302450, "Pickup");
        Vehiculo v7 = new Vehiculo("FOR421", "BMW", "X4", 2023, 86030, "SUV");
        Vehiculo v8 = new Vehiculo("OOP442", "Hyundai", "Tucson", 2017, 64500, "SUV");

        Vehiculo[] vehiculos = {v1, v2, v3, v4, v5, v6, v7, v8};

        // Creacion de conductores
        Conductor c1 = new Conductor("C001", "Marco Lopez", "B12345", 5, "31420110", v1);
        Conductor c2 = new Conductor("C002", "Diego Zuniga", "B54321", 3, "77656789", v2);
        Conductor c3 = new Conductor("C003", "Marvella Flores", "A18432", 8, "99832156", v3);
        Conductor c4 = new Conductor("C004", "Carmen Sanders", "D12464", 12, "88574362", v4);
        Conductor c5 = new Conductor("C005", "Mario Bulnes", "H85762", 1, "98345676", v5);
        Conductor c6 = new Conductor("C006", "Harold Romero", "K94736", 21, "31265847", v6);
        Conductor c7 = new Conductor("C007", "Monica Martinez", "B04832", 7, "94837261", v7);
        Conductor c8 = new Conductor("C008", "Cesar Irias", "T58349", 9, "38143235", v8);

        Conductor[] conductores = {c1, c2, c3, c4, c5, c6, c7, c8};

        System.out.println("---Lista de conductores---");
        for (int i = 0; i < conductores.length; i++) {
            System.out.println(conductores[i]);
        }

        System.out.println("\n---Lista de vehiculos---");
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println(vehiculos[i]);
        }

        // Suma kilometraje
        System.out.println();
        v1.registrarViaje(150);
        v2.registrarViaje(200);
        v3.registrarViaje(250);
        v4.registrarViaje(300);
        v5.registrarViaje(350);
        v6.registrarViaje(400);
        v7.registrarViaje(450);
        v8.registrarViaje(500);

        // Revision del  servicio
        System.out.println("\n---Revision de servicio---");
        for (int i = 0; i < vehiculos.length; i++) {
            vehiculos[i].requiereServicio();
        }

        // Búsqueda de conductor
        System.out.println("Ingrese nombre del conductor que desea buscar:");
        String buscar = entrada.nextLine().trim();
        boolean encontrado = false;

        for (int i = 0; i < conductores.length; i++) {
            if (conductores[i].getNombre().equalsIgnoreCase(buscar)) {
                System.out.println("Conductor encontrado:");
                System.out.println(conductores[i]);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Conductor no encontrado.");
        }

        // Ordenar vehículos por año (Bubble Sort)
        for (int i = 0; i < vehiculos.length - 1; i++) {
            for (int j = 0; j < vehiculos.length - 1 - i; j++) {
                if (vehiculos[j].getAnio() > vehiculos[j + 1].getAnio()) {
                    Vehiculo temp = vehiculos[j];
                    vehiculos[j] = vehiculos[j + 1];
                    vehiculos[j + 1] = temp;
                }
            }
        }

        // Mostrar vehículos ordenados
        System.out.println("\n---Vehiculos ordenados por anio---");
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println(vehiculos[i]);
        }
    }

}
