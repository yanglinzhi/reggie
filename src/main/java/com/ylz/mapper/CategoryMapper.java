package com.ylz.mapper;

import com.ylz.entity.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author ylz
* @description 针对表【category(菜品及套餐分类)】的数据库操作Mapper
* @createDate 2022-08-01 01:10:05
* @Entity com.ylz.entity.Category
*/
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

}




