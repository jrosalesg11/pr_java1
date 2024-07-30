/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Josue_Rosales
 */
public class Cliente extends Persona {
    private String Nit;

    public Cliente(){}
    public Cliente(String Nit, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.Nit = Nit;
    }

    public String getNit() {
        return Nit;
    }

    public void setNit(String Nit) {
        this.Nit = Nit;
    }
    @Override
    public void agregar(){
        System.out.println("Nit: " + getNit());
        System.out.println("Nombres: "+ this.getNombres());
        System.out.println("Apellidos: "+ getApellidos());
        System.out.println("Direccion: "+ this.getDireccion());
        System.out.println("Telefono: "+ this.getTelefono());
        System.out.println("Fecha Nacimiento: "+ this.getFecha_nacimiento());
        System.out.println("______________________________________");
    };
}
