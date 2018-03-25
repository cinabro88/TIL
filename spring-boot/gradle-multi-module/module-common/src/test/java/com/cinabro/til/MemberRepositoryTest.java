package com.cinabro.til;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class MemberRepositoryTest {

    @Test
    public void start() {
        System.out.println("테스트 코드가 잘 시작되나요?");
    }
}