package general.generics;

public class GenericClass0<K> {

    K genericVariable;

    public GenericClass0(K genericVariable) {
        this.genericVariable = genericVariable;
    }

    public void showType(){
        System.out.println(genericVariable.getClass().getName());
    }
}
