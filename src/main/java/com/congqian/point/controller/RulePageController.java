package com.congqian.point.controller;

import com.congqian.point.entity.Rule;
import com.congqian.point.service.RuleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @program: point
 * @description:
 * @author: CongQian
 * @create: 2018-07-12 14:36
 * @update: 2018-07-12 14:36
 **/
@Controller
public class RulePageController {
    @Autowired
    private RuleService ruleService;


    @RequestMapping("/rule/list")
    public String getRulePage2( ModelMap map) {

        List<Rule> ruleList = ruleService.listRule();
//        PageInfo<Rule> pageInfo = new PageInfo<>(ruleList);
        map.put("ruleList", ruleList);
      //  map.put("totalPage", pageInfo.getPages());
    //    map.put("currentPage", page);
        return "/rule/list";
    }
}
