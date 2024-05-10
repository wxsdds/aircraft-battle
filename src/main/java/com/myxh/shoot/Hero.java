package com.myxh.shoot;
import java.awt.image.BufferedImage;

public class Hero extends FlyingObject{
    protected BufferedImage[] images={};
    protected int index=0; //

    private int doubleFire;
    private int life;

    // 为hero类添加构造方法
    public Hero() {
        life = 3;
        doubleFire = 0;
        this.image = shootGame.hero0;
        images = new BufferedImage[]{shootGame.hero0, shootGame.hero1};
        width = image.getWidth();
        height = image.getHeight();
        x = 150;
        y = 400;
    }

}
