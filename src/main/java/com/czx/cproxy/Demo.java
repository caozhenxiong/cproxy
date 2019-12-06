package com.czx.cproxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author caozhenxiong
 */
@Slf4j
public class Demo {
    public static void main(String[] args) {
        for (int i= 0;i<10000;i++){
            log.info("日志格式测试 {}", i);
        }
    }
}
