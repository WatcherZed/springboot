package com.example.demo.design.builderPattern.test2;

/**
 * @ Description   :  播放软件
 * @ Author        :  lyk
 * @ CreateDate    :  2020/10/12 16:53
 * @ UpdateUser    :  lyk
 * @ UpdateDate    :  2020/10/12 16:53
 * @ UpdateRemark  :  修改内容
 * @ Version       :  1.0
 */
public class Soft {
    //菜单
    private String menu;
    //播放列表
    private String playlist;
    //主窗口
    private String mainWindow;
    //控制条
    private String strip;
    //收藏列表
    private String favorites;

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getPlaylist() {
        return playlist;
    }

    public void setPlaylist(String playlist) {
        this.playlist = playlist;
    }

    public String getMainWindow() {
        return mainWindow;
    }

    public void setMainWindow(String mainWindow) {
        this.mainWindow = mainWindow;
    }

    public String getStrip() {
        return strip;
    }

    public void setStrip(String strip) {
        this.strip = strip;
    }

    public String getFavorites() {
        return favorites;
    }

    public void setFavorites(String favorites) {
        this.favorites = favorites;
    }

    @Override
    public String toString() {
        return "Soft{" +
                "menu='" + menu + '\'' +
                ", playlist='" + playlist + '\'' +
                ", mainWindow='" + mainWindow + '\'' +
                ", strip='" + strip + '\'' +
                ", favorites='" + favorites + '\'' +
                '}';
    }
}
