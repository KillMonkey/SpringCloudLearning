package com.forezp.servicehi.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.forezp.servicehi.entity.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/api/test")
@Api(value="Controller测试类")
public class TestController 
{
    
    @RequestMapping(value="/show",method=RequestMethod.POST)
    @ApiOperation(value="测试接口",notes="测试接口详细描述")
    public String show(@ApiParam(required=true, name="name", value="姓名")
                        @RequestParam(name = "name") String stuName)
    {
        return "inputName is :"+stuName;
    }
    
    @RequestMapping(value="/login",method=RequestMethod.POST)
    @ApiOperation(value="登录接口",notes="根据用户信息进行登录")
    public String login(@RequestBody User user)
    {
        if(null == user)
        {
            return "输入信息错误";
        }
        return user.toString();
    }
            

}
