package com.davidpucheta;

public abstract class UIControl {
    public void enable(){
        System.out.println("Enabled");
    }

    public abstract void draw ();
}
