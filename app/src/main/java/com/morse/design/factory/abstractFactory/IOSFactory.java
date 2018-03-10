package com.morse.design.factory.abstractFactory;

/**
 * Created by morse on 2018/3/10.
 */

public class IOSFactory implements IFactory {
    @Override
    public IView create() {
        return new IOSView();
    }
}
