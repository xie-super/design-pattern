public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("我不会叫，保持安静");
    }
}
