package com.ms.groovytool.tools

import groovy.sql.Sql

/**
 * Created by wuketao on 2017/6/15.
 * 数据库操作类
 */
class DBOperation {
    //连接数据库
    def
    static sqlCon = Sql.newInstance('jdbc:mysql://localhost:3306/test', 'root', 'wuketao277', 'com.mysql.jdbc.Driver')

    /**
     * 查询数据
     * @param sql
     * @return
     */
    def static queryData(sql) {
        try {
            //数据处理
            sqlCon.eachRow(sql) { row -> println(row) }
        } catch (Exception ex) {
            println(ex)
        } finally {
            //关闭连接
//            sqlCon.close()
        }
    }

    /**
     * 执行DML操作
     * @param sql
     */
    def static execData(sql) {
        try {
            //数据处理
            sqlCon.execute(sql)
        } catch (Exception ex) {
            println(ex)
        } finally {
            //关闭连接
//            sqlCon.close()
        }
    }
}
