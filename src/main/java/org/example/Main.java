package org.example;

import processing.core.PApplet;

public class Main extends PApplet{
    public static final int WIDTH = 700;
    public static final int HEIGHT = 500;
    public static final int DIAMETER = 12;

    int s1=0;
    int s2=0;
    int s3=0;
    int s4=0;

    public static void main(String[] args) {

        PApplet.main("org.example.Main",args);

    }
    @Override
    public void settings(){
        super.settings();
        size(WIDTH,HEIGHT);
    }
    @Override
    public void setup(){

    }
    public void draw(){


        ellipse(s1,HEIGHT/5,DIAMETER,DIAMETER);
        s1+=1;
        ellipse(s2,(HEIGHT/5)*2,DIAMETER,DIAMETER);
        s2+=2;
        ellipse(s3,(HEIGHT/5)*3,DIAMETER,DIAMETER);
        s3+=3;
        ellipse(s4,(HEIGHT/5)*4,DIAMETER,DIAMETER);
        s4+=4;
    }

}