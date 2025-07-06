import java.util.function.Consumer;

public abstract class Component {
    private String description = "父类";
    public abstract double cost();
    Consumer<Double> costConsumer = s -> System.out.println(s.intValue());

    public String getDescription() {
        return description;
    }
}
