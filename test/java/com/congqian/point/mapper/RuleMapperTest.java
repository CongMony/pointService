package com.congqian.point.mapper;


import com.congqian.point.entity.Rule;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @program: point
 * @description:
 * @author: s84103052 SunJiannan
 * @create: 2018-07-12 11:17
 * @update: 2018-07-12 11:17
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class RuleMapperTest {

    @Autowired
    RuleMapper ruleMapper;

    @Test
    public void listRule() {
        List<Rule> res = ruleMapper.listRule();
        System.out.println(res.size());
        System.out.println(res.get(0).getDescription());

    }

    @Test
    public void getRuleById(){
        String id = "1003000100";
        Rule rule = ruleMapper.getRuleById(id);
        System.out.println(rule.getDescription());
    }

    @Test
    public void deleteRule(){
        String id = "10087";
        int res = ruleMapper.deleteRule(id);
        System.out.println(res);
    }

}