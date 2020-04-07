package cn.jcera.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/")
    public String index() {
        logger.debug("hello");
        logger.info("hello");
        logger.warn("hello");
        logger.error("hello");
        return "First demo for jcera started";
    }

    @RequestMapping("/health")
    public String hello() {
        logger.info("Report is currently healthy！");
        return "success";
    }

}
