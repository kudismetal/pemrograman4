public class Main {
    public static void main(String[] args) {
        Animal anm = new Animal();
        anm.eat();
        anm.walk();

        Animal anm1 = new Animal(4);
        anm1.eat();
        anm1.walk();

        Pet pt = new Pet() {};
        pt.setName("MyPet");
        System.out.println(pt.getName());
        pt.play();

        Spider spider = new Spider();
        spider.eat();

        Cat cat = new Cat();
        cat.setName("Castro");
        cat.play();
        cat.eat();

        Fish fish = new Fish();
        fish.setName("Shado");
        fish.play();
        fish.walk();
        fish.eat();

    }
}
