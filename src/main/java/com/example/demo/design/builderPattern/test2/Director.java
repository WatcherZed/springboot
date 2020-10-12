package com.example.demo.design.builderPattern.test2;

public class Director {
    private SoftBuilder builder;
    public Director(SoftBuilder builder){
        this.builder = builder;
    }
    public SoftBuilder construct(){
        if (builder.isFavorites()){
            builder.favorites();
        }
        if (builder.isMainWindow()){
            builder.mainWindow();
        }
        if (builder.isMenu()){
            builder.menu();
        }
        if (builder.isPlaylist()){
            builder.playlist();
        }
        if (builder.isStrip()){
            builder.strip();
        }
        return builder;
    }
}
