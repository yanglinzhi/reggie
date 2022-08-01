package com.ylz.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ylz.common.R;
import com.ylz.entity.Dish;
import com.ylz.service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.Arrays;

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

    @DeleteMapping
    public R<String> delete(Long[] ids){
        log.info("ids={}", Arrays.toString(ids));
        dishService.removeByIds(Arrays.asList(ids));
        return R.success("删除成功");
    }
    @PostMapping("/status/0")
    public R<String> stop(Long[] ids){
        log.info("ids={}",Arrays.toString(ids));
        //dishService
        return null;
    }

}
