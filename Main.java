//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shark shark = new Shark();
        SurgeonFish surgeonFish = new SurgeonFish();
        FlyingShark sharknado = new FlyingShark();
        Insect bug = new Insect();

        //polymorphism
        shark.eat(surgeonFish);
        shark.eat(new Shark());

        // Demonstrate static polymorphism (overloading)
        sharknado.eat(new Shark());      // Calls eat(Fish)
        sharknado.eat(bug);           // Calls eat(Flyable)

        // Demonstrate polymorphic assignments and behaviors
        Fish meg = new Shark();           // A Shark is-a Fish
        Flyable sharkpedo = new FlyingShark(); // A FlyingShark is-a Flyable
        meg.swim();                       // Calls Shark's swim()
        sharkpedo.fly();                       // Calls FlyingShark's fly()
    }
}