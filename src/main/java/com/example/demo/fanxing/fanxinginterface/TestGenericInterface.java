package com.example.demo.fanxing.fanxinginterface;

public class TestGenericInterface {
    public static void main(String[] args) {
        GenericInterfaceImpl gg = new GenericInterfaceImpl();
        gg.method("字符串");

        GenericInterfaceImpl2<Integer> gg2 = new GenericInterfaceImpl2<>();
        gg2.method(1);

        GenericInterfaceImpl2<Boolean> gg3 = new GenericInterfaceImpl2<>();
        gg3.method(true);

        GenericInterfaceImpl2<Double> gg4 = new GenericInterfaceImpl2<>();
        gg4.method(8.11111);
    }
}
