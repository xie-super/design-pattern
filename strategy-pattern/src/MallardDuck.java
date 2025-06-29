public class MallardDuck extends Duck{
    public MallardDuck() {
        flyBehavior = new FlyWithWings(); // 使用有翅膀飞行行为
        quackBehavior = new Quack(); // 使用呱呱叫行为
    }

    @Override
    public void display() {
        flyBehavior.fly();
        quackBehavior.quack();
    }
}
