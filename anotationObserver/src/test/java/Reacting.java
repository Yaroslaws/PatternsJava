import java.util.Observable;
import java.util.Observer;

public class Reacting implements Observer {

    @Override
    @MyFuckingObserved
    public void update(Observable o, Object arg) {
        System.out.println(arg + " вызван ");
    }


}
