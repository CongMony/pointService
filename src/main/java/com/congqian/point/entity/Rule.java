package com.congqian.point.entity;

import lombok.Data;
import java.util.Date;

/**
 * @program: point
 * @description:
 * @author: Cong.Qian
 * @create: 2018-07-15 00:13
 **/
@Data
public class Rule {
    private String id;
    private String name;
    private String description;
    private Double score;
    private Date addDate;
    private String ruleSource;
}
