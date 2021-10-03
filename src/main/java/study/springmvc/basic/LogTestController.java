package study.springmvc.basic;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogTestController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";

        log.trace("trace log={}",name);
        log.debug("debug log={}",name);
        log.info("info log={}",name);
        log.warn("warn log ={}", name);
        log.error("error log ={}", name);

        // log.trace("trace log =" + name);  이렇게 사용하면 x
        // log level이 debug라도 a+b 연산이 진행되므로 쓸모없는 메모리, 연산 낭비

        return "ok";
    }
}
