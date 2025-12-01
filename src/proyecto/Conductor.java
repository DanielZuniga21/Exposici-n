/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author zunig
 */
public class Conductor {
      // 6 atributos
 private String identidad;
    private String Nombre;
    private String licencia;
    private int aniosexperiencia;
    private String telefono;
    private Vehiculo vehiculoasignado; // AHORA ES OBJETO

    // Constructor no default
    public Conductor(String identidad, String Nombre, String licencia, int aniosexperiencia, String telefono, Vehiculo vehiculoasignado) {
        this.identidad = identidad;
        this.Nombre = Nombre;
        this.licencia = licencia;
        this.aniosexperiencia = aniosexperiencia;
        this.telefono = telefono;
        this.vehiculoasignado = vehiculoasignado;
    }

    // Getters y setters
    public String getIdentidad() { return identidad; }
    public void setIdentidad(String identidad) { this.identidad = identidad; }

    public String getNombre() { return Nombre; }
    public void setNombre(String Nombre) { this.Nombre = Nombre; }

    public String getLicencia() { return licencia; }
    public void setLicencia(String licencia) { this.licencia = licencia; }

    public int getAniosexperiencia() { return aniosexperiencia; }
    public void setAniosexperiencia(int aniosexperiencia) { this.aniosexperiencia = aniosexperiencia; }

    public String gettelefono() { return telefono; }
    public void settelefono(String telefono) { this.telefono = telefono; }

    public Vehiculo getVehiculoasignado() { return vehiculoasignado; }
    public void setVehiculoasignado(Vehiculo vehiculoasignado) { this.vehiculoasignado = vehiculoasignado; }

    public String toString() {
        return "Conductor [identidad=" + identidad + ", nombre=" + Nombre + ", licencia=" + licencia +
               ", añosExperiencia=" + aniosexperiencia + ", telefono=" + telefono +
               ", vehiculoAsignado=" + vehiculoasignado.getPlaca() + "]";
    }

    //metodos propios
    public void asignarVehiculo(Vehiculo v) {
        this.vehiculoasignado = v;
        System.out.println("Vehículo " + v.getPlaca() + " asignado a " + Nombre);
    }

    public void infoConductor() {
        System.out.println(this.toString());
    }
}

