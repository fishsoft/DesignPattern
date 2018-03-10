package com.morse.design.factory.methodFactory;

/**
 * Created by morse on 2018/3/10.
 */

public abstract class ExportOperator {
    public abstract ExportFileApi factoryMethod();

    public boolean export(String data) {
        ExportFileApi api = factoryMethod();
        return api.export(data);
    }
}
