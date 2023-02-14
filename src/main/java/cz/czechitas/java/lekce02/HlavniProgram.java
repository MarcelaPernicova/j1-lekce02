package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

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
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
