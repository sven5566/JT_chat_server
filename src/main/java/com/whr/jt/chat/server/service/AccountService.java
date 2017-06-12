package com.whr.jt.chat.server.service;

import com.whr.jt.chat.server.bean.api.account.RegisterModel;
import com.whr.jt.chat.server.bean.db.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by whrr5 on 2017/6/7.
 */
@Path("/account")
public class AccountService {
    @GET
    @Path("/test")
    public String register(){
        return "asdf";
    }

    @POST
    @Path("/register")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public User register(RegisterModel model){
        User item=new User();
        item.setName(model.getName());
        return item;
    }
}
