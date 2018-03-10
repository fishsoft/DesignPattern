package com.morse.design.factory.methodFactory;

/**
 * Created by morse on 2018/3/10.
 */

public class ExportPDFApi implements ExportFileApi {
    @Override
    public boolean export(String data) {
        System.out.print("导出数据格式：PDF");
        System.out.print("导出数据：" + data);
        return false;
    }
}
