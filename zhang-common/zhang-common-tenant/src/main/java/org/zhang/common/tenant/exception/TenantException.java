package org.zhang.common.tenant.exception;

import org.zhang.common.core.exception.base.BaseException;

import java.io.Serial;

/**
 * 租户异常类
 *
 * @author zhang
 */
public class TenantException extends BaseException {

    @Serial
    private static final long serialVersionUID = 1L;

    public TenantException(String code, Object... args) {
        super("tenant", code, args, null);
    }
}
