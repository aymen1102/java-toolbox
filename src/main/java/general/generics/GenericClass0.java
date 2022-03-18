package general.generics;

public class GenericClass0<K> {

    K genericAttribute;

    public GenericClass0(K genericAttribute) {
        this.genericAttribute = genericAttribute;
    }

    public void showType(){
        System.out.println(genericAttribute.getClass().getName());
    }
}
