package com.ylz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ylz.entity.DishFlavor;
import com.ylz.mapper.DishFlavorMapper;
import com.ylz.service.DishFlavorService;
import org.springframework.stereotype.Service;

/**
* @author 20258
* @description 针对表【dish_flavor(菜品口味关系表)】的数据库操作Service实现
* @createDate 2022-08-02 12:16:02
*/
@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor>
    implements DishFlavorService{

}




