package ExtraTask2;

public class ExtraTask2 {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.move();
        Fish myFish = new Fish();
        myFish.move();
        Duck myDuck = new Duck();
        myDuck.move();
    }
}

abstract class Animal {
    public abstract void move();
}

class Cat extends Animal {
    @Override
    public void move() {
        System.out.println("Я побежал.");
    }
}

class Fish extends Animal {
    @Override
    public void move() {
        System.out.println("Я поплыла.");
    }
}

class Duck extends Animal {
    @Override
    public void move() {
        System.out.println("Я полетела.");
    }
}