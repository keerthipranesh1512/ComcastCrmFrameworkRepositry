package com.concast.crm.webdriverutility;

import java.text.SimpleDateFormat;
import java.time.MonthDay;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * @author pranesh
 * contains methods to capture system date and random number
 */
public class JavaUtility {
	/**
	 * to generating random number
	 * @return
	 */
	public int getRandomno() {
		Random ran = new Random();
		int randomnumber = ran.nextInt(5000);
		return randomnumber;
	}
/**
 * Returning the system date
 * @return
 */
	public String getSysDate() {
		Date d = new Date();
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		String startdate = sim.format(d);
		return startdate;
	}
/**
 * calculating the end date using days argument
 * @param days
 * @return
 */
	public String endDate(int days) {
		
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = sim.getCalendar();

		cal.add(Calendar.DAY_OF_MONTH, days);
		String reqdate = sim.format(cal.getTime());

		return reqdate;
		
	}
}
