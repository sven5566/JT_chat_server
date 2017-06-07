package com.whr.jt.chat.server.service;

import com.whr.jt.chat.server.bean.UserTest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by whrr5 on 2017/6/7.
 */
@Path("/account")
public class AccountService {
    @POST
    @Path("/login")
    @Produces(MediaType.APPLICATION_JSON)
    public UserTest get(){
        UserTest item=new UserTest("asdf",2);

        return item;
    }
}
