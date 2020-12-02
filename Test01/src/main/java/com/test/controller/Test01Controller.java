package com.test.controller;

import ch.qos.logback.core.pattern.FormatInfo;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.util.SocketUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

@Controller
@Slf4j
@ResponseBody
public class Test01Controller {
    @PostMapping("test01")
    public void test01 ( Map map) {
        System.out.println(map);

    }
}
