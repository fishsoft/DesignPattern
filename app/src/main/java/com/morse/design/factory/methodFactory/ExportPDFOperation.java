package com.morse.design.factory.methodFactory;

/**
 * Created by morse on 2018/3/10.
 */

public class ExportPDFOperation extends ExportOperator {
    @Override
    public ExportFileApi factoryMethod() {
        return new ExportPDFApi();
    }
}
