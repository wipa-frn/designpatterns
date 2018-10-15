package Lab08.DecoratorPattern;


import Lab08.Duck.Quackable;

public class QuackEcho implements Quackable {
    Quackable duck;
    public QuackEcho(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        System.out.print("Echo : ");
        duck.quack();
    }
}
