package com.example.demo.design.builderPattern.test2;

public abstract class SoftBuilder {
    protected Soft soft = new Soft();

    public Soft resultSoft() {
        return soft;
    }

    public abstract void menu();

    public abstract void playlist();

    public abstract void mainWindow();

    public abstract void strip();

    public abstract void favorites();

    public boolean isMenu(){
        return false;
    }
    public boolean isPlaylist(){
        return false;
    }
    public boolean isMainWindow(){
        return false;
    }
    public boolean isStrip(){
        return false;
    }
    public boolean isFavorites(){
        return false;
    }
}
