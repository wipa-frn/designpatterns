package Lab08.AdapterPattern;


import Lab08.Duck.Goose;
import Lab08.Duck.Quackable;

public class GooseAdapter implements Quackable {
    Goose goose;
    public GooseAdapter(Goose goose){
        this.goose = goose;
    }
    @Override
    public void quack() {
        goose.honk();
    }
}
