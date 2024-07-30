/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Josue_Rosales
 */
public class Empleado extends Persona {
    private String codigoEmpleado, puesto;

    public Empleado(){}

    public Empleado(String codigoEmpleado, String puesto, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.codigoEmpleado = codigoEmpleado;
        this.puesto = puesto;
    }
      public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public void agregar(){
        System.out.println("Nombres: "+ this.getNombres());
        System.out.println("Apellidos: "+ getApellidos());
        System.out.println("Direccion: "+ this.getDireccion());
        System.out.println("Telefono: "+ this.getTelefono());
        System.out.println("Fecha Nacimiento: "+ this.getFecha_nacimiento());
        System.out.println("Codigo de Empleado: " + getCodigoEmpleado());
        System.out.println("Puesto: " + getPuesto());
        System.out.println("______________________________________");
    };

  
}

