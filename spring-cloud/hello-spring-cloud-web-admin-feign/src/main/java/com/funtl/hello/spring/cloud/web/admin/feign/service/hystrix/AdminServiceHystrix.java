package com.funtl.hello.spring.cloud.web.admin.feign.service.hystrix;

import com.funtl.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix  implements AdminService {


    @Override
    public String sayHi(String message) {
        return String.format("网路延迟，请检查网络状况是否通畅:%s but request bad",message);
    }
}
