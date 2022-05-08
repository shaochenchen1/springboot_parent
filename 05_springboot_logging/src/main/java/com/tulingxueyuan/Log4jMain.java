package com.tulingxueyuan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 * 崇尚开源开发组:Log4j（实现） + slf4j（门面）  必须加上桥接器
 */
public class Log4jMain {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Log4jMain.class);
        System.out.println(logger.getClass());
        logger.info("崇尚开源开发组:Log4j");

    }
}
