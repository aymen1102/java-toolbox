package general.generics;

public class GenericsExample {
    public static void main(String[] args) {

        GenericClass0<Double> doubleObject0 = new GenericClass0<>(2.0);
        doubleObject0.showType();

        GenericClass1<Integer,String> integerStringObject1 = new GenericClass1<>(1,"Hello");
        integerStringObject1.showType();


        GenericClass2<Integer> integerObject2 = new GenericClass2<>(3);
        GenericClass2<Double> doubleObject2 = new GenericClass2<>(3.0);

        System.out.println(integerObject2.square()); //9.0
        System.out.println(integerObject2.absEqual(doubleObject2)); //true

    }
}
