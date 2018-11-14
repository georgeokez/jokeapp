package com.george.dev.jokeapp.controllerTest;

import com.george.dev.jokeapp.controllers.JokeApiController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by George on 14/11/2018
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class JokeApiControllerTest {

    @Autowired
    private JokeApiController jokeApiController;

    @Test
    public void testJokeApiController(){
        Assert.assertNotNull(jokeApiController.getJoke());
    }
}
