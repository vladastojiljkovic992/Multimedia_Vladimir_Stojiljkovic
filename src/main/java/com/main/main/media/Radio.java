/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main.main.media;


public class Radio {
    
    private double fmFrequency = 91.8;
    private int amFrequency = 600;
    private char band;
    
    public Radio() {
        this.fmFrequency = 91.8;
        this.amFrequency = 600;
        this.band = 'F';
    }    
    public Radio(double fmFrequency, int amFrequency, char band) {
        this.fmFrequency = fmFrequency;
        this.amFrequency = amFrequency;
        this.band = band;
    }
    
    public Radio(double fmFrequency, int amFrequency) {
        this.fmFrequency = fmFrequency;
        this.amFrequency = amFrequency;
    }
    
    public double getFmFrequency() {
        return fmFrequency;
    }
    
    public void setFmFrequency(double fmFrequency) {
        this.fmFrequency = fmFrequency;
    }
    
    public int getAmFrequency() {
        return amFrequency;
    }
    
    public void setAmFrequency(int newamFrequency) {
        this.amFrequency = amFrequency;
    }
    
    public char getBand() {
        return band;
    }
    
    public void setBand(char band) {
        this.band = band;
    }
        
    public void info() {
        System.out.println("FM frekfencija je: " + getFmFrequency());
        System.out.println("FM frekfencija je: " + getAmFrequency());
        System.out.println("Trenutni talas je: " + getBand());
        
    }
    
}
