package com.ylz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ylz.entity.Employee;
import com.ylz.mapper.EmployeeMapper;
import com.ylz.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @author ylz
 * @date 2022/7/28 20:38
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
