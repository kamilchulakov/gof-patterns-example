package composite;

import java.util.List;

public interface Box {
    List<Thing> getChildren();
    void addThing(Thing thing);
}
