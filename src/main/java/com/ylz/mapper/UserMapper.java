package com.ylz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ylz.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 20258
* @description 针对表【user(用户信息)】的数据库操作Mapper
* @createDate 2022-08-04 18:13:56
* @Entity com.ylz.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




