package com.renthouse.common;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.htmlcleaner.CleanerProperties;
import org.htmlcleaner.DomSerializer;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.renthouse.entity.Community;
import com.renthouse.dao.CommunityDao;
import com.renthouse.common.*;

public class JsoupCommunity {
	
	
	
	public static void main(String[] args) throws Exception{
		for(int index=1;index<=Constant.TOTAL_PAGES;index++)
		{
//			 System.out.println(index);
//			fecthByMap("https://wuhan.anjuke.com/community/p/"+index,"//div[@class='li-info']//a/text()");
			 fecthNode("https://wuhan.anjuke.com/community/p/"+index,"//div[@class='li-info']/h3/a/text()","//div[@class='li-info']/address");
			
		}
       
	}

    public static void fecthNode(String url, String xpath1, String xpath2) throws Exception {
       
    	CommunityDao communityDao=new CommunityDao();
    	List<Community> comList= new ArrayList<Community>();
    	
    	String html = null;
        try {
//            Connection connect = Jsoup.connect(url);
//            html = connect.get().body().html();
        	html=Jsoup.connect(url).get().body().html();
//            System.out.println(html);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println(html);
        
        HtmlCleaner hc = new HtmlCleaner();
        TagNode tn = hc.clean(html);
        Document dom = new DomSerializer(new CleanerProperties()).createDOM(tn);
        XPath xPath = XPathFactory.newInstance().newXPath();
        
        NodeList result1 = (NodeList) xPath.evaluate(xpath1, dom, XPathConstants.NODESET);//得到小区的名字
        NodeList result2 = (NodeList) xPath.evaluate(xpath2, dom, XPathConstants.NODESET);//得到小区的区域名和街道名
    
//        System.out.println(result1.getLength());   
        for (int i = 0; i < result1.getLength(); i++)
        {
        	
        	Community com =new Community(); 
            com.setComName(result1.item(i).getTextContent());//设置小区的名字   
            
            //编写正则表达式，提取字符串中关键数据
            Pattern pattern = Pattern.compile("([\u4e00-\u9fa50-9]+)");
            Matcher matcher = pattern.matcher(result2.item(i).getTextContent());
            int num=0;//对匹配的不同含义的数值进行计数
//          System.out.println(matcher.groupCount()+"count");
//          System.out.println(matcher.group(1));
		    while(matcher.find()){
		      	switch(num)
		      	{
	            	case 0:
	            		com.setComArea(matcher.group());//设置小区所在的地区
	            		System.out.println(matcher.group());
	            		break;
	            	case 2:
	            		com.setComStreet(matcher.group());//设置小区所在的街道
	            		break;
		      	}	      		
		      	num++;
		      } 
		      comList.add(com);
		      
        }
        
        communityDao.addCommunity(comList);
       
    }
	    
//    for (int i = 0; i < result1.getLength(); i++) {
//    	
//    	Community com =new Community();
//        Node node = result1.item(i);  
//        if(node == null)
//        {
//            continue;
//        }
////        System.out.println(node.getTextContent());   
//        com.setComName(node.getTextContent());//设置小区的名字    
//    }
//    
//    System.out.println(result2.getLength());
//    for (int i = 0; i < result2.getLength(); i++) {
//    	
//        Node node = result2.item(i);  
//        if(node == null)
//        {
//            continue;
//        }
////        System.out.println(node.getTextContent());  ［江汉-常青］新湾路40号 得到的数据 
//        
//
//        //编写正则表达式，提取字符串中关键数据
//        Pattern pattern = Pattern.compile("([\u4e00-\u9fa50-9]+)");
//        Matcher matcher = pattern.matcher(node.getTextContent());
//        int num=0;//对匹配的不同含义的数值进行计数
////        System.out.println(matcher.groupCount()+"count");
////        System.out.println(matcher.group(1));
//        while(matcher.find()){
//        	System.out.println();
//        	switch(num%3)
//        	{
//            	case 0:
//            		
//            		break;
//            	case 2:
//            		break;
//        	}
//        		
//        	num++;
//        }
//        
//    }

    /**
     *获取xpath下的a标签的文本值及href属性值
    **/
//    public static Map<String, String> fecthByMap(String url, String xpath1,String xpath2) throws Exception {
//        Map<String, String> nodeMap = new LinkedHashMap<>();
//        
//        Object result = fecthNode(url, xpath1, xpath2);
//
//        if (result instanceof NodeList) {
//            NodeList nodeList = (NodeList) result;
//            System.out.println(nodeList.getLength()); 
//            
//        }
//        
//        return nodeMap;
//    }

//	     获取xpath下的某个属性值
 
//    public static List<String> fecthAttr(String url, String xpath, String attr) throws Exception {
//        List<String> list = new ArrayList<>();
//        
//        Object result = fecthNode(url, xpath);
//        
//        if (result instanceof NodeList) {
//            NodeList nodeList = (NodeList) result;
//            
//            for (int i = 0; i < nodeList.getLength(); i++) {
//                Node node = nodeList.item(i);
//                if(node == null){
//                    continue;
//                }
//                list.add(node.getAttributes().getNamedItem(attr).getTextContent());
//                
//                //System.out.println(node.getTextContent() + " : " + node.getAttributes().getNamedItem("href"));
//            }
//        }
//        
//        return list;
//  
//	}

}
