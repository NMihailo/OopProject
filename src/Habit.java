
public class Habit {
    private int id;
    protected String name;

    public Habit() {}
    public Habit(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }
}
