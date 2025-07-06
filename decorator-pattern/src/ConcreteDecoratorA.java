public class ConcreteDecoratorA extends Decorator{

    private Component component;
    private double additionalCost = 5.0;
    public ConcreteDecoratorA(Component component) {
        this.component = component;

    }
    @Override
    public double cost() {
        return component.cost()+this.additionalCost;
    }

    @Override
    public String getDescription() {
        return component.getDescription() + " + ConcreteDecoratorA";
    }
}
