package com.ylz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ylz.entity.DishFlavor;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 20258
* @description 针对表【dish_flavor(菜品口味关系表)】的数据库操作Mapper
* @createDate 2022-08-02 12:16:02
* @Entity com.ylz.entity.DishFlavor
*/
@Mapper
public interface DishFlavorMapper extends BaseMapper<DishFlavor> {

}




