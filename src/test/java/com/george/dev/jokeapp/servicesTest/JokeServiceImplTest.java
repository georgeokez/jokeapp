package com.george.dev.jokeapp.servicesTest;

import com.george.dev.jokeapp.services.JokeService;
import com.george.dev.jokeapp.services.JokeServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by George on 13/11/2018
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class JokeServiceImplTest {

    @Autowired
    private JokeService jokeService;

    @Test
    public void testJokeService(){
        Assert.assertNotNull(jokeService);
    }
}
