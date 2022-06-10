package com.dreamcloth;

import io.jsonwebtoken.lang.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class DreamclothApiApplicationTests {

    @Test
    void contextLoads(ApplicationContext context) {
        Assert.isNull(context);
    }

}
