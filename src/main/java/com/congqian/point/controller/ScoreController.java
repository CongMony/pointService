package com.congqian.point.controller;

import com.congqian.point.VO.EventScore;
import com.congqian.point.VO.ScoreResult;
import com.congqian.point.entity.User;
import com.congqian.point.service.EventScoreService;
import com.congqian.point.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: point
 * @Description:概要展示员工积分等信息
 * @Author: Cong.Qian
 * @CreateDate: 2018/7/17 11:41
 * @UpdateDate: 2018/7/17 11:41
 */
@Controller
public class ScoreController {
    @Autowired
    private UserService userService;
    @Autowired
    private EventScoreService eventScoreService;
    //按月查询
    @GetMapping("/month")
    public String showMonthInfo(ModelMap map) {
        List<User> userList=userService.getUsers();
        List<ScoreResult> scoreResultList=new ArrayList<>();
        List<EventScore> eventScoreList=eventScoreService.getMonEventScore();
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
        map.put("scoreResultList",scoreResultList);
        return "score/month";
    }
    //按天查询
    @GetMapping("/day")
    public String showDayInfo(ModelMap map) {
        List<User> userList=userService.getUsers();
        List<ScoreResult> scoreResultList=new ArrayList<>();
        List<EventScore> eventScoreList=eventScoreService.getDayEventScore();
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
        map.put("scoreResultList",scoreResultList);
        return "score/day";
    }
    //按周查询
    @GetMapping("/week")
    public String showWeekInfo(ModelMap map) {
        List<User> userList=userService.getUsers();
        List<ScoreResult> scoreResultList=new ArrayList<>();
        List<EventScore> eventScoreList=eventScoreService.getWeekEventScore();
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
        map.put("scoreResultList",scoreResultList);
        return "score/week";
    }
    //按年查询
    @GetMapping("/year")
    public String showYearInfo(ModelMap map) {
        List<User> userList=userService.getUsers();
        List<ScoreResult> scoreResultList=new ArrayList<>();
        List<EventScore> eventScoreList=eventScoreService.getYearEventScore();
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
        map.put("scoreResultList",scoreResultList);
        return "score/year";
    }
}
