package org.zhang.common.tenant.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * 租户 配置属性
 *
 * @author zhang
 */
@Data
@ConfigurationProperties(prefix = "tenant")
public class TenantProperties {

    /**
     * 是否启用
     */
    private Boolean enable;

    /**
     * 排除表
     */
    private List<String> excludes;

}
