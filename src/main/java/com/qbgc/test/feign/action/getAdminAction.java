package com.qbgc.test.feign.action;

import com.qbgc.test.feign.rmi.GetAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class getAdminAction {

    @Autowired
    private
    GetAdminService service;

    @RequestMapping("/feign")
    public String index(){
        return service.getRibbonInfo();
    }
}
