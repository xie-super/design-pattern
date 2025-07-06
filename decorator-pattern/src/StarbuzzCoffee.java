import javax.xml.stream.events.Comment;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Component beverage1 = new ConcreteComponent();
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        beverage1 = new ConcreteDecoratorA(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());


    }
}
