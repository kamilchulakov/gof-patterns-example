package composite;

public class Main {
    public static void main(String[] args) {
        Box box = new BaseBox("BaseBox");
        Box box2 = new BaseBox("InsideBox");
        Thing thing1 = new Thing("ketchup");
        Thing thing2 = new Thing("pizza");
        box.addThing(thing2);
        box.addThing((Thing) box2);
        box2.addThing(thing1);
        System.out.println(box);
    }
}
