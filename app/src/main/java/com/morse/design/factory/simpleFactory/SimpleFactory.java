package com.morse.design.factory.simpleFactory;

/**
 * 简单工厂
 * Created by morse on 2018/3/10.
 */
public class SimpleFactory {

    public static Api create(int type) {
        switch (type) {
            case 1:
                return new ImpA();
            case 2:
                return new ImpB();
            case 3:
                return new ImpC();
            default:
                return new ImpA();
        }

    }

    /**
     * 使用反射和泛型，不推荐
     *
     * @param c
     * @param <T>
     * @return
     */
    public static <T extends Api> T create(Class c) {
        Api api = null;
        try {
            api = (Api) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) api;
    }

}
