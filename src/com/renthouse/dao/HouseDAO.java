package com.renthouse.dao;
import java.sql.*;
import java.util.*;
import com.renthouse.DataBase.Database;
import com.renthouse.entity.House;

public class HouseDAO {
	
    Database db = new Database();
    
    public int add(House house) {
		
		int re = -1;
		//String sql  = "insert into house (name,place,useful_period,function,content,price) values('"+ product.getName() +"','"+ product.getPlace() +"','"+ product.getUseful_period() + "','"+ product.getFunction() + "','"+ product.getContent() + "','"+ product.getPrice() +"')";
		//re = be.execute(sql);        //待写House表具体字段
		return re;
	}
    
	public int delete(int houseId) {
		
		int re = -1;
		String sql = "delete from products where houseId = "+houseId;
		re = db.execute(sql);
		return re;
	}
	
	public int delete(String houseId) {
		
		int re = -1;
		String sql = "delete from products where houseId = "+houseId;
		re = db.execute(sql);
		return re;
	}
	
    public List<House> getByHouseId(Integer houseId) {
    	
    	List<House> list = new ArrayList<House>();
    	String sql = "select * from house where house_id = "+houseId;
		ResultSet rs = db.query(sql);
		try {
			if(rs.next()) {
				House h = new House();
				h.setHouseId(rs.getInt("houseId"));
				h.setHouseAddTime(rs.getDate("houseAddTime"));	
				h.setHousePrice(rs.getDouble("housePrice"));
				h.setHouseNum(rs.getInt("houseNum"));
				h.setHouseHallNum(rs.getInt("houseHallNum"));
				h.setHouseBathroomNum(rs.getInt("houseBathroomNum"));
				h.setHouseArea(rs.getDouble("houseArea"));
				h.setHouseDirection(rs.getString("houseDirection"));
				h.setHouseFloor(rs.getInt("houseFloor"));
				h.setHouseDecoration(rs.getString("houseDecoration"));
				h.setHouseRoomNum(rs.getInt("houseRoomNum"));
				h.setHouseRoomType(rs.getString("houseRoomType"));
				h.setHouseRoomArea(rs.getDouble("houseRoomArea"));
				h.setHousePrice(rs.getDouble("housePrice"));
				h.setHousePayType(rs.getString("housePayType"));
				h.setHouseRentType(rs.getString("houseRentType"));
				h.setHouseTotalNum(rs.getInt("houseTotalNum"));
				h.setHouseComment(rs.getString("houseComment"));
			}
		} catch (SQLException e) {
			
			System.out.println(sql + e.toString()); 
		}
		return list;
    }

    public List<House> getByHouseId(String houseId) {
    	
    	List<House> list = new ArrayList<House>();
    	String sql = "select * from house where house_id = "+houseId;
		ResultSet rs = db.query(sql);
		try {
			if(rs.next()) {
				House h = new House();
				h.setHouseId(rs.getInt("houseId"));
				h.setHouseAddTime(rs.getDate("houseAddTime"));	
				h.setHousePrice(rs.getDouble("housePrice"));
				h.setHouseNum(rs.getInt("houseNum"));
				h.setHouseHallNum(rs.getInt("houseHallNum"));
				h.setHouseBathroomNum(rs.getInt("houseBathroomNum"));
				h.setHouseArea(rs.getDouble("houseArea"));
				h.setHouseDirection(rs.getString("houseDirection"));
				h.setHouseFloor(rs.getInt("houseFloor"));
				h.setHouseDecoration(rs.getString("houseDecoration"));
				h.setHouseRoomNum(rs.getInt("houseRoomNum"));
				h.setHouseRoomType(rs.getString("houseRoomType"));
				h.setHouseRoomArea(rs.getDouble("houseRoomArea"));
				h.setHousePrice(rs.getDouble("housePrice"));
				h.setHousePayType(rs.getString("housePayType"));
				h.setHouseRentType(rs.getString("houseRentType"));
				h.setHouseTotalNum(rs.getInt("houseTotalNum"));
			}
		} catch (SQLException e) {
			
			System.out.println(sql + e.toString()); 
		}
		return list;
    }
    
    public List<House> getAll(){
    	
    	List<House> list = new ArrayList<House>();
    	String sql = "select * from house";
    	ResultSet rs = db.query(sql);
    	try {
			while(rs.next()) {
				House h =new House();
				h.setHouseId(rs.getInt("house_id"));
				h.setHouseAddTime(rs.getDate("house_add_time"));
				h.setHouseDecoration(rs.getString("house_decoration"));
				list.add(h);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString() + sql);
		}
    	
    	return list;
    }

	public List<House> getAllByUserId(Integer useId){
	    	
    	List<House> list = new ArrayList<House>();
    	String sql = "select * from house where user_id="+useId;
    	ResultSet rs = db.query(sql);
    	try {
			while(rs.next()) {
				House h =new House();
				h.setHouseId(rs.getInt("house_id"));
				h.setHouseAddTime(rs.getDate("house_add_time"));
				h.setHouseDecoration(rs.getString("house_decoration"));
				list.add(h);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString() + sql);
		}
    	
    	return list;
    }
}
