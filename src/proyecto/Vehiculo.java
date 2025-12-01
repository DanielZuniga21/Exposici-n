/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author zunig
 */
public class Vehiculo {
   // 6 atributos
    private String placa;
    private String marca;
    private String modelo;
    private int anio;
    private int kilometraje;
    private String tipo;

    // Constructor no default
    public Vehiculo(String placa, String marca, String modelo, int anio, int kilometraje, String tipo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.tipo = tipo;
    }
     // Getters y setters
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa; 
    }

    public String getMarca() {
        return marca; 
    }
    public void setMarca(String marca) { 
        this.marca = marca;
    }

    public String getModelo() {
        return modelo; 
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
     public int getAnio() { 
         return anio; 
     }
    public void setAnio(int anio) {
        this.anio = anio; 
    }

    public int getKilometraje() {
        return kilometraje;
    }
    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getTipo() {
        return tipo; 
    }
    public void setTipo(String tipo) { 
        this.tipo = tipo; 
    }

public String toString() {
        return "Vehiculo [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", año=" + anio +
                ", km=" + kilometraje + ", tipo=" + tipo + "]";
    }

//metodos propios
public void registrarViaje(int km) {
        this.kilometraje += km;
        System.out.println("Se registraron " + km + " km en " + placa);
    }
 public boolean requiereServicio() {
      if(this.kilometraje >= 10000) {
            System.out.println("El vehículo " + placa + " requiere servicio.");
            return true;
        } else {
            System.out.println("El vehículo " + placa + " no requiere servicio.");
            return false;
        }
    }
 }
    

