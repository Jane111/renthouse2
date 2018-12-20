package com.renthouse.entity;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

public class House {        //房屋信息实体类
	
	private Integer houseId;
	private Integer useId;
	private Integer comId;
	private Integer houseBuilding;
	private Integer houseUnit;
	private Integer houseNum;
	private Integer houseRoomNum;
	private Integer houseHallNum;
	private Integer houseBathroomNum;
	private Double houseArea;        
	private String houseDirection;
	private Double housePrice;
	private Integer houseFloor;
	private Integer houseTotalNum;
	private String houseDecoration;
	private String housePayType;
	private String houseComment;
	private String houseRentType;
	private String houseRoomType;
	private Double houseRoomArea;
	private Date houseAddTime;
	private String houseAdvert;  //标题字段
	
	
//	private Set<Collect> setCollect=new HashSet<Collect>();//一个房屋可以被多次收藏
//	private Set<Photo> setPhoto=new HashSet<Photo>();//一个房屋可以有多张照片
//	private Set<Question> setQuestion=new HashSet<Question>();//一个房屋可以对应多个问题
	
//	private User aUser;
//	private Community aCommunity;
	
	public String getHouseAdvert() {
		return houseAdvert;
	}

	public void setHouseAdvert(String houseAdvert) {
		this.houseAdvert = houseAdvert;
	}

//	public User getaUser() {
//		return aUser;
//	}
//
//	public void setaUser(User aUser) {
//		this.aUser = aUser;
//	}
//
//	public Community getaCommunity() {
//		return aCommunity;
//	}
//
//	public void setaCommunity(Community aCommunity) {
//		this.aCommunity = aCommunity;
//	}

//	public Set<Collect> getSetCollect() {
//		return setCollect;
//	}
//
//	public void setSetCollect(Set<Collect> setCollect) {
//		this.setCollect = setCollect;
//	}
//
//	public Set<Photo> getSetPhoto() {
//		return setPhoto;
//	}
//
//	public void setSetPhoto(Set<Photo> setPhoto) {
//		this.setPhoto = setPhoto;
//	}
//
//	public Set<Question> getSetQuestion() {
//		return setQuestion;
//	}
//
//	public void setSetQuestion(Set<Question> setQuestion) {
//		this.setQuestion = setQuestion;
//	}

	public Integer getHouseId() {
		return houseId;
	}
	
	public void setHouseId(Integer houseId) {
		this.houseId = houseId;
	}
	
	public Integer getUseId() {
		return useId;
	}
	
	public void setUseId(Integer useId) {
		this.useId = useId;
	}
	
	public Integer getComId() {
		return comId;
	}
	
	public void setComId(Integer comId) {
		this.comId = comId;
	}
//	
	public Integer getHouseBuilding() {
		return houseBuilding;
	}
	
	public void setHouseBuilding(Integer houseBuilding) {
		this.houseBuilding = houseBuilding;
	}
	
	public Integer getHouseUnit() {
		return houseUnit;
	}
	
	public void setHouseUnit(Integer houseUnit) {
		this.houseUnit = houseUnit;
	}
	
	public Integer getHouseNum() {
		return houseNum;
	}
	
	public void setHouseNum(Integer houseNum) {
		this.houseNum = houseNum;
	}
	
	public Integer getHouseRoomNum() {
		return houseRoomNum;
	}
	
	public void setHouseRoomNum(Integer houseRoomNum) {
		this.houseRoomNum = houseRoomNum;
	}
	
	public Integer getHouseHallNum() {
		return houseHallNum;
	}
	
	public void setHouseHallNum(Integer houseHallNum) {
		this.houseHallNum = houseHallNum;
	}
	
	public Integer getHouseBathroomNum() {
		return houseBathroomNum;
	}
	
	public void setHouseBathroomNum(Integer houseBathroomNum) {
		this.houseBathroomNum = houseBathroomNum;
	}
	
	public Double getHouseArea() {
		return houseArea;
	}
	
	public void setHouseArea(Double houseArea) {
		this.houseArea = houseArea;
	}
	
	public String getHouseDirection() {
		return houseDirection;
	}
	
	public void setHouseDirection(String houseDirection) {
		this.houseDirection = houseDirection;
	}
	
	public Double getHousePrice() {
		return housePrice;
	}
	
	public void setHousePrice(Double housePrice) {
		this.housePrice = housePrice;
	}
	
	public Integer getHouseFloor() {
		return houseFloor;
	}
	
	public void setHouseFloor(Integer houseFloor) {
		this.houseFloor = houseFloor;
	}
	
	public Integer getHouseTotalNum() {
		return houseTotalNum;
	}
	
	public void setHouseTotalNum(Integer houseTotalNum) {
		this.houseTotalNum = houseTotalNum;
	}
	
	public String getHouseDecoration() {
		return houseDecoration;
	}
	
	public void setHouseDecoration(String houseDecoration) {
		this.houseDecoration = houseDecoration;
	}
	
	public String getHousePayType() {
		return housePayType;
	}
	
	public void setHousePayType(String housePayType) {
		this.housePayType = housePayType;
	}
	
	public String getHouseComment() {
		return houseComment;
	}
	
	public void setHouseComment(String houseComment) {
		this.houseComment = houseComment;
	}
	
	public String getHouseRentType() {
		return houseRentType;
	}
	
	public void setHouseRentType(String houseRentType) {
		this.houseRentType = houseRentType;
	}
	
	public String getHouseRoomType() {
		return houseRoomType;
	}
	
	public void setHouseRoomType(String houseRoomType) {
		this.houseRoomType = houseRoomType;
	}
	
	public Double getHouseRoomArea() {
		return houseRoomArea;
	}
	
	public void setHouseRoomArea(Double houseRoomArea) {
		this.houseRoomArea = houseRoomArea;
	}
	
	public Date getHouseAddTime() {
		return houseAddTime;
	}
	
	public void setHouseAddTime(Date houseAddTime) {
		this.houseAddTime = houseAddTime;
	}
	
	public House() {   //房屋无参构造方法
		
		
	}
	
	public House(Integer houseBuilding,Integer houseUnit,Integer houseNum,Integer houseRoomNum,Integer houseHallNum,Integer houseBathroomNum,Double houseArea,String houseDirection,Double housePrice,Integer houseFloor,Integer houseTotalNum,String houseDecoration,String housePayType,String houseComment,String houseRentType,String houseRoomType,Double houseRoomArea,Date houseAddTime){
		   //房屋含参构造方法
		this.houseBuilding = houseBuilding;
		this.houseUnit = houseUnit;
		this.houseNum = houseNum;
		this.houseRoomNum = houseRoomNum;
		this.houseHallNum = houseHallNum;
		this.houseBathroomNum = houseBathroomNum;
		this.houseArea = houseArea;
		this.houseDirection = houseDirection;
		this.housePrice = housePrice;
		this.houseFloor = houseFloor;
		this.houseTotalNum = houseTotalNum;
		this.houseDecoration = houseDecoration;
		this.housePayType = housePayType;
		this.houseComment = houseComment;
		this.houseRentType = houseRentType;
		this.houseRoomType = houseRoomType;
		this.houseRoomArea = houseRoomArea;
		this.houseAddTime = houseAddTime;
		this.houseAdvert = houseAdvert;
	}
	

}
