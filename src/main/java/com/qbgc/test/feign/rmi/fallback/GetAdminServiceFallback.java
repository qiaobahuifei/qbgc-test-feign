package com.qbgc.test.feign.rmi.fallback;

import com.qbgc.test.feign.rmi.GetAdminService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class GetAdminServiceFallback implements GetAdminService {
    @Override
    public String getRibbonInfo() {
        return "feign提醒你出错了！";
    }
}
