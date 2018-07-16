package com.congqian.point.controller;
import com.congqian.point.VO.EventScore;
import com.congqian.point.VO.ScoreResult;
import com.congqian.point.entity.User;
import com.congqian.point.service.EventScoreService;
import com.congqian.point.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
/**
 * @program: point
 * @description:
 * @author: Cong.Qian
 * @create: 2018-07-15 00:33
 **/
@Slf4j
@Controller
public class UserController {
   @Autowired
    private UserService userService;
    @Autowired
    private EventScoreService eventScoreService;
    @GetMapping("/point")
    public String showInfo(@RequestParam(value = "page",defaultValue = "1") Integer page, ModelMap map) {
        List<User> userList=userService.getUser();
        List<ScoreResult> scoreResultList=new ArrayList<>();
        List<EventScore> eventScoreList=eventScoreService.getEventScore();
        for(User user:userList){
ScoreResult scoreResult=new ScoreResult();
            BeanUtils.copyProperties(user,scoreResult);
            if(eventScoreList.size()!=0){
                for(EventScore eventScore:eventScoreList){
                    if(eventScore.getId().equals(user.getId())){
                        scoreResult.setScoreChange(eventScore.getScoreChange()+scoreResult.getScoreChange());
                    }
                }
            }
scoreResultList.add(scoreResult);
        }
        PageHelper.startPage(page,10);
PageInfo<ScoreResult> pageInfo=new PageInfo<>(scoreResultList);
    map.put("userList",scoreResultList);
    map.put("totalPage",pageInfo.getPages());
    map.put("currentPage",page);
        return "/concept/point";
    }
    @GetMapping("/login")
    public String addUser() {
        return "concept/login";
    }
}
