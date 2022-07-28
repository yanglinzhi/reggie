package com.ylz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ylz.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ylz
 * @date 2022/7/28 20:36
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
