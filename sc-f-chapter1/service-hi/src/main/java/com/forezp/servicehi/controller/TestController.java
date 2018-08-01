package com.forezp.servicehi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/api/test")
public class TestController 
{
    
    @RequestMapping(value="/show",method=RequestMethod.POST)
    @ApiOperation(value="测试接口",notes="测试接口详细描述")
    public String show(@ApiParam(required=true, name="name", value="姓名")
                        @RequestParam(name = "name") String stuName)
    {
        return "inputName is :"+stuName;
    }

}
