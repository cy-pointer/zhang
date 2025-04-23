package org.zhang.common.translation.core.impl;

import org.zhang.common.core.service.UserService;
import org.zhang.common.translation.annotation.TranslationType;
import org.zhang.common.translation.constant.TransConstant;
import org.zhang.common.translation.core.TranslationInterface;
import lombok.AllArgsConstructor;

/**
 * 用户名翻译实现
 *
 * @author zhang
 */
@AllArgsConstructor
@TranslationType(type = TransConstant.USER_ID_TO_NAME)
public class UserNameTranslationImpl implements TranslationInterface<String> {

    private final UserService userService;

    @Override
    public String translation(Object key, String other) {
        if (key instanceof Long id) {
            return userService.selectUserNameById(id);
        }
        return null;
    }
}
