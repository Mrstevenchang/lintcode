package rainDrop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class String2 {
	public static void main(String args[]) {
		String str = "2018-07-08 11:22:00"; 
		String s = str.replaceAll("\\-", "").replaceAll("\\ ", "").replaceAll("\\:", "");
		/*String ss = s.replaceAll("\\ ", "");
		String sss = ss.replaceAll("\\:", "");*/
		System.out.print(s);
		
		
		String strDate="2018-07-08 11:22:00";
        SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //加上时间
        SimpleDateFormat format0 = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = null;
		try {
			date = sDateFormat.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
        String time = format0.format(date.getTime());	
        System.out.println(time);
	}

}
