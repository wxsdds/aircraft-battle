package com.myxh.shoot;

/*
    子弹类

 */

public class Bullet extends FlyingObject{
    private int speed = 3;

    // 为bullet类添加构造方法，初始化属性
    public Bullet(int x, int y){
        this.x = x;
        this.y = y;
        this.image=shootGame.bullet;
    }
}
