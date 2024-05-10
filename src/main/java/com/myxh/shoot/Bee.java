package com.myxh.shoot;

/*
    蜜蜂类
 */
public class Bee extends FlyingObject implements Enemy {
    private int xSpeed=1;
    private int ySpeed=2;
    private int awardType;

    // 添加构造方法，初始化属性
    public Bee() {
        this.image=shootGame.bee;
        width = image.getWidth();
        height = image.getHeight();
        y = -height;
        x = (int)(Math.random()*shootGame.WIDTH-width);
    }
    @Override
    public int getScore() {
        return 0;
    }



}
