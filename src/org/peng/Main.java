package org.peng;

import javax.activation.MailcapCommandMap;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        Main lf = new Main();
        lf.earth();
    }

    /**
     * java 被设置成source(源码)目录,编译部署后，就是程序的跟目录
     * resource被设置成resource(资源)，编译部署后，被放置在跟下.不论开发模式下resource在什么位置
     * 读取resource中的文件，使用Class.getResourceAsStream("/xxx"),就是从跟下寻找并读取文件 。
     * 是所以classLoader读取文件，是从程序的当前目录中寻找并读取。
     */
    private void earth(){

        java.io.InputStream fis = this.getClass().getResourceAsStream("/it.properties");
        Properties pro = new Properties();
        try {
            pro.load(fis);
            String me = pro.getProperty("me");
            String you = pro.getProperty("you");
            String he = pro.getProperty("he");
            System.out.println(me + you + he);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
