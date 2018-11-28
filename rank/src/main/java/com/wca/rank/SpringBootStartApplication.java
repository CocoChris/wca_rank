package com.wca.rank;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Created by liuxingxin on 2018/11/5.
 */

public class SpringBootStartApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

        setRegisterErrorPageFilter(false);

        return builder.sources(RankApplication.class);
    }
}