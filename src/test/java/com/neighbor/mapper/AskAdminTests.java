package com.neighbor.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class AskAdminTests {

    @Autowired
    AskAdminMapper askAdminMapper;


    @Test
    public void selectAllTest() {
        log.info(askAdminMapper.selectAll().toString());
    }


}