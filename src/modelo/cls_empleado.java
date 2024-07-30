/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Josue_Rosales
 */
public class cls_empleado extends cls_persona{
    private String codigoEmpleado, puesto;

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
        System.out.println("Fecha Nacimiento: "+ this.getFechaNacimiento());
        System.out.println("Codigo Empleado: "+ getCodigoEmpleado());
        System.out.println("Puesto: "+ getPuesto());
    };
}
