/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sofka.com;

/**
 *
 * @author jpgonzalez
 */
public class Vehicle{

    private int id;
    private int passangerNumbert;
    private int wheelsNumbers;
    private String registrationDate;
    private String vehicleType;
    private String mediumWhereMoves;
    private boolean crew;
    
    public Vehicle(String id, String registrationDate, String vehicleType, String mediumWhereMoves, String wheelsNumbers, String passangerNumbert, String crew) {
        this.id=Integer.parseInt(id);
        this.passangerNumbert = Integer.parseInt(passangerNumbert);
        this.wheelsNumbers = Integer.parseInt(wheelsNumbers);
        this.registrationDate = registrationDate;
        this.vehicleType = vehicleType;
        this.mediumWhereMoves = mediumWhereMoves;
        this.crew = Boolean.parseBoolean(crew);
    }

    @Override
    public String toString(){
        return id+ "| F. matricula :"+registrationDate+" | Vehiculo :"+vehicleType+" | Medio :"+mediumWhereMoves+" | # llantas :"+wheelsNumbers+" | # pasajeros :"+passangerNumbert+" | Tripulación :"+crew;
    }
    
}
