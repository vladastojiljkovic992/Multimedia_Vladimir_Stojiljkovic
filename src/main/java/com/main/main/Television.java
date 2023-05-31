/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main.main;


public class Television {
    
    private int volume = 0;
    private int currentProgram = 1;
    private String turnOn;
    
    public Television(int volume, int currentProgram, String turnOn) {
        this.volume = 0;
        this.currentProgram = 1;
        this.turnOn = turnOn;
       
    }
     
    public int getVolume() {
        return this.volume;
    }
    
    private void setVolume(int volume) {
        this.volume = volume;
    }
    
    public int getCurrentProgram() {
        return this.currentProgram;
    }
    
    private void setCurrentProgram(int currentProgram) {
        this.currentProgram = currentProgram;
    }
    
     public Television(int TurnOn) {
        this.turnOn = turnOn;
    }
    
    public String getTurnOn() {
        return this.turnOn;
    }
        
    public String setTurnOn() {
        this.turnOn = turnOn;
        return null;
    }
}
