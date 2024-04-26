package com.myxh.shoot;
/*
    敌机：既是飞机-》继承FlyingObject
        也是敌人，被击中实现得分->实现Enemy接口
 */

public class Airplane extends FlyingObject implements Enemy{
    // 敌机移动速度
    private int speed = 2;

    @Override
    public int getScore() {
        return 0;
    }
}
