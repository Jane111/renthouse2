import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//��ʽ���������
		//Date now = new Date();
		Date beginDate;  //=sdf.parse("2018-11-04 13:34:09");
		Date endDate;    //=sdf.parse("2018-11-04 13:33:47");
        long day;
		try
        {
        	beginDate = format.parse("2018-11-20");//��ʼʱ��
            endDate= new Date();//����ʱ��
			long between = beginDate.getTime() - endDate.getTime();
			day = between / (24 * 60 * 60 * 1000);
	  	  	
	  	  	String timeDifference = day + "��" ;
	  	  	System.out.println(timeDifference);
	  	  	System.out.println("���������="+day + "��" );
            
        } catch (ParseException e)
        {
            // TODO �Զ����� catch ��
            e.printStackTrace();
        }
	}

}
