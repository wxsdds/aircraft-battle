package com.myxh.shoot;
/*
    �л������Ƿɻ�-���̳�FlyingObject
        Ҳ�ǵ��ˣ�������ʵ�ֵ÷�->ʵ��Enemy�ӿ�
 */

public class Airplane extends FlyingObject implements Enemy{
    // �л��ƶ��ٶ�
    private int speed = 2;

    @Override
    public int getScore() {
        return 0;
    }
}
