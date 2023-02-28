/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udem.models;

/**
 *
 * @author b12s309
 */
public class Cebollas {
    private String nombre;
    private String Edad;
    private String Prom_vida;
    private String tipo;

    public Cebollas(String nombre, String Edad, String Prom_vida, String tipo) {
        this.nombre = nombre;
        this.Edad = Edad;
        this.Prom_vida = Prom_vida;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return Edad;
    }

    public String getProm_vida() {
        return Prom_vida;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public void setProm_vida(String Prom_vida) {
        this.Prom_vida = Prom_vida;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
