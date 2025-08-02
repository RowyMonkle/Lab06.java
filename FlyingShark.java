public class FlyingShark extends Shark implements Flyable{
    @Override
    public void fly(){
        System.out.println("FlyingShark is gliding through the air! (I know it's impossible but who cares!)");
    }

    @Override
    public void eat(Fish fish) {
        super.eat(fish);
        System.out.println("FlyingShark caught a flying creature!");
    }
    @Override
    public void eat(Flyable winged) {
        System.out.println("Flying Shark is gliding through the air! (I know it's impossible but who cares!)");
    }
}
