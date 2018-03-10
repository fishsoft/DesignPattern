package com.morse.design.factory.abstractFactory;

/**
 * Created by morse on 2018/3/10.
 */

public class AndroidView implements IView {
    @Override
    public void button() {
        System.out.println("Android Button");
    }
}
