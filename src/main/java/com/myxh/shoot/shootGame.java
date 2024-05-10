package com.myxh.shoot;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;

public class shootGame extends JPanel {
    public static final int WIDTH = 400; // 面板宽
    public static final int HEIGHT = 654; // 面板高

    public static BufferedImage background;
    public static BufferedImage start;
    public static BufferedImage pause;
    public static BufferedImage gameover;
    public static BufferedImage bullet;
    public static BufferedImage airplane;
    public static BufferedImage bee;
    public static BufferedImage hero0;
    public static BufferedImage hero1;

    static {
        try{
            background = ImageIO.read(shootGame.class.getResource("../resources/background.png"));
            airplane = ImageIO.read(shootGame.class.getResource("../resources/airplane.png"));
            bee = ImageIO.read(shootGame.class.getResource("../resources/bee.png"));
            hero0 = ImageIO.read(shootGame.class.getResource("../resources/hero0.png"));
            hero1 =ImageIO.read(shootGame.class.getResource("../resources/hero1.png"));
            pause = ImageIO.read(shootGame.class.getResource("../resources/pause.png"));
            start = ImageIO.read(shootGame.class.getResource("../resources/start.png"));
            gameover = ImageIO.read(shootGame.class.getResource("../resources/gameover.png"));
            bullet = ImageIO.read(shootGame.class.getResource("../resources/bullet.png"));

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Fly");
        shootGame game = new shootGame(); // 面板对象
        frame.add(game); // 将面板添加到JTrame
        frame.setSize(WIDTH, HEIGHT);
        frame.setAlwaysOnTop(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 默认关闭操作
        frame.setLocationRelativeTo(null); //设置窗体初始位置
        frame.setVisible(true);
    }
}


