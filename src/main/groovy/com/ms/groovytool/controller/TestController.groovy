package com.ms.groovytool.controller

import com.ms.groovytool.tools.DBOperation
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * Created by wuketao on 2017/6/16.
 */
@RestController
@RequestMapping("test")
class TestController {
    @RequestMapping(path = "test",method =RequestMethod.GET)
    def test(){
        return  'ok'
    }

    @RequestMapping(path = "query",method =RequestMethod.GET)
    def query(){
        def result = DBOperation.queryData("select * from user")
        return result
    }
}
