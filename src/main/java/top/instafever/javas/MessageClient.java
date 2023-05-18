package top.instafever.javas;

import org.springframework.cloud.openfeign.FeignClient;

// 指定请求服务名
@FeignClient("message")
public interface MessageClient {

}