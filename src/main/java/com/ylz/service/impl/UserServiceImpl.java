package com.ylz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ylz.entity.User;
import com.ylz.mapper.UserMapper;
import com.ylz.service.UserService;
import org.springframework.stereotype.Service;

/**
* @author 20258
* @description 针对表【user(用户信息)】的数据库操作Service实现
* @createDate 2022-08-04 18:13:56
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




