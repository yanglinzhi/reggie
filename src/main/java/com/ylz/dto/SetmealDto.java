package com.ylz.dto;


import com.ylz.entity.Setmeal;
import com.ylz.entity.SetmealDish;
import lombok.Data;

import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
