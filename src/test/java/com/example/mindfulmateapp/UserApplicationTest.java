package com.example.mindfulmateapp;

import com.example.mindfulmateapp.user.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertTrue;
@SpringBootTest
class UserApplicationTest {

    @Test
    void contextLoads() {
    }

    @Test
    public void userTest1(){

        User user = new User();

        user.setUserName("bob");

        String expected = "bob";
        assertTrue(expected == user.getUserName());

    }

    @Test
    public void userTest2(){

        User user = new User();

        user.setEmail("myemail");

        String expected = "myemail";
        assertTrue(expected == user.getEmail());

    }

    @Test
    public void userTest3(){

        User user = new User();

        user.setPassword("password");

        String expected = "password";
        assertTrue(expected == user.getPassword());
    }

    @Test
    public void userTest4(){
        User user = new User();

        user.setUserId(1);

        Integer expected = 1;
        assertTrue(expected == user.getUserId());


    }

}
