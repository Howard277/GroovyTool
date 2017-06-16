package com.ms.groovytool

import com.ms.groovytool.tools.DBOperation
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import springfox.documentation.swagger2.annotations.EnableSwagger2

/**
 * Created by wuketao on 2017/6/6.
 */
@SpringBootApplication
@EnableSwagger2
class App {
    static void main(def args) {
        SpringApplication.run(App.class,args)
    }
}
