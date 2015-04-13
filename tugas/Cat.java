public class Cat extends Pet {

	/*
    public Cat() {
        super();
        System.out.println("Cats can't be so cute!");
    }
    */

	public Cat(){

	}

    public void play()
    {
        System.out.println("Hewan "+ this.getName() + " adalah kucing dan bisa bermain denganmu.");
    }

    public void eat()
    {
        System.out.println("Hewan "+ this.getName() + " adalah kucing dan bisa makan.");
    }

    public String setName(String NmPet)
    {
        name = NmPet;
        return name;
    }

    public String getName()
    {
        return name;
    }
}
