package com.renthouse.entity;

public class Photo {        //照片实体类
	
	private Integer photoId;
	private Integer houseId;
	private String photoUrl;
	
// 	private House aHouse;
	
	
	
// 	public House getaHouse() {
// 		return aHouse;
// 	}

// 	public void setaHouse(House aHouse) {
// 		this.aHouse = aHouse;
// 	}

	public Integer getPhotoId() {
		return photoId;
	}
	
	public void setPhotoId(Integer photoId) {
		this.photoId = photoId;
	}
	
	public Integer getHouseId() {
		return houseId;
	}
	
	public void setHouseId(Integer houseId) {
		this.houseId = houseId;
	}
	
	public String getPhotoUrl() {
		return photoUrl;
	}
	
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	
	public Photo() {   //照片无参构造方法
		
		
	}
	
	public Photo(Integer houseId,String photoUrl) {   //照片含参构造方法
		this.houseId = houseId;
		this.photoUrl = photoUrl;
	}
	
	public Photo(Integer photoId,Integer houseId,String photoUrl) {
		   //照片含参构造方法，含照片编号、房屋编号
		this.photoId = photoId;
		this.houseId = houseId;
		this.photoUrl = photoUrl;
	}

}

