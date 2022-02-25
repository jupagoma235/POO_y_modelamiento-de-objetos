/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.sistema_planetario;

/**
 * [Detalle del objeto de la clase.
 * Corresponde a la clase Main de inicio por defecto.
 * ]
 * @version: 1.01.001  24/02/2022.
 *
 * @author Juan Pablo Gonzalez Marin.
 * 
 * @since: 1.01.001
 */
public class Main {

   /**
     * @param args the command line arguments estandar del metodo Main.
     *  
     * @trows Exepción
     * 
     * [Detalles del objetivo del metodo
     * Metodo inicial necesario para inicializar el programa, desde este se llama a la clase Ferry
     * ]
     * @version: 1.01.001  24/02/2022.
     *
     * @autor: Juan Pablo Gonzalez Marin
     *
     * @since: 1.01.001
     * 
     * @see: No tiene documentación para consultar.
     * 
     */
    public static void main(String[] args) {
        
        CreatePlanetSystem start= new CreatePlanetSystem();
        start.Controler();
    }
    
}
