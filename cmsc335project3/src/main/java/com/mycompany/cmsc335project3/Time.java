/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cmsc335project3;

/*
 * Filename: Time.java
 * Author: Wanner Hernandez
 * Professor: Mujeye, Douglas
 * Date: 3/6/2021
 * Purpose: Create runnable Time class to get current time and update timeText textfield in GUI
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time implements Runnable {
    private boolean isRunning;
    private String timePattern = "hh:mm:ss a";
    private SimpleDateFormat timeFormat = new SimpleDateFormat(timePattern); 
    Date date = new Date(System.currentTimeMillis());

    public Time() {
        this.isRunning = Thread.currentThread().isAlive();
    }
    
    public String getTime() {
        date = new Date(System.currentTimeMillis());
        return timeFormat.format(date);
    }

    @Override
    public void run() {
        //While running, constantly update current time
        while (isRunning) {
            
            CMSC335Project3.timeText.setText(getTime());
        } 
    }
    
}