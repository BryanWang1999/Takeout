package com.bowang.reggie.dto;

import com.bowang.reggie.entity.Setmeal;
import com.bowang.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
