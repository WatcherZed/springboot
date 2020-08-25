package com.example.demo.test.sia5;

import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.file.FileHeaders;
import org.springframework.messaging.handler.annotation.Header;

/**
 * @Description: 声明一个消息网关
 * @Author: lyk
 * @Date: 2020/8/25 20:17
 */
@MessagingGateway(defaultRequestChannel = "textInChannel")
public interface FileWriterGateway {
    void writeToFile(
            @Header(FileHeaders.FILENAME) String fileName,String data
    );
}
