package composite;

import java.util.ArrayList;
import java.util.List;

public class BaseBox extends Thing implements Box{

    private List<Thing> list;

    public void addThing(Thing thing) {
        list.add(thing);
    }

    public BaseBox(String name) {
        super(name);
        list = new ArrayList<>();
    }

    @Override
    public List<Thing> getChildren() {
        return null;
    }

    @Override
    public String toString() {
        return "BaseBox{" +
                "name='" + name +
                ",list=" + list.toString() +
                '}';
    }
}
