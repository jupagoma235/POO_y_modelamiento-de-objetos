/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.sistema_planetario;

import java.math.BigInteger;


/**
 * [Detalle del objeto de la clase.
 * Se crea la interface para determinar los metodos que haran parte del objeto Planeta.
 * ]
 * @version: 1.01.001  24/02/2022.
 *
 * @author Juan Pablo Gonzalez Marin.
 * 
 * @since: 1.01.001
 */
public interface IPlanet {
    /**
     * Metodo para capturar la masa del objeto seleccionado.
     * @return el valro de la masa del objeto.
     */
    public double GetMass();
    /**
     * Metodo para capturar la distancia del objeto seleccionado.
     * @return el la distancia del objeto.
     */
    public double GetDistanceToTheSun();
}
