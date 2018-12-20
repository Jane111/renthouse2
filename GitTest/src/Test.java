import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//格式化输出日期
		//Date now = new Date();
		Date beginDate;  //=sdf.parse("2018-11-04 13:34:09");
		Date endDate;    //=sdf.parse("2018-11-04 13:33:47");
        long day;
		try
        {
        	beginDate = format.parse("2018-11-20");//开始时间
            endDate= new Date();//结束时间
			long between = beginDate.getTime() - endDate.getTime();
			day = between / (24 * 60 * 60 * 1000);
	  	  	
	  	  	String timeDifference = day + "天" ;
	  	  	System.out.println(timeDifference);
	  	  	System.out.println("相隔的天数="+day + "天" );
            
        } catch (ParseException e)
        {
            // TODO 自动生成 catch 块
            e.printStackTrace();
        }
	}

}
