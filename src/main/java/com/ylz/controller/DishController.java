package com.ylz.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ylz.common.R;
import com.ylz.entity.Dish;
import com.ylz.service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ylz
 * @date 2022/8/1 2:03
 */
@Slf4j
@RestController
@RequestMapping("/dish")
public class DishController {
    @Autowired
    private DishService dishService;
    @GetMapping("/page")
    public R<Page> page(int page,int pageSize,String  name){
        log.info("page={},pageSize={},name={}",page,pageSize,name);
        Page pageInfo = new Page(page, pageSize);
        LambdaQueryWrapper<Dish> queryWrapper = new LambdaQueryWrapper();
        queryWrapper.like(StringUtils.isNotEmpty(name),Dish::getName,name);
        queryWrapper.orderByDesc(Dish::getSort);
        dishService.page(pageInfo,queryWrapper);
        return R.success(pageInfo);
    }


}
