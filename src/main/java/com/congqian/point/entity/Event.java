package com.congqian.point.entity;

import lombok.Data;
import java.util.Date;
/**
 * @program: point
 * @description:事件
 * @author: Cong.Qian
 * @create: 2018-07-15 00:14
 **/
@Data
public class Event {
   private String dutyID;
    private String ruleType;
    private Date date;
    private String description;
    private String commitID;
}
