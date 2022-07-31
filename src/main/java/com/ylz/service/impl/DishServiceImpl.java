package com.ylz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ylz.entity.Dish;
import com.ylz.service.DishService;
import com.ylz.mapper.DishMapper;
import org.springframework.stereotype.Service;

/**
* @author 20258
* @description 针对表【dish(菜品管理)】的数据库操作Service实现
* @createDate 2022-08-01 02:00:44
*/
@Service
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish>
    implements DishService{

}




