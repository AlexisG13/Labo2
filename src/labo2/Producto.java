/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo2;

/**
 *
 * @author Alexis Gomez
 */
public class Producto {
   private String nombre;
   private int cantidad;
   private int precio;
   
   public Producto(){};
   
   public Producto(String nombre,int cantidad,int precio){
       this.cantidad=cantidad;
       this.nombre=nombre;
       this.precio=precio;
   }
   
   public String getNombre(){
       return nombre;
   }
   
   public void SetNombre(String nombre){
       this.nombre=nombre;
   }
   
   public int getCantidad(){
       return cantidad;
   }
   
   public void SetCantidad(int cantidad){
       this.cantidad=cantidad;
   }
   public int getPrecio(){
       return precio;
   }
   
   public void SetPrecio(int precio){
       this.precio=precio;
   }
   
   };
   

