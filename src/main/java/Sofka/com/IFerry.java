/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Sofka.com;

import java.util.ArrayList;

/**
 * [Detalle del objeto de la clase.
 * Se define la interface que determinara los metodos usados en la clase Ferry
 * ]
 * @version: 1.01.001  21/02/2022.
 *
 * @author Juan Pablo Gonzalez Marin.
 * 
 * @since: 1.01.001
 */
public interface IFerry {
    /**
     * Corresponde a la definición del metodo que estructura el ingreso de los vehiculos al ferry.
     */
    public void Vehicle();
    /**
     * Corresponde a la definición del metodo que controla el ingreso de la fecha por parte del usuario.
     * @return Retorna el String que contiene la fecha en formato yyy/MM/dd.
     */
    public String EntryDate();
    /**
     * Corresponde a la definición del metodo que imprime el array de vehiculos.
     * @param printDates Variable que recibe el array a imprimir.
     */
    public void PrintArray(ArrayList printDates);
}
