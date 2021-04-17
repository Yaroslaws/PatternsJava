package Strategy;


public class Runner {
    public Runner() {
    }

    public static void main(String[] args) {
     StrategyGame strategyGame = new StrategyGame();
     strategyGame.setTactic(new Fast());
     strategyGame.executeStrategy();
     strategyGame.setTactic(new Tricky());
     strategyGame.executeStrategy();
    }
}
