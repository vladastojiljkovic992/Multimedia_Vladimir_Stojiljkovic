/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main.main;


public class Television {
    
    private int volume = 0;
    private int currentProgram = 1;
    private String turnOn;
    
    public Television() {
       this.volume = 0;
       this.currentProgram = 1;
       this.turnOn = "";
    }
    
    public Television(int volume, int currentProgram, String turnOn) {
        this.volume = 0;
        this.currentProgram = 1;
        this.turnOn = turnOn;
       
    }
     
    public Television(int volume, int currentProgram) {
        this.volume = volume;
        this.currentProgram = currentProgram;
    }
    
    public Television(String turnOn) {
        this.turnOn = turnOn;
    }
        
    public int getVolume() {
        return this.volume;
    }
    
    public void setVolume(int newVolume) {
        this.volume = newVolume;
    }
    
    public int getCurrentProgram() {
        return this.currentProgram;
    }
    
    public void setCurrentProgram(int newCurrentProgram) {
        this.currentProgram = newCurrentProgram;
    }
    
    public String getTurnOn() {
        return this.turnOn;
    }
        
    public String setTurnOn() {
        this.turnOn = turnOn;
        return null;
    }
    
    public void printAttributes() {
        System.out.println("volume: " + this.volume);
        System.out.println("currentProgram: " + this.currentProgram);
        System.out.println("turnOn: " + this.turnOn);
        
    }
}
