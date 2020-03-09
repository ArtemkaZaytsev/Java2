package Lesson_1.circles;

import java.awt.*;

public class BackGround extends Sprite {
    private float time;

    private Color color;


    @Override
    public void update (MainCanvas canvas, float deltaTime){
        time += deltaTime;
        int a = (int) (Math.random() * time) * 5;
        int b = (int) (Math.random() * time) * 5;
        int c = (int) (Math.random() * time) * 5;

        color = new Color(a,b,c);
    }


    @Override
    public void render(MainCanvas canvas, Graphics g) {
        canvas.setBackground(color);

    }



}
