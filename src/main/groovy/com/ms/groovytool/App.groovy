package com.ms.groovytool

import com.ms.groovytool.tools.DBOperation

/**
 * Created by wuketao on 2017/6/6.
 */
class App {
    static void main(def args) {
        DBOperation.execData("delete from user where id = 1")
        DBOperation.queryData("select * from user")
    }
}
