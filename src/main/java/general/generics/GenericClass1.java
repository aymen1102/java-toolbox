package general.generics;

public class GenericClass1<K,T> {
    K genericVariableK;
    T genericVariableT;

    public GenericClass1(K genericVariableK, T genericVariableT) {
        this.genericVariableK = genericVariableK;
        this.genericVariableT = genericVariableT;
    }

    public void showType(){
        System.out.println(genericVariableK.getClass().getName());
        System.out.println(genericVariableT.getClass().getName());
    }

}
