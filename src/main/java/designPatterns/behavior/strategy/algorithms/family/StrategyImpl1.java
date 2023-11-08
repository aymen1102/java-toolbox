package designPatterns.behavior.strategy.algorithms.family;

public class StrategyImpl1 implements IStrategy {
    @Override
    public void applyStrategy() {
        System.out.println("Strategy 1");
    }
}
