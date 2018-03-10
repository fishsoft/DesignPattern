package com.morse.design;

import com.morse.design.factory.abstractFactory.IOSFactory;
import com.morse.design.factory.methodFactory.ExportOperator;
import com.morse.design.factory.methodFactory.ExportPDFOperation;
import com.morse.design.factory.simpleFactory.Api;
import com.morse.design.factory.simpleFactory.ImpB;
import com.morse.design.factory.simpleFactory.SimpleFactory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    /**
     * 简单工厂测试
     */
    @Test
    public void testSimpleFactory() {
        Api api = SimpleFactory.create(1);
        api.operate();

        SimpleFactory.create(ImpB.class).operate();
    }

    /**
     * 工厂方法测试
     */
    @Test
    public void testFactoryMethod() {
        ExportOperator operator = new ExportPDFOperation();
        operator.export("财务报表");
    }

    /**
     * 抽象工厂测试
     */
    @Test
    public void testAbstractFactory() {
        new IOSFactory().create().button();
    }
}