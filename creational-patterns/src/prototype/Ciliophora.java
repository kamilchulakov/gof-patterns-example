package prototype;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Ciliophora implements Prototype{
    private String name;
    private Integer id;

    public Ciliophora() {
        Random random = new Random();
        String[] names = new String[]{"Paramécium caudátum", "Tetrahymena", "Oxytricha trifallax"};
        Integer[] ids = new Integer[]{1, 2, 3};
        setName(names[random.nextInt(names.length)]);
        setId(ids[random.nextInt(ids.length)]);
    }

    private Ciliophora(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Prototype clone() {
        return new Ciliophora(getName(), getId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ciliophora that = (Ciliophora) o;
        return Objects.equals(name, that.name) && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Ciliophora{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
