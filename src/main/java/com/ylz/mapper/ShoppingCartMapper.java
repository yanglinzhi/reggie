package com.ylz.mapper;

import com.ylz.entity.ShoppingCart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 20258
* @description 针对表【shopping_cart(购物车)】的数据库操作Mapper
* @createDate 2022-08-04 21:49:57
* @Entity com.ylz.entity.ShoppingCart
*/
@Mapper
public interface ShoppingCartMapper extends BaseMapper<ShoppingCart> {

}




