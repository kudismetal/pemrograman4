public abstract class Pet{

    public String name;

	/*
    public Pet() {
        super();
        System.out.println("Do you have any pets ?");
    }
	*/

    public String setName(String NmPet)
    {
        name = NmPet;
        return name;
    }

    public String getName()
    {
        return name;
    }

    public void play()
    {
        System.out.println("Pet bisa bermain denganmu.");
    }
}
