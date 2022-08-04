package com.ylz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ylz.entity.AddressBook;
import com.ylz.mapper.AddressBookMapper;
import com.ylz.service.AddressBookService;
import org.springframework.stereotype.Service;

/**
* @author 20258
* @description 针对表【address_book(地址管理)】的数据库操作Service实现
* @createDate 2022-08-04 20:59:58
*/
@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook>
    implements AddressBookService{

}




