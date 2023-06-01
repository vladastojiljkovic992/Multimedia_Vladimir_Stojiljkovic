/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main.main.media;

/**
 *
 * @author stepa
 */
public class Television {
    
    private int volume;
    private int currentProgram;
    private boolean turnOn;
    
    public int getVolume() {
        return this.volume;
    }
    
    public void setVolume(int Volume) {
        this.volume = Volume;
    }
    
    public int getCurrentProgram() {
        return this.currentProgram;
    }
    
    public void setCurrentProgram(int program) {
        this.currentProgram = program;
    }
    
    public boolean getTurnOn() {
        return this.turnOn;
    }
        
    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }
    
    public Television() {
       this.volume = 0;
       this.currentProgram = 1;
       this.turnOn = false;
    }
    
    public Television(int volume, int program, boolean turnOn) {
        this.volume = volume;
        this.currentProgram = program;
        this.turnOn = turnOn;
       
    }
     
           
    
    public void info() {
        System.out.println("Zvuk je na: " + this.volume);
        System.out.println("Trenutni program: " + this.currentProgram);
        System.out.println("Ukljucen: " + this.turnOn);
        System.out.println("");
    }
}
