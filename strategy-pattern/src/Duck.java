/**
 * @author superxie
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    public void performFly() {
        if (flyBehavior != null) {
            flyBehavior.fly();
        } else {
            System.out.println("没有飞行行为");
        }
    }
    public void performQuack() {
        if (quackBehavior != null) {
            quackBehavior.quack();
        } else {
            System.out.println("没有叫声行为");
        }
    }
    //不变部分
    public void swim() {
        System.out.println("所有的鸭子都会游泳");
    }

    public abstract void display();
}
