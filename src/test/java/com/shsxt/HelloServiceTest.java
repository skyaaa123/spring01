package com.shsxt;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by User on 2018/4/13.
 */
public class HelloServiceTest {
    /*
       * Spring 工作流程:
       * 1> 读取配置文件
       * 2> 获取对应的bean
       * 3> 调用bean方法
       * */
    @Test
    public void test1() throws Exception {
        //1> 读取配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //2.获取对应的bean
       HelloService helloService = (HelloService) context.getBean("helloService");
        //调用bean方法
        helloService.test();
    }

}