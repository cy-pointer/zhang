package org.zhang.common.excel.core;

import com.alibaba.excel.read.listener.ReadListener;

/**
 * Excel 导入监听
 *
 * @author zhang
 */
public interface ExcelListener<T> extends ReadListener<T> {

    ExcelResult<T> getExcelResult();

}
