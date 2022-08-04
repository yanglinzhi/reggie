package com.ylz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ylz.entity.ShoppingCart;
import com.ylz.service.ShoppingCartService;
import com.ylz.mapper.ShoppingCartMapper;
import org.springframework.stereotype.Service;

/**
* @author 20258
* @description 针对表【shopping_cart(购物车)】的数据库操作Service实现
* @createDate 2022-08-04 21:49:57
*/
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart>
    implements ShoppingCartService{

}




