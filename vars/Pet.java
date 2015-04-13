public abstract class Pet extends Animal {

    protected String Name;

    public Pet() {
        super();
        System.out.println("Do you have any pets ?");
    }

    public String setName(String name)
    {
        Name = name;
        return Name;
    }

    public String getName()
    {
        return Name;
    }

    public void play()
    {
        System.out.println("Pets can play with you!");
    }
}
