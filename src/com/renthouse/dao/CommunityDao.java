package com.renthouse.dao;

import java.util.List;

import org.junit.Test;

import com.renthouse.common.Database;
import com.renthouse.entity.Community;

public class CommunityDao {

	public int addCommunity(List<Community> comList){
		int re = -1;
		String sql="";
		for(Community com:comList)
		{
			sql += "insert into community(com_name, com_area, com_street) values('"+com.getComName()+"','"+com.getComArea()+"','"+com.getComStreet()+"');\n";
		}
//		System.out.println(sql);
		Database db = new Database();
		re = db.execute(sql);
		return re;
	}
	

}


