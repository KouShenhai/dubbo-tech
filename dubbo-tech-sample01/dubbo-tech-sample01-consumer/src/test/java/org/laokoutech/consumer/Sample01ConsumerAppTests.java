package org.laokoutech.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.laokoutech.api.UserApi;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestConstructor;

@Slf4j
@SpringBootTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
class Sample01ConsumerAppTests {
    @DubboReference(version = "1.0.0")
    private UserApi userApi;

    @Test
    public void rpcApiTest() {
        String userName = userApi.getUserName();
        log.info("dubbo rpc api value：{}", userName);
    }
}
