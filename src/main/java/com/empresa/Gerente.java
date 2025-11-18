package com.empresa;

/**
 *Clase Gerente en la que vamos a intentar acceder a los datos de la clase Empleado y ver cuales se pueden mostrar y cuales no
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */

/**
 * Extendeos la clase Empleado con el extra que aportamos en gerente
 */

public class Gerente extends Empleado {
    /**
     * Establecemos las variables para la clase Gerente y la herencia "super" de la clase Empleado
     * @param nombre
     * @param salario
     * @param departamento
     * @param empresa
     */


    public Gerente(String nombre, double salario, String departamento, String empresa) {
        super(nombre, salario, departamento, empresa);
    }

    public void verificarAccesosGerente() {
        // System.out.println("Nombre: " + nombre); (No tiene acceso por ser privado)
        System.out.println("Salario: " + salario);
        System.out.println("Departamento: " + departamento);
        System.out.println("Empresa: " + empresa);

        // registrar(); (No lo muestra por ser privado)
        /**
         * El resto de métodos sí accede a ellos al formar parte del mismo paquete
         */
        mostrarBasico();
        mostrarDepartamento();
        mostrarDatos();
    }
}
