# qbgc-test-feign
## feign
##### 调用微服务
* 引入feign的依赖
* 加上@EnableFeignClients注解
* 指定调用哪个微服务：
```
@FeignClient(value = "qbgc-test-ribbon")
public interface GetAdminService {

    @RequestMapping(value = "/ribbon", method = RequestMethod.GET)
    String getRibbonInfo();
}
```
##### 设置断路器
* feign自带断路器，所以只需要在配置中用feign.hystrix.enabled=true打开就好
* @FeignClient注解添加fallback指定调用哪个断路器
```
@FeignClient(value = "qbgc-test-ribbon", fallback = GetAdminServiceFallback.class)
public interface GetAdminService {

    @RequestMapping(value = "/ribbon", method = RequestMethod.GET)
    String getRibbonInfo();
}
```
* 创建fallback实现feign接口：
```
@Component
public class GetAdminServiceFallback implements GetAdminService {
    @Override
    public String getRibbonInfo() {
        return "feign提醒你出错了！";
    }
}
```

