public class Fish extends Pet{

    /*
    public Fish()
    {
        super();
        System.out.println("Fish don't have any legs!");
    }
    */

	public Fish(){

	}

    public void play()
    {
        System.out.println("Hewan " + this.getName() + " adalah ikan dan bisa bermain.");
    }

    public void walk()
    {
        System.out.println("Hewan " + this.getName() + " adalah ikan dan dapat berjalan.");
    }

    public void eat()
    {
        System.out.println("Hewan " + this.getName() + " adalah ikan dan bisa makan.");
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
