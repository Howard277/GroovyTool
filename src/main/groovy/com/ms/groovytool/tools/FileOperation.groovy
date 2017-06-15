package com.ms.groovytool.tools

/**
 * Created by wuketao on 2017/6/6.
 * 文件操作类
 */
class FileOperation {
    /**
     * 直接打印到控制台
     * @param filename
     */
    static void printEachLine(def filename) {
        new File(filename).eachLine("utf-8", { line -> println line; })
    }

    /**
     * 返回文件内容为一个list
     * @param filename
     * @return
     */
    static List<String> returnEachLine(def filename) {
        List<String> list = new ArrayList<>()
        new File(filename).eachLine("utf-8", { line -> list.add(line) })
        return list
    }
}
