package com.congqian.point.controller;

import com.congqian.point.entity.Rule;
import com.congqian.point.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: point
 * @description:
 * @author: CongQian
 * @create: 2018-07-12 11:39
 * @update: 2018-07-12 11:39
 **/
@RestController
@RequestMapping("restful")
public class RuleRestController {

    @Autowired
    RuleService ruleService;

    @RequestMapping("/rule/list")
    public String listRule(){
        List<Rule> res = ruleService.listRule();
        return res.get(3).getDescription();
    }
    @RequestMapping("/rule/get")
    public String getRuleById(@RequestParam String id){
        Rule rule = ruleService.getRuleById(id);
        return rule.getDescription();
    }

    @RequestMapping("/rule/insert")
    public String insertRule(@RequestParam String id){
        Rule rule = new Rule();
        rule.setId(id);
        ruleService.insertRule(rule);
        return "insert done!";
    }

    @RequestMapping("/rule/delete")
    public String deleteRule(@RequestParam String id) {
        ruleService.delete(id);
        Rule rule = ruleService.getRuleById(id);
        String res = "delete success";
        if(rule != null){
            res = "delete failed";
        }
        return res;
    }

}
