/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P3JuanitaAlmacen;

/**
 *
 * @author Usuario
 */
public class Producto {
    //atributos
    String id;
    String nombre;
    String marca;
    String categoria;
    String cantidad;
    String precio;
    String idalmacen;   
    
    //constructor
        public Producto(String id, String nombre, String marca, String categoria, String cantidad, String precio, String idalmacen) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.precio = precio;
        this.idalmacen = idalmacen;
    }
    //Metodos
    public void mostrarDatos(){
        System.out.println("id: "+this.id);
        System.out.println("nombre: "+this.nombre);
        System.out.println("marca: "+this.marca);
        System.out.println("cantidad: "+this.cantidad);
        System.out.println("precio: "+this.precio);
        System.out.println("idalmacen: "+this.idalmacen);
    }  
    //getterandsetters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getIdalmacen() {
        return idalmacen;
    }

    public void setIdalmacen(String idalmacen) {
        this.idalmacen = idalmacen;
    }

    
    
}

