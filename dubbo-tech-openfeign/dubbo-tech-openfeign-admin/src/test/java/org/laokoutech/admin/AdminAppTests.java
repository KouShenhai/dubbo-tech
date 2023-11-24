package org.laokoutech.admin;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.laokoutech.admin.feign.UsersApiFeignClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestConstructor;

@SpringBootTest
@RequiredArgsConstructor
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
class AdminAppTests {

    private final UsersApiFeignClient usersApiFeignClient;

    @Test
    void userApiFeignTest() {
        usersApiFeignClient.test("1");
    }

}
