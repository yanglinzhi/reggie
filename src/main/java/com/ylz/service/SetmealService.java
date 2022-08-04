package com.ylz.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ylz.dto.SetmealDto;
import com.ylz.entity.Setmeal;

/**
* @author 20258
* @description 针对表【setmeal(套餐)】的数据库操作Service
* @createDate 2022-08-01 16:48:16
*/
public interface SetmealService extends IService<Setmeal> {
    /**
     * 新增套餐，同时需要保存套餐和菜品的关联关系
     * @param setmealDto
     */
    void saveWithDish(SetmealDto setmealDto);
}
