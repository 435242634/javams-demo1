package com.example.javamsdemo1;

import com.gexin.ad.javams.framework.rpc.boot.EnableRpcClient;
import com.gexin.ad.javams.framework.rpc.boot.EnableRpcServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRpcClient
@EnableRpcServer
@SpringBootApplication
public class JavamsDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(JavamsDemo1Application.class, args);
    }
}
