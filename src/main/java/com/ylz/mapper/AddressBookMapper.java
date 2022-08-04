package com.ylz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ylz.entity.AddressBook;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 20258
* @description 针对表【address_book(地址管理)】的数据库操作Mapper
* @createDate 2022-08-04 20:59:58
* @Entity com.ylz.entity.AddressBook
*/
@Mapper
public interface AddressBookMapper extends BaseMapper<AddressBook> {

}




