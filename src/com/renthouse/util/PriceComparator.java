package com.renthouse.util;

import java.util.Comparator;

import com.renthouse.dao.ShowHouse;

public class PriceComparator implements Comparator<ShowHouse> {

	@Override
    public int compare(ShowHouse house1, ShowHouse house2)
    {   
        if(house1.getHousePrice()>house2.getHousePrice())//价格升序排列
        {  
            return 1;  
        }
        else
        {  
            return -1;  
        } 
    }
}
