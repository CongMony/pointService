package com.congqian.point.mapper;

import com.congqian.point.VO.EventScore;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ProjectName: point
 * @Description:不同维度展示员工积分信息
 * @Author: Cong.Qian
 * @CreateDate: 2018/7/12 14:16
 * @UpdateDate: 2018/7/12 14:16
 */
public interface ScoreMapper {

//获取本月积分
@Select("select event.duty_user_id,rule.score from event,rule where event.rule_id=rule.id and event.record_date " +
        "between datetime('now','start of month') and \n" +
        "datetime('now','start of month','+1 month')")
@Results({
        @Result(column = "duty_user_id",property = "id"),
        @Result(column = "score",property = "scoreChange")
})
    List<EventScore> getMonEventScore();
//获取今天积分
@Select("select event.duty_user_id,rule.score from event,rule where event.rule_id=rule.id and event.record_date " +
        "between datetime('now','start of day','+0 day') and \n" +
        "datetime('now','start of day','+1 day')")
@Results({
        @Result(column = "duty_user_id",property = "id"),
        @Result(column = "score",property = "scoreChange")
})
List<EventScore> getDayEventScore();
    //获取本周积分
    @Select("select event.duty_user_id,rule.score from event,rule where event.rule_id=rule.id and event.record_date " +
            "between datetime('now','start of day','-6 day','weekday 1') and \n" +
            "datetime(datetime('now','start of day','weekday 0'),'start of day','+1 day')")
    @Results({
            @Result(column = "duty_user_id",property = "id"),
            @Result(column = "score",property = "scoreChange")
    })
    List<EventScore> getWeekEventScore();
    //获取当年积分
    @Select("select event.duty_user_id,rule.score from event,rule where event.rule_id=rule.id" +
            " and event.record_date between datetime('now','start of year') and " +
            "datetime('now','start of year','+1 year')")
    @Results({
            @Result(column = "duty_user_id",property = "id"),
            @Result(column = "score",property = "scoreChange")
    })
    List<EventScore> getYearEventScore();
}
