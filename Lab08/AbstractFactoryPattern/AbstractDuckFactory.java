package Lab08.AbstractFactoryPattern;


import Lab08.Duck.Quackable;

public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCll();
    public abstract Quackable createRubberDuck();
}
