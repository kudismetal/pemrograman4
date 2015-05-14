public class Animal {

    protected int legs;

    protected Animal()
    {

    }
    protected Animal(int legs)
    {
        this.legs = legs;
        System.out.println("Hewan ini memiliki " + legs + " kaki.");
    }

    public void walk()
    {
        System.out.println("Hewan bisa berjalan.");
    }

    public void eat()
    {
        System.out.println("Hewan bisa makan.");
    }
}
