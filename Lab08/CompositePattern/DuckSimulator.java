package Lab08.CompositePattern;

import Lab08.AbstractFactoryPattern.AbstractDuckFactory;
import Lab08.AbstractFactoryPattern.CountingDuckFactory;
import Lab08.AbstractFactoryPattern.DuckFactory;
import Lab08.AbstractFactoryPattern.EchoAndCountDuckFactory;
import Lab08.AdapterPattern.GooseAdapter;
import Lab08.AdapterPattern.PigeonAdapter;
import Lab08.DecoratorPattern.QuackCounter;
import Lab08.Duck.Goose;
import Lab08.Duck.Pigeon;
import Lab08.Duck.Quackable;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new DuckFactory();
        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
        AbstractDuckFactory countingEchoDuckFactory = new EchoAndCountDuckFactory();
        simulator.simulate(countingDuckFactory);
    }
    void simulate(AbstractDuckFactory duckFactory){


        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCll();
        Quackable rubberDuck = duckFactory.createRubberDuck();

        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeonDuck = new PigeonAdapter(new Pigeon());


        System.out.println("\nDuck Simulator: With Composit - Flocks");

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);
        flockOfDucks.add(pigeonDuck);

        Flock flokOfMallards = new Flock();

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardOneFour = duckFactory.createMallardDuck();

        flokOfMallards.add(mallardOne);
        flokOfMallards.add(mallardTwo);
        flokOfMallards.add(mallardThree);
        flokOfMallards.add(mallardOneFour);

        flockOfDucks.add(flokOfMallards);

        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        simulate(flockOfDucks);

        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
        simulate(flokOfMallards);

        System.out.println("The ducks quacked " + QuackCounter.getQuack() + " times");

    }

    void simulate(Quackable duck){
        duck.quack();
    }
}
