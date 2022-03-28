/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 *
 * @author Paqui Elena
 */
public class Vivienda {
    
     /**@return the precio
       Devuelve el precio
     */
    public double getPrecio() {
        return precio;
    }

    /**@param precio the precio to set
       Establece el precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**@return the numHabitaciones
       Devuelve el numero de habitaciones
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**@param numHabitaciones the numHabitaciones to set
       Establece numero de habitaciones
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**@return the superficie
       Devuelve la superficie
     */
    public double getSuperficie() {
        return superficie;
    }

    /**@param superficie the superficie to set
       Establece la superficie
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**@return the parking
       Devuelve parking
     */
    public boolean isParking() {
        return parking;
    }

    /**@param parking the parking to set
       Establece parking
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**@return the estado
       Devuelve estado
     */
    public String getEstado() {
        return estado;
    }

    /**@param estado the estado to set
       Establece estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**@return the propietario
       Devuelve propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**@param propietario the propietario to set
       Establece propietario
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
    private double descuento = 0.05;
    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    public Vivienda(double p, int nh, double s, boolean pk, String st, String pr)
    {
        /**
        Establecemos el valor introducido al atributo tipo double referente al precio
        */
    this.precio = p;
        /**
        Establecemos el valor introducido al atributo tipo entero referente al numero de habitaciones
        */
    this.numHabitaciones = nh;
        /**
        Establecemos el valor introducido al atributo tipo double referente a la superficie
        */
    this.superficie = s;
        /**
        Establecemos el valor introducido al atributo tipo booleano referente al parking
        */
    this.parking = pk;
        /**
        Establecemos el valor introducido al atributo tipo string/cadena referente al estado
        */
    this.estado = st;
        /**
        Establecemos el valor introducido al atributo tipo string referente al propietario
        */
    this.propietario = pr;
    }
    
    public void actualizarPrecio()
    {
        /**
        precio = precio - precio * descuento;
        */
    }

    public void imprimirvivienda()
    {
        System.out.println("__________________________");
        System.out.println("Precio: "+ this.precio);
        System.out.println("Numero de habitaciones: "+ this.numHabitaciones);
        System.out.println("Superficie: "+ this.superficie +" metros cuadrados");
        System.out.println("Parking: "+ this.parking);
        System.out.println("Estado: "+ this.estado);
        System.out.println("Propietario: "+ this.propietario);
    }

}
