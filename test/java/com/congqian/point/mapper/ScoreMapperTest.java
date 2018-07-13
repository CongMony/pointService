package com.congqian.point.mapper;

import com.congqian.point.VO.EventScore;
import com.congqian.point.VO.ScoreResult;
import com.congqian.point.entity.User;
import com.congqian.point.service.EventScoreService;
import com.congqian.point.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @ProjectName: point
 * @Description:
 * @Author: Cong.Qian
 * @CreateDate: 2018/7/12 16:01
 * @UpdateDate: 2018/7/12 16:01
 */
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class ScoreMapperTest {
@Autowired
private ScoreMapper mapper;
    @Test
    public void getEventScore() {
       List<EventScore> list=mapper.getEventScore();
      // EventScore eventScore=list.get(0);
     log.info(String.valueOf(list.size()));
    }

}