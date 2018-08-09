package ÏíÔªÄ£Ê½;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private Map<String,Flyweight> flyweights;
    public FlyweightFactory(){
        this.flyweights = new HashMap<>();
    }
    
    public Flyweight factory(String state) {
        Flyweight flyweight = flyweights.get(state);
        if(flyweight == null){
            flyweight = new ConcreteFlyWeight(state);
            flyweights.put(state, flyweight);
        }
        return flyweight;
    }
}
