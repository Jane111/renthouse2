package com.renthouse.action;



import com.opensymphony.xwork2.ActionSupport;


public class SearchAction extends ActionSupport {

//	@Autowired
//	private userDao userDao;
	
	private String aera;//搜索用的区域，如洪山区
	private Double minprice;//最小价格
	private Double maxprice;//最大价格
	private Integer house_room_num;//几室
	private String house_rent_type;//整租or合租
	private Integer totalNum;//得到的总数
//	
//	public userDao getUserDao() {
//		return userDao;
//	}
//	public void setUserDao(userDao userDao) {
//		this.userDao = userDao;
//	}
	public String getAera() {
		return aera;
	}
	public void setAera(String aera) {
		this.aera = aera;
	}
	public Double getMinprice() {
		return minprice;
	}
	public void setMinprice(Double minprice) {
		this.minprice = minprice;
	}
	public Double getMaxprice() {
		return maxprice;
	}
	public void setMaxprice(Double maxprice) {
		this.maxprice = maxprice;
	}
	public Integer getHouse_room_num() {
		return house_room_num;
	}
	public void setHouse_room_num(Integer house_room_num) {
		this.house_room_num = house_room_num;
	}
	public String getHouse_rent_type() {
		return house_rent_type;
	}
	public void setHouse_rent_type(String house_rent_type) {
		this.house_rent_type = house_rent_type;
	}
	public Integer getTotalNum() {
		return totalNum;
	}
	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	//method
	@Override
	public String execute() throws Exception{
		totalNum=3;
	    System.out.println(aera);
	    System.out.println(minprice);
	    System.out.println(maxprice);
	    System.out.println(house_room_num);
	    System.out.println(house_rent_type);
	    return "success";

	 }

	
}
