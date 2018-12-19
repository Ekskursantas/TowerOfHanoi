/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.towerofhanoi;

/**
 *
 * @author przyg
 */
public class Disk {

    private final int size;

    public Disk(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String text() {
        String text = "|";
        for (int i = 0; i < size; i++) {
            text = "#" + text + "#";
        }
        for (int i = size; i < 12; i++) {
            text = " " + text + " ";
        }
        return text;
    }
}
