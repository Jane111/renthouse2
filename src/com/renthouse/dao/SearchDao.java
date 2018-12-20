package com.renthouse.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.catalina.startup.HomesUserDatabase;

import com.renthouse.entity.House;
import com.sun.org.apache.regexp.internal.recompile;
import com.renthouse.common.*;

public class SearchDao {

	HashMap<Integer, String> sentence=new HashMap<Integer, String>();//表示字段和对应的生成语句
	
//	String baseSql = "select user_name,com_name,com_area,com_street,"
//			+ "house_id,house_building,house_unit,house_num,house_room_num,house_hall_num,house_bathroom_num,house_area,house_direction,house_price,"
//			+ "house_floor,house_total_floor,house_decoration,house_pay_type,house_comment,house_rent_type,house_room_type,house_room_area,house_add_time "
//			+ "from house inner join community on house.com_id = community.com_id INNER JOIN user on house.user_id=`user`.user_id ";
	
	
	String baseSql = "select user_name,com_name,com_area,com_street,"
			+ "house_id,house_room_num,house_hall_num,house_area,house_direction,house_price,"
			+ "house_floor,house_total_floor,house_decoration,house_pay_type,house_comment,house_advert,house_rent_type,house_room_area,house_add_time "
			+ "from house inner join community on house.com_id = community.com_id INNER JOIN user on house.user_id=`user`.user_id ";
	
	public void setSentence()//设置每个字段对应的数据库生成语句
	{
		sentence.put(Constant.AREA,"com_area=");
		sentence.put(Constant.TYPE,"house_rent_type=");
		sentence.put(Constant.MINPRICE,"house_price>=");
		sentence.put(Constant.MAXPRICE,"house_price<");
		sentence.put(Constant.ROOMNUM1,"house_room_num=");
		sentence.put(Constant.ROOMNUM5,"house_room_num>=");
	}
			
	
	public List<HouseDetail> getByCondition(HashMap<Integer, Object> value){

		List<HouseDetail> list = new ArrayList<HouseDetail>();
		
		setSentence();//构造生成语句的hash表
		
		int count=1;//用于添加where的计数
		String completeSql="";//构造完全的sql语句
		for(int i=1;i<=6;i++)
		{
			if(value.get(i)!=null)
			{
				if(count==1)//用于加上筛选条件的where
				{
					completeSql=baseSql+"where ";
					count++;
				}
				completeSql+=sentence.get(i)+"'"+value.get(i)+"' AND ";	//通过sentence哈希表和value哈希表构造对应的sql语句					
			}
						
		}
		
		completeSql=completeSql.substring(0,completeSql.length()-5);//从索引值开始查找,将最后一个添加AND去掉
		
		System.out.println(completeSql);
		
		Database db = new Database();
		ResultSet rs = db.query(completeSql);
		try {
			while(rs.next()){
				HouseDetail house = new HouseDetail();	
				
				house.setHouseId(rs.getInt("house_id"));
				
				house.setUserName(rs.getString("user_name"));//用户名				
				
				house.setComArea(rs.getString("com_area"));//区域
				house.setComStreet(rs.getString("com_street"));//街道名
				house.setComName(rs.getString("com_name"));//小区名
		
				
				house.setHouseRoomNum(rs.getInt("house_room_num"));//几室
				house.setHouseHallNum(rs.getInt("house_hall_num"));//几厅
				
				house.setHouseArea(rs.getDouble("house_area"));//平方米
				house.setHouseRoomArea(rs.getDouble("house_room_area"));//房屋的面积
				
				house.setHouseFloor(rs.getInt("house_floor"));//几层
				house.setHouseTotalNum(rs.getInt("house_total_floor"));//总共几层
				
				house.setHousePrice(rs.getDouble("house_price"));//价格
				
				house.setHouseRentType(rs.getString("house_rent_type"));//出租类型
				house.setHouseDirection(rs.getString("house_direction"));//房屋朝向
				house.setHousePayType(rs.getString("house_pay_type"));//支付类型
				
				house.setHouseAdvert(rs.getString("house_advert"));//宣传语
				house.setHouseAddTime(rs.getDate("house_add_time"));//添加时间
				
//				house.setHouseDecoration(rs.getString("house_decoration"));//装修类型				
//				house.setHouseComment(rs.getString("house_comment"));//备注	
//				house_room_type//主卧或是次卧
				
				list.add(house);
			}
		} catch (SQLException e) {
			System.out.println(e.toString() + completeSql);
		}	
		return list;
	}
	
//	
//	public List<Book> getAll(){
//		List<Book> list = new ArrayList<Book>();
//		String sql = "select * from book inner join type on book.t_id = type.t_id";
//		Database db = new Database();
//		ResultSet rs = db.query(sql);
//		try {
//			while(rs.next()){
//				Book book = new Book();
//				book.setB_id(rs.getInt("b_id"));
//				book.setB_author(rs.getString("b_author"));
//				book.setB_title(rs.getString("b_title"));
//				book.setB_image(rs.getString("b_image"));
//				book.setB_position(rs.getString("b_position"));
//				book.setB_status(rs.getString("b_status"));	
//				book.setB_desc(rs.getString("b_desc"));
//				book.setT_id(rs.getInt("book.t_id"));
//				book.setT_name(rs.getString("t_name"));			
//				list.add(book);
//			}
//		} catch (SQLException e) {
//			System.out.println(e.toString() + sql);
//		}
//		
//		return list;
//	}
}
