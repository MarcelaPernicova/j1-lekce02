package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

import java.util.List;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();
        zofka.setLocation(90,400);
        zofka.penUp();
        zofka.move(200);
        zofka.penDown();
        zofka.turnRight(60);
        zofka.move(100);
        zofka.turnRight(60);
        zofka.move(100);
        zofka.turnRight(150);
        zofka.move(170);
        zofka.turnLeft(90);
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.move(170);
        zofka.turnLeft(90);
        zofka.move(200);
        zofka.setLocation(400,380);
        zofka.move(90);
        zofka.turnLeft(120);
        zofka.move(110);
        zofka.turnLeft(130);
        zofka.move(110);
        zofka.turnLeft(20);
        zofka.move(140);
        zofka.turnLeft(90);
        zofka.move(90);
        zofka.turnLeft(90);
        zofka.move(140);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(90);
        zofka.penDown();

        zofka.turnLeft(30);
        zofka.move(40);
        zofka.turnRight(120);
        zofka.penUp();
        zofka.move(40);
        zofka.penDown();
        zofka.turnRight(120);
        zofka.move(40);

        zofka.penUp();
        zofka.turnRight(60);
        zofka.move(140);
        zofka.penDown();

        zofka.turnRight(50);
        zofka.move(40);
        zofka.turnRight(120);
        zofka.penUp();
        zofka.move(40);
        zofka.penDown();
        zofka.turnRight(120);
        zofka.move(40);
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
