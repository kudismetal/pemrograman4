public class Main {
    public static void main(String[] args) {
        Animal ani = new Animal();
        ani.eat();
        ani.walk();

        Animal ani1 = new Animal(4);
        ani1.eat();
        ani1.walk();

        Pet pt = new Pet() {};
        pt.setName("Peliharaan");
        System.out.println(pt.getName());
        pt.play();

        Spider spider = new Spider();
        spider.eat();

        Cat cat = new Cat();
        cat.setName("Bleki");
        cat.play();
        cat.eat();

        Fish fish = new Fish();
        fish.setName("Kiwil");
        fish.play();
        fish.walk();
        fish.eat();

    }
}
