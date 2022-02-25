/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_planetario;

/**
 *
 * @author jpgonzalez
 */
public class Planet implements IPlanet{
    public double mass;
    public double density;
    public double diameter;
    public double distanceToTheSun;
    public int id;
    public String name;

    public Planet(int id, String name, double mass, double density, double diameter, double distanceToTheSun) {
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distanceToTheSun = distanceToTheSun;
        this.id=id;
        this.name= name;
    }
    
    @Override
    public double GetMass() {
        return this.mass;
    }
    
    @Override
    public double GetDistanceToTheSun() {
        return this.distanceToTheSun;   
    }

    
    @Override
    public String toString(){
        return id+" | Masa del planeta "+name+" : "+ mass+ " | Densidad : "+density+" | Diametro : "+diameter+" | Distancia al sol : "+distanceToTheSun;
    }
    
    
}
