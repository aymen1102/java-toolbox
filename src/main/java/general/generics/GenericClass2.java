package general.generics;

public class GenericClass2<M extends Number> {

    M genericVariable;

    public GenericClass2(M genericVariable) {
        this.genericVariable = genericVariable;
    }

    public double square(){
        return genericVariable.intValue() * genericVariable.doubleValue();
    }

    boolean absEqual(GenericClass2<?> genericClass2){
        if(Math.abs(genericVariable.doubleValue()) ==
                Math.abs(genericClass2.genericVariable.doubleValue()))
            return true;
        else return false;
    }
}
