package org.example;

import static org.junit.Assert.assertTrue;

import org.example.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void Test01() {
        String config = "beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        SomeService someService = (SomeService)ctx.getBean("someService");
        someService.doSome();
    }
}
