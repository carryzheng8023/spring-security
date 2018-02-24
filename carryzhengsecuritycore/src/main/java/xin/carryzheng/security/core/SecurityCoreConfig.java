package xin.carryzheng.security.core;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import xin.carryzheng.security.core.properties.SecurityProperties;

/**
 * @author zhengxin
 * @date 2018-02-23 23:42:30
 */

@Configuration
@EnableConfigurationProperties(SecurityProperties.class)
public class SecurityCoreConfig {
}
