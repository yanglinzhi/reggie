package com.ylz.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ylz.dto.DishDto;
import com.ylz.entity.Dish;

/**
* @author 20258
* @description 针对表【dish(菜品管理)】的数据库操作Service
* @createDate 2022-08-01 02:00:44
*/
public interface DishService extends IService<Dish> {
    //新增菜品，同时插入菜品对应的口味数据，需要同时操作两张表：dish和dish_flavor
    void saveWithFlavor(DishDto dishDto);
    //根据id查询菜品信息对应的口味信息
    DishDto getByIdWithFlavor(Long id);

    void updateWithFlavor(DishDto dishDto);
}
