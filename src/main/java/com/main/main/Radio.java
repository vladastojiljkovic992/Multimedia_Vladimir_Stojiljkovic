/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main.main;


public class Radio {
    
    private int fmFrequency;
    private int amFrequency;
    private String band;
    
    public Radio(int fmFrequency, int amFrequency, String band) {
        this.fmFrequency = (int) 91.8;
        this.amFrequency = 600;
        this.band = band;
       
    }
     
    public int getFmFrequency() {
        return this.fmFrequency;
    }
    
    private void setFmFrequency(int fmFrequency) {
        this.fmFrequency = fmFrequency;
    }
    
    public int getAmFrequency() {
        return this.amFrequency;
    }
    
    private void setAmFrequency(int amFrequency) {
        this.amFrequency = amFrequency;
    }
    
     public Radio(String band) {
        this.band = band;
    }
    
    public String getBand() {
        return this.band;
    }
        
    public String setBand() {
        this.band = band;
        return null;
    }
    
}
