/**
 * Created by IntelliJ IDEA.
 * User: LiuWenqi
 * Date: 2017-12-08
 * Time: 17:16
 * Description:
 */
package com.example.layui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/module")
public class ModuleController {
    @RequestMapping("/listModule")
    @ResponseBody
    public String listAll(){
        String str = "[\n" +
                "  {\n" +
                "    \"id\": 1,\n" +
                "    \"text\": \"资源管理\",\n" +
                "    \"url\": \"/\",\n" +
                "    \"parent_id\": 0,\n" +
                "    \"code\": \"100\",\n" +
                "    \"expand\": true,\n" +
                "    \"layuiIcon\": \"&#xe7a0;\",\n" +
                "    \"leaf\": false,\n" +
                "    \"children\": [\n" +
                "      {\n" +
                "        \"id\": 2,\n" +
                "        \"text\": \"系统注册\",\n" +
                "        \"url\": \"/structure/toUser\",\n" +
                "        \"parent_id\": 1,\n" +
                "        \"code\": \"1001\",\n" +
                "        \"expand\": true,\n" +
                "        \"layuiIcon\": \"&#xe61f;\",\n" +
                "        \"leaf\": true,\n" +
                "        \"children\": null\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 3,\n" +
                "        \"text\": \"系统资源管理\",\n" +
                "        \"url\": \"/system/toSystemResource\",\n" +
                "        \"parent_id\": 1,\n" +
                "        \"code\": \"1002\",\n" +
                "        \"expand\": true,\n" +
                "        \"layuiIcon\": \"&#xe61d;\",\n" +
                "        \"leaf\": true,\n" +
                "        \"children\": null\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 4,\n" +
                "    \"text\": \"组织与用户管理\",\n" +
                "    \"url\": \"/\",\n" +
                "    \"parent_id\": 0,\n" +
                "    \"code\": \"200\",\n" +
                "    \"expand\": true,\n" +
                "    \"layuiIcon\": \"&#xe613;\",\n" +
                "    \"leaf\": false,\n" +
                "    \"children\": [\n" +
                "      {\n" +
                "        \"id\": 5,\n" +
                "        \"text\": \"组织机构\",\n" +
                "        \"url\": \"/structure/toStructure\",\n" +
                "        \"parent_id\": 4,\n" +
                "        \"code\": \"2001\",\n" +
                "        \"expand\": true,\n" +
                "        \"layuiIcon\": \"&#xe613;\",\n" +
                "        \"leaf\": true,\n" +
                "        \"children\": null\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 6,\n" +
                "        \"text\": \"用户管理\",\n" +
                "        \"url\": \"/structure/toUser\",\n" +
                "        \"parent_id\": 4,\n" +
                "        \"code\": \"2002\",\n" +
                "        \"expand\": true,\n" +
                "        \"layuiIcon\": \"&#xe612;\",\n" +
                "        \"leaf\": true,\n" +
                "        \"children\": null\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 7,\n" +
                "    \"text\": \"权限管理\",\n" +
                "    \"url\": \"/\",\n" +
                "    \"parent_id\": 0,\n" +
                "    \"code\": \"300\",\n" +
                "    \"expand\": true,\n" +
                "    \"layuiIcon\": \"&#xe600;\",\n" +
                "    \"leaf\": false,\n" +
                "    \"children\": [\n" +
                "      {\n" +
                "        \"id\": 8,\n" +
                "        \"text\": \"角色管理\",\n" +
                "        \"url\": \"/authority/toAuthority\",\n" +
                "        \"parent_id\": 7,\n" +
                "        \"code\": \"3001\",\n" +
                "        \"expand\": true,\n" +
                "        \"layuiIcon\": \"&#xe600;\",\n" +
                "        \"leaf\": true,\n" +
                "        \"children\": null\n" +
                "      },\n" +
                "      {\n" +
                "        \"id\": 9,\n" +
                "        \"text\": \"用户角色管理\",\n" +
                "        \"url\": \"/authority/toUserRole\",\n" +
                "        \"parent_id\": 7,\n" +
                "        \"code\": \"3002\",\n" +
                "        \"expand\": true,\n" +
                "        \"layuiIcon\": \"&#xe61b;\",\n" +
                "        \"leaf\": true,\n" +
                "        \"children\": null\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "]";

        return str;
    }










}

