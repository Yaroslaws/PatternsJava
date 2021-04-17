package Observer;

import java.lang.reflect.Method;
import java.util.Observable;

public class Look extends Observable {

    public void print(Class cl) {
        for (Method method : cl.getDeclaredMethods()) {
            if (method.getAnnotation(MyFuckingObserved.class) != null) {
                setChanged();
                notifyObservers(method.getName());
            }

        }
    }
}
