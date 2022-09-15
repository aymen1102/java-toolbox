package designPatterns.behavior.strategy.algorithms.family;

public class DefaultStrategyImpl implements IStrategy {
    @Override
    public void applyStrategy() {
        System.out.println("Default strategy");
    }
}
