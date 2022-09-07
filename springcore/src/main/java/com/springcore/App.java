package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Beans.Writer;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext c= new ClassPathXmlApplicationContext("conf.xml");
        Writer w=(Writer) c.getBean("writer");
        w.write();
    }
}
