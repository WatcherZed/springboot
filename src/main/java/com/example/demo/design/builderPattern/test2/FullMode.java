package com.example.demo.design.builderPattern.test2;

public class FullMode extends SoftBuilder {
    @Override
    public void menu() {
        super.soft.setMenu("菜单");
    }

    @Override
    public void playlist() {
        super.soft.setPlaylist("播放列表");
    }

    @Override
    public void mainWindow() {
        super.soft.setMainWindow("主窗口");
    }

    @Override
    public void strip() {
        soft.setStrip("控制条");
    }

    @Override
    public void favorites() {
        soft.setFavorites("收藏列表");
    }

    @Override
    public boolean isMenu() {
        return true;
    }

    @Override
    public boolean isFavorites() {
        return true;
    }
}
