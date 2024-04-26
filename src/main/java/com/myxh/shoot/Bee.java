package com.myxh.shoot;
/*
    √€∑‰¿‡£∫
 */
public class Bee extends FlyingObject implements Enemy {
    private int xSpeed=1;
    private int ySpeed=2;
    private int awardType;

    @Override
    public int getScore() {
        return 0;
    }
}
