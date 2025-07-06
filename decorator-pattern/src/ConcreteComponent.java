public class ConcreteComponent extends Component{
    private String description = "装饰者类中的具体实现";

    @Override
    public double cost() {
        return 10.0;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
