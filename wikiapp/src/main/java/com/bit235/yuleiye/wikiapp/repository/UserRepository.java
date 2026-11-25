// Name: Yu Leiye | Student ID: S1580814
package com.bit235.yuleiye.wikiapp.repository;

import com.bit235.yuleiye.wikiapp.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    // 硬编码的账号密码：yu / 123
    private static final String VALID_USERNAME = "yu";
    private static final String VALID_PASSWORD = "123";

    public User findByUsername(String username) {
        if (VALID_USERNAME.equals(username)) {
            return new User(VALID_USERNAME, VALID_PASSWORD);
        }
        return null;
    }
}