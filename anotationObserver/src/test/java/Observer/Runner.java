package Observer;

import Observer.Look;
import Observer.Reacting;
import Observer.WhoToFollow;

public class Runner {


    public static void main(String[] args) {

        Look look = new Look();
        look.addObserver(new Reacting());
        look.print(WhoToFollow.class);

        WhoToFollow.doSomething();

    }
}
