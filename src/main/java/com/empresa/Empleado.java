package com.empresa;

/**
 * Clase Empleado donde vamos a introducir unos atributos y unos métodos y vamos a intentar tratar de acceder a ellos a través de una clase que hereda de esta y de una clase desde otro paquete
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */

public class Empleado {
    /**Atributos con diferentes modificadores de acceso a los que trataremos de acceder
     */
    private String nombre;
    /**default*/ double salario;
    protected String departamento;
    public String empresa;

    public Empleado(String nombre, double salario, String departamento, String empresa) {
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
        this.empresa = empresa;
    }


    /**
     * Método privado registrar el cual nos mostrar el mensaje "Registrando empleado" en el caso de ser accesible
     * Solamente será accesible desde esta clase ya que es privado
     */

    private void registrar() {
        System.out.println("Registrando empleado");
    }
    /**
     * Método default mostrarBasico el cual será accesible solamente por las clases que estén dentro del mismo paquete
     */

    /**default*/ void mostrarBasico() {
        System.out.println("Nombre: " + nombre + ", Salario: " + salario);
    }

    /**
     * Método protected mostrarDepartamento el cual mostará el departamento y será accesible desde las clases del mismo paquete, aunque también será accesible desde subclases vinculadas a éste aunque estén en otro paquete diferente.
     */

    protected void mostrarDepartamento() {
        System.out.println("Departamento: " + departamento);
    }

    /**
     * Método pubilc mostrarDatos el cual será accesible desde cualquier paquete del proyecto
     */

    public void mostrarDatos() {
        System.out.println("Empresa: " + empresa);
        registrar();
        mostrarBasico();
        mostrarDepartamento();
    }
}
