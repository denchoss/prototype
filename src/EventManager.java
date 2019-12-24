import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<String, List<Listener>> listeners = new HashMap<>();

    public EventManager(String... events){
        for (String event: events) {
            this.listeners.put(event,new ArrayList<>());
        }
    }

    public void subscribe(String event, Listener listener){
        List<Listener> users = listeners.get(event);
        users.add(listener);
    }

    public void unsubscribe(String event, Listener listener){
        List<Listener> users = listeners.get(event);
        users.remove(listener);
    }

    public void notify(String event){
        List<Listener> users = listeners.get(event);
        for (Listener listener:users) {
            listener.update(event);
        }
    }
}
