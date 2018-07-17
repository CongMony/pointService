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
  private String id;

 private String description;

 private String rule_id;

 private String duty_user_id;

 private Date record_date;

 private String source;

 private String record_user_id;

 private String name;
}
