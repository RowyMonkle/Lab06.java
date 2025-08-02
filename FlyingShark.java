public class FlyingShark extends Shark implements Flyable{
    @Override
    public void fly(){
        System.out.println("FlyingShark is gliding through the air! (I know it's impossible but who cares!)");
    }

    @Override
    public void eat(Fish fish) {
        super.eat(fish); //Calls the eat(Fish) method from the superclass (extends class: Shark)
        System.out.println(this.toString() + "eaten by" + fish.toString()); //display Fish fish() that eaten by FlyingShark
    }
    @Override
    public void eat(Flyable winged) {//Adding more eat() for help FlyingShark eat the flying creature
        System.out.println("FlyingShark caught a flying creature!");
    }
}

