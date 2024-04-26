package com.myxh.shoot;
import java.awt.image.BufferedImage;

public class Hero extends FlyingObject{
    protected BufferedImage[] images={};
    protected int index=0; // 是两张图片交替显示的计数

    private int doubleFire;
    private int life;

}
