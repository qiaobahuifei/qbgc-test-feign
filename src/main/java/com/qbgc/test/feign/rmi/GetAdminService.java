package com.qbgc.test.feign.rmi;

import com.qbgc.test.feign.rmi.fallback.GetAdminServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author gaochao
 */
@FeignClient(value = "qbgc-test-ribbon", fallback = GetAdminServiceFallback.class)
public interface GetAdminService {

    @RequestMapping(value = "/ribbon", method = RequestMethod.GET)
    String getRibbonInfo();
}
