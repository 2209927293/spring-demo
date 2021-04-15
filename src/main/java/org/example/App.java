package org.example;

import com.sun.org.apache.bcel.internal.util.ClassPath;
import javafx.application.Application;
import org.example.service.SomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

import static java.nio.channels.SelectionKey.OP_READ;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main( String[] args ) throws IOException {
        String config = "beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
       // SomeService someService = (SomeService)ctx.getBean("someService");
      //  someService.doSome();
    }
}
