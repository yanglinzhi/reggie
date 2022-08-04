package com.ylz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ylz.entity.SetmealDish;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 20258
* @description 针对表【setmeal_dish(套餐菜品关系)】的数据库操作Mapper
* @createDate 2022-08-04 09:57:07
* @Entity com.ylz.entity.SetmealDish
*/
@Mapper
public interface SetmealDishMapper extends BaseMapper<SetmealDish> {

}




