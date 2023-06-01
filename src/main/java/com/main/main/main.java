/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.main.main;

import com.main.main.media.Television;
import com.main.main.media.Radio;

public class main {

    public static void main(String[] args) {
//        int a = 5;
//        int b = 10;
        
        Television Panasonic  = new Television();
        Panasonic.info();
        Panasonic.setTurnOn(true);
        Panasonic.setVolume(30);
        Panasonic.setCurrentProgram(5);
        
        Panasonic.info();
        
        Radio myRadio = new Radio(100, 700, 'A');
        myRadio.setAmFrequency(109);
        myRadio.setFmFrequency(703);
        myRadio.setBand('F');
        
        myRadio.info();
    }
}
