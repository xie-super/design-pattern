public class ModelDuck extends Duck{
    public ModelDuck() {
        // 初始状态下，模型鸭不飞行
        flyBehavior = new FlyNoWay(); // 使用不会飞行的行为
        quackBehavior = new Quack(); // 使用呱呱叫行为
    }
    @Override
    public void display() {
        System.out.println("我是模型鸭，我没有翅膀，不能飞行");
        performFly(); // 执行飞行行为
        performQuack(); // 执行叫声行为
    }
}
