package com.ylz.mapper;

import com.ylz.entity.Dish;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 20258
* @description 针对表【dish(菜品管理)】的数据库操作Mapper
* @createDate 2022-08-01 02:00:44
* @Entity com.ylz.entity.Dish
*/
@Mapper
public interface DishMapper extends BaseMapper<Dish> {

}




