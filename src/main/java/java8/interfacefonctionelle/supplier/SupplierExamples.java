package java8.interfacefonctionelle.supplier;

import java.util.function.Supplier;

public class SupplierExamples {
    public static void main(String[] args) {
        Supplier supplier = () -> "This is a supplier";
        System.out.println(supplier.get());
    }
}
