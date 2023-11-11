package java8.interfacefonctionelle.supplier;

import java.util.function.Supplier;

/**
 * The Supplier functional interface is part of the java.util.function package and takes no input parameters.
 * Its main purpose is to supply a value using the get() method.
 * This interface is commonly used to represent a data supply operation, such as lazy value generation,
 * on-demand data loading or object creation. The Supplier interface is useful in a variety of contexts,
 * including functional programming, lambda expressions and data flow manipulation.
 * It can be used to encapsulate a data supply operation in a concise, readable way.
 */
public class SupplierExamples {
    public static void main(String[] args) {
        Supplier supplier = () -> "This is a supplier";
        System.out.println(supplier.get());
    }
}
