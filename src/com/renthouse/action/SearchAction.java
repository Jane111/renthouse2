package com.renthouse.action;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.renthouse.common.Constant;
import com.opensymphony.xwork2.ActionSupport;
import com.renthouse.dao.ShowHouse;
import com.renthouse.dao.SearchDao;


public class SearchAction extends ActionSupport {

//	@Autowired
//	private userDao userDao;
	
	HashMap<Integer, Object> value=new HashMap<Integer, Object>();//表示字段和字段对应的值
	SearchDao searchDao = new SearchDao();
	
	private String area;//搜索用的区域，如洪山区
	private Integer price;//固定区间价格
	private Integer hallNum;//几室
	private String type;//整租or合租
	private Integer totalNum;//得到的总数
	private Integer minPrice;//手动输入最小价格
	private Integer maxPrice;//手动输入最大价格
	private List<ShowHouse> houseList;//查询得到的房屋详情
	
	
	public List<ShowHouse> getHouseList() {
		return houseList;
	}
	public void setHouseList(List<ShowHouse> houseList) {
		this.houseList = houseList;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(Integer minPrice) {
		this.minPrice = minPrice;
	}
	public Integer getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(Integer maxPrice) {
		this.maxPrice = maxPrice;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	public Integer getHallNum() {
		return hallNum;
	}
	public void setHallNum(Integer hallNum) {
		this.hallNum = hallNum;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
		
//		totalNum=3;
//	    System.out.println(area);
//	    System.out.println(price);
//	    System.out.println(hallNum);
//	    System.out.println(type);
//	    System.out.println(minPrice);
//	    System.out.println(maxPrice);
	    
	    value.put(Constant.AREA,area);//将区域筛选条件放入哈希表
	    value.put(Constant.TYPE,type);//将类型筛选条件放入哈希表
	    if(price==null)//判定价格采取哪几个值
	    {
	    	//采取输入框中的价格
	    	value.put(Constant.MINPRICE,minPrice);
	    	value.put(Constant.MAXPRICE,maxPrice);	    	
	    }
	    else
	    {
	    	//采取单选框中的价格
	    	if(price==5000)//分为5000以上
	    	{
	    		value.put(Constant.MINPRICE,price);
	    		value.put(Constant.MAXPRICE,null);
	    	}
	    	else //或者5000以下的各区间，间隔为500元
	    	{
	    		value.put(Constant.MINPRICE,price);
		    	value.put(Constant.MAXPRICE,price+Constant.PRICE_INTERVAl);
			}
	    	
	    }
	    		
	    if(hallNum != null && hallNum != 5)//如果输入1-4，则保存该值；输入为5，则直接调用相关语句
	    {
	    	  value.put(Constant.ROOMNUM1,hallNum);
	    }

	    houseList=searchDao.getByCondition(value);//进行搜索，得到结果
	    totalNum=houseList.size(); 
	    
//	    for(int i=1;i<=6;i++)
//		{
//			if(value.get(i)!=null)
//			{
//				System.out.println(value.get(i));
//			}
//						
//		}
	     
	    return "getSearch";

	 }
	
	public String getAll() throws Exception{
		
	    houseList=searchDao.getByCondition(value);//进行搜索，得到结果
	    totalNum=houseList.size(); 
	    return "getAll";

	 }
	
	
	
	


	
}
