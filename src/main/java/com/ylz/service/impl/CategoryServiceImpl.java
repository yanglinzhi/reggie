package com.ylz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ylz.entity.Category;
import com.ylz.service.CategoryService;
import com.ylz.mapper.CategoryMapper;
import org.springframework.stereotype.Service;

/**
* @author ylz
* @description 针对表【category(菜品及套餐分类)】的数据库操作Service实现
* @createDate 2022-08-01 01:10:05
*/
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
    implements CategoryService{

}




