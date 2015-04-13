public class Cat extends Pet {

    public Cat() {
        super();
        System.out.println("Cats can't be so cute!");
    }

    public void play()
    {
        System.out.println("Your "+ this.getName() + " is cat, and can play with you!");
    }

    public void eat()
    {
        System.out.println("Your "+ this.getName() + " is cat, and can eat!");
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
}
