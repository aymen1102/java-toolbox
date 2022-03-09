package general.generics;

public class GenericClass2<M extends Number> {

    M genericVariable;

    public GenericClass2(M genericVariable) {
        this.genericVariable = genericVariable;
    }

    public double square(){
        return genericVariable.intValue() * genericVariable.doubleValue();
    }

    boolean absEqual(GenericClass2<?> ob){
        if(Math.abs(genericVariable.doubleValue()) == Math.abs(ob.genericVariable.doubleValue()))
            return true;
        else return false;
    }
}
