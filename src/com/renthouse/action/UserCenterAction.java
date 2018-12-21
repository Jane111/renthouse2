package com.renthouse.action;

import java.sql.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.renthouse.entity.Collect;
import com.renthouse.entity.House;
import com.renthouse.entity.Question;
import com.renthouse.entity.Reply;

public class UserCenterAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Integer houseId;			//房屋编号
	Integer useId;
	String userName="刁亚茹";
 	Integer comId;				//小区编号
 	Integer houseBuilding;		//房屋栋号
 	Integer houseUnit;			//房屋单元
 	Integer houseNum;			//房屋编号
 	Integer houseRoomNum;		//室
 	Integer houseHallNum;		//厅
 	Integer houseBathroomNum;	//卫
 	Double houseArea;			//总面积
 	String houseDirection;		//朝向
 	Double housePrice;			//价格
 	Integer houseFloor;			//楼层
 	Integer houseTotalNum;		//总层数
 	String houseDecoration;		//装修情况
 	String housePayType;		//支付方式
 	String houseComment;		//业主评价
 	String houseRentType;		//整租还是合租
 	String houseRoomType;		//主卧还是次卧
 	Double houseRoomArea;		//房间面积
 	Date houseAddTime;			//发布时间
 
 	Integer questionId;			//评论编号
 	String questionContent;		//评论内容
 	String questionTime;		//评论时间
 
 	Integer replyId;			//回复编号
 	String replyContent;		//回复内容
 	String replyTime;			//回复时间
 
 	Integer collectId;			//收藏编号
 	String collectTime;			//收藏时间
	
	List<House> myHouseList;  		//我的房源列表
	List<Question> myQuestionList;  //我的提问列表
	List<Reply> replyList;			//回复我的问题的回复列表
	List<Collect> myCollectList;	//我的收藏列表
	
	/**  Setters and Getters  **/
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
	public Integer getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}
	public String getQuestionContent() {
		return questionContent;
	}
	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}
	public String getQuestionTime() {
		return questionTime;
	}
	public void setQuestionTime(String questionTime) {
		this.questionTime = questionTime;
	}
	public Integer getReplyId() {
		return replyId;
	}
	public void setReplyId(Integer replyId) {
		this.replyId = replyId;
	}
	public String getReplyContent() {
		return replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
	public String getReplyTime() {
		return replyTime;
	}
	public void setReplyTime(String replyTime) {
		this.replyTime = replyTime;
	}
	public Integer getCollectId() {
		return collectId;
	}
	public void setCollectId(Integer collectId) {
		this.collectId = collectId;
	}
	public String getCollectTime() {
		return collectTime;
	}
	public void setCollectTime(String collectTime) {
		this.collectTime = collectTime;
	}
	public List<House> getMyHouseList() {
		return myHouseList;
	}
	public void setMyHouseList(List<House> myHouseList) {
		this.myHouseList = myHouseList;
	}
	public List<Question> getMyQuestionList() {
		return myQuestionList;
	}
	public void setMyQuestionList(List<Question> myQuestionList) {
		this.myQuestionList = myQuestionList;
	}
	public List<Reply> getReplyList() {
		return replyList;
	}
	public void setReplyList(List<Reply> replyList) {
		this.replyList = replyList;
	}
	public List<Collect> getMyCollectList() {
		return myCollectList;
	}
	public void setMyCollectList(List<Collect> myCollectList) {
		this.myCollectList = myCollectList;
	}

	/**  操作函数  **/
	//获取我的房源列表
	public String getMyHouse_List(){
		return "getMyHouseListSuccess";
	}
	//获取我的收藏列表
	public String getMyCollect_List(){
		return "getMyCollectListSuccess";
	}
	//获取我的消息列表
	public String getMyMessage_List(){
		return "getMyMessageListSuccess";
	}
	
}
