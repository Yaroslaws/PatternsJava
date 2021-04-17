package Strategy;

public class StrategyGame  {
    Strategy strategy;

    public void setTactic(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {strategy.use();}
}

class Tricky implements Strategy{

    @Override
    public void use() {
        System.out.println("Tricky");
    }
}

class Fast implements Strategy{

    @Override
    public void use() {
        System.out.println("Fast");
    }
}
