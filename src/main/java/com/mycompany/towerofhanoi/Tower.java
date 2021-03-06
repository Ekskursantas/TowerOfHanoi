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
import java.util.Stack;

public class Tower {
    private Stack<Disk> disks = new Stack();

    Tower(int count) {
        for (int size = count + 1; size > 1; size--) {
            disks.push(new Disk(size));
        }
    }


    public boolean moveTo(Tower other) {
        if (disks.isEmpty()) return false;
        if (!other.disks.isEmpty() &&
                this.disks.peek().getSize() > other.disks.peek().getSize())
            return false;
        other.disks.push(this.disks.pop());

        return true;
    }

    public String text(int height) {
        if (height >= disks.size()) return "            |            ";
        return disks.get(height).text();
    }
}
