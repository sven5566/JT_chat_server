package com.whr.jt.chat.server;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.whr.jt.chat.server.service.AccountService;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.Path;

/**
 * Created by whrr5 on 2017/6/7.
 */
public class Application extends ResourceConfig {
    public Application() {
        packages(AccountService.class.getPackage().getName());
        register(JacksonJsonProvider.class);
        register(AccountService.class.getPackage().getName());
    }
}
