package com.pruebas;
/**
 * Clase TestAcceso, donde vamos a comprobar qué datos son accesibles desde otro pack
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */

/**
 * Importamos las clases Gerente y Empleado para tratar de acceder a la información que contienen esas clases
 */
import com.empresa.Empleado;
import com.empresa.Gerente;

public class TestAcceso {

    public static void main(String[] args) {
        /**
         * Creamos los objetos empleado y gerente para tratar de acceder a sus datos
         */
        Empleado empleado = new Empleado("Daniel", 2000, "Ventas", "Timotronics");
        Gerente gerente = new Gerente("Judith", 3000, "Dirección", "Timotronics");

        /**
         * Tratamos de mostrar los datos de los empleados
         */
        System.out.println("Los datos de los empleados: ");
        /**
         * Nos muestra todos los datos porque accede a ellos desde su misma clase
         */
        empleado.mostrarDatos();

        /** No nos deja acceder a mostrarDepartamento porque no estamos en el mismo paquete ni es una clase hijo de Empleado

        empleado.mostrarDepartamento(); */

        /**
         * No nos deja acceder al método mostrarBasico porque Test no forma parte del mismo paquete que Empleado

        empleado.mostrarBasico(); */

        /**
         * No nos deja acceder a registrar porque es una variable privada y solamente se puede acceder desde la misma clase
          empleado.registrar();
         */

        /**
         * Nos deja acceder al método por ser público pero éste no consigue acceder a los atributos privados porque intenta acceder desde otra clase
         */
        System.out.println("Los datos del Gerente");

        gerente.verificarAccesosGerente();
    }
}
