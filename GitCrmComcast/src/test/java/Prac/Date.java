package Prac;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date {
public String getDate()
{
java.util.Date d=new java.util.Date();
SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
String data=sim.format(d);
return data;
}
public String getCal(int days) {
	SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd");
	Calendar cal=sim.getCalendar();
	cal.add(Calendar.DAY_OF_MONTH, days);
	String req=sim.format(cal.getTime());
	return req;
}
}
