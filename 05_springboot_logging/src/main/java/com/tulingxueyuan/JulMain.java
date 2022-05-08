package com.tulingxueyuan;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/***
 * @Author 徐庶   QQ:1092002729
 * @Slogan 致敬大师，致敬未来的你
 * 崇尚官方开发组:Jul（实现） + JCL（门面）
 *
 * 开发标准：记录日志不能直接使用日志实现框架，必须通过日志门面来实现
 * 统一 
 */
public class JulMain {
    public static void main(String[] args) {
        Log log = LogFactory.getLog(JulMain.class);
        System.out.println(log.getClass());
        log.info("崇尚官方开发组:Jul");
    }
}
