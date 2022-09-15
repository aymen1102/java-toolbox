package designPatterns.behavior.strategy.client;

import designPatterns.behavior.strategy.algorithms.family.DefaultStrategyImpl;
import designPatterns.behavior.strategy.algorithms.family.IStrategy;

public class Context {

    private IStrategy strategy;

    public Context() {
        this.strategy = new DefaultStrategyImpl();
    }

    public void process(int type){
       if(type==1) System.out.println("Strategy 1");
       else if(type==2) System.out.println("Strategy 2");
       else if(type==3) System.out.println("Strategy 3");
   }

   public void process(){
       strategy.applyStrategy();
   }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
}
