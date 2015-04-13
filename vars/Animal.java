public class Animal {

    protected int legs;

    protected Animal()
    {
        System.out.println("\nAnimal ? yeah!");
    }
    protected Animal(int legs)
    {
        this.legs = legs;
        System.out.println("\nAnimal have " + legs + " legs");
    }

    public void walk()
    {
        System.out.println("Animal can walk");
    }

    public void eat()
    {
        System.out.println("Animal can eat");
    }
}
