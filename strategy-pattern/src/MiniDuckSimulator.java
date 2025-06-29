public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly(); // 执行飞行行为
        mallardDuck.performQuack(); // 执行叫声行为


        Duck modelDuck = new ModelDuck();
        modelDuck.performFly(); // 执行飞行行为
        modelDuck.performQuack(); // 执行叫声行为

        modelDuck.setFlyBehavior(new FlyWithWings());
        modelDuck.performFly(); // 执行新的飞行行为


    }
}
