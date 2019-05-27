package com.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 日期的工具类
 * @author 陈志�?
 *
 */
public class DateUtils {	
	/**
	 * 把一个字符串转成日期
	 * @param sdate 日期字符串，指定格式�? 2015-05-05
	 * @return	返回�?个date对象
	 * @throws ParseException 转换失败
	 */
	public static Date stringToDate(String sdate) throws ParseException{
		SimpleDateFormat ymd = new SimpleDateFormat("yyyy-MM-dd");
		return ymd.parse(sdate);
	}
	
	/**
	 * 将一个日期对象转换成指定格式的字符串<br/> 2015-05-05
	 * @param sdate
	 * @return
	 * @throws ParseException
	 */
	public static String dateToString(Date date) throws ParseException{
		SimpleDateFormat ymd = new SimpleDateFormat("yyyy-MM-dd");
		return ymd.format(date);
	}
	
	/**
	 * 将一个日期对象转换成指定格式的字符串<br/> 2015-05-05
	 * @param sdate
	 * @return
	 * @throws ParseException
	 */
	public static String dateToString1(Date date) throws ParseException{
		SimpleDateFormat ymd = new SimpleDateFormat("yyyy-MM");
		return ymd.format(date);
	}
	
	/**
	 * 将一个日期对象转换成指定格式的字符串<br/> 2015-05-05
	 * @param sdate
	 * @return
	 * @throws ParseException
	 */
	public static String dateToString2(Date date) throws ParseException{
		SimpleDateFormat ymd = new SimpleDateFormat("dd");
		return ymd.format(date);
	}
	
	//获取传入时间的月�?后一�?
	public static String getMontheLastDay(String date) throws ParseException
	{
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date dt = df.parse(date);
		Calendar c = Calendar.getInstance();  
		c.setTime(dt); 
		c.add(Calendar.MONTH, 1);
		c.set(Calendar.DAY_OF_MONTH,0);//设置�?1�?,当前日期既为本月第一�? 
		Date rdate = c.getTime();
		return dateToString2(rdate);
	}
	
	//public static void main(String str[]) throws ParseException
	//{
		//System.out.println(getMontheLastDay("2015-04-15"));
		//System.out.println(dateToString(getSysdateUpLastDate()));
	//}
	
	//获取系统当前时间的上�?个月及月末最后一�?
	public static Date getSysdateUpLastDate()
	{
		Calendar cale = Calendar.getInstance();   
        cale.set(Calendar.DAY_OF_MONTH,0);//设置�?1�?,当前日期既为本月第一�? 
		Date date = cale.getTime();
		return date;
	}
	
//	public static void main(String str[])
//	{
//		System.out.println(compare_dates("2015-12-06","2015-12-03","2015-12-05"));
//	}
	
	 public static int compare_date(String DATE1, String DATE2) {
	        
	        
	        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	        try {
	            Date dt1 = df.parse(DATE1);
	            Date dt2 = df.parse(DATE2);
	            if (dt1.getTime() > dt2.getTime()) {
	                System.out.println("dt1 在dt2�?");
	                return 1;
	            } else if (dt1.getTime() < dt2.getTime()) {
	                System.out.println("dt1在dt2�?");
	                return -1;
	            } else {
	                return 0;
	            }
	        } catch (Exception exception) {
	            exception.printStackTrace();
	        }
	        return 0;
	    }
	 
	 public static boolean compare_dates(String DATE1, String DATE2, String DATE3) {
	        
	        
	        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	        try {
	            Date dt1 = df.parse(DATE1);
	            Date dt2 = df.parse(DATE2);
	            Date dt3 = df.parse(DATE3);
	            if (dt1.getTime() >= dt2.getTime()&& dt1.getTime() <= dt3.getTime()) {
	                return true;
	            } 
	        } catch (Exception exception) {
	            exception.printStackTrace();
	        }
	        return false;
	    }
	
//	 public static int compare_date(String DATE1, String DATE2) {
//	        
//	        
//	        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");
//	        try {
//	            Date dt1 = df.parse(DATE1);
//	            Date dt2 = df.parse(DATE2);
//	            if (dt1.getTime() > dt2.getTime()) {
//	                System.out.println("dt1 在dt2�?");
//	                return 1;
//	            } else if (dt1.getTime() < dt2.getTime()) {
//	                System.out.println("dt1在dt2�?");
//	                return -1;
//	            } else {
//	                return 0;
//	            }
//	        } catch (Exception exception) {
//	            exception.printStackTrace();
//	        }
//	        return 0;
//	    }
	
//	public static void main(String str[]) throws ParseException
//	{
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
//		//获取前月的第�?�?
//        Calendar   cal_1=Calendar.getInstance();//获取当前日期 
//        cal_1.add(Calendar.MONTH, -1);
//        cal_1.set(Calendar.DAY_OF_MONTH,1);//设置�?1�?,当前日期既为本月第一�? 
//        String firstDay = format.format(cal_1.getTime());
//        System.out.println("-----1------firstDay:"+firstDay);
//        //获取前月的最后一�?
//        Calendar cale = Calendar.getInstance();   
//        cale.set(Calendar.DAY_OF_MONTH,0);//设置�?1�?,当前日期既为本月第一�? 
//        String lastDay = format.format(cale.getTime());
//        System.out.println("-----2------lastDay:"+lastDay);
//	}
	
	/**
	 * 对一个日期进行加减操作，如果为正数则是加，如果为负数则是�?
	 * @param date	日期对象
	 * @param datenum	比如说一�?1，则加一天，-1则减�?�?
	 * @return 返回�?个日期对�?
	 */
	public static Date ctrlDate(Date date,int datenum){
		Calendar calender = new GregorianCalendar();
		calender.setTime(date);
		calender.add(calender.DATE, datenum);
		return calender.getTime();
	}
	
	
	
	
	
	/**
	 * 得到指定天数的最后一秒钟
	 * @param date 指定的日期对�?
	 * @return	返回指定日期的最后一秒：2015-06-30 23:59:59
	 * @throws ParseException 
	 */
	public static String getDayLastTime(Date date) throws ParseException{
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
	    String str=format.format(date);
	    Date d2=format.parse(str);	    
	    int dayMis=1000*60*60*24;//�?天的毫秒-1
	    //返回�? 1970 �? 1 �? 1 �? 00:00:00 GMT 以来�? Date 对象表示的毫秒数�?
	    long curMillisecond=d2.getTime();//当天的毫�?    
	    long resultMis=curMillisecond+(dayMis-1); //当天�?后一�?
	    DateFormat format2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    //得到我需要的时间    当天�?后一�?
	    Date resultDate=new Date(resultMis);
	    String lastTime = format2.format(resultDate);
	    System.out.println("当天的最后一�?:"+lastTime);
	    return lastTime;
	}
	
	/**
	 * 得到指定天数的最后一秒钟
	 * @param date 字符串类型的日期，格式必须为:2015-06-30
	 * @return 返回当天的最后一秒，字符�?2015-06-30 23:59:59
	 * @throws ParseException
	 */
	public static String getDayLastTime(String date) throws ParseException{
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		Date d = format.parse(date);
	    String str=format.format(d);
	    Date d2=format.parse(str);	    
	    int dayMis=1000*60*60*24;//�?天的毫秒-1
	    //返回�? 1970 �? 1 �? 1 �? 00:00:00 GMT 以来�? Date 对象表示的毫秒数�?
	    long curMillisecond=d2.getTime();//当天的毫�?    
	    long resultMis=curMillisecond+(dayMis-1); //当天�?后一�?
	    DateFormat format2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    //得到我需要的时间    当天�?后一�?
	    Date resultDate=new Date(resultMis);
	    String lastTime = format2.format(resultDate);
	    System.out.println("当天的最后一�?:"+lastTime);
	    return lastTime;
	}
	
	/**
	 * 传一个字符串进来，根据传入的当前时间格式，希望转换成的时间格式来进行时间 的转�?
	 * @param date 时间字符串，可以是任意格式，只不过需要在参数中指定格�?
	 * @param oldFormat 当前时间字符串格式，如yyyy-MM-dd�?
	 * @param newFormat	�?要转换成的时间格�?
	 * @return	返回新的时间格式，字符串类型
	 * @throws ParseException 
	 */
	public static String getNewDateForFormat(String date,String oldFormat,String newFormat) throws ParseException{
		SimpleDateFormat oldF = new SimpleDateFormat(oldFormat);
		SimpleDateFormat newF = new SimpleDateFormat(newFormat);
		Date oldDate = oldF.parse(date); 
		return newF.format(oldDate);
	}
	
	/**
	 * 根据传入的时间与分钟大小，进行分钟的运算
	 * @param date 日期对象
	 * @param minute �?要加减的分钟，如果为正数，则为增加，如果为负数则为减
	 * @return
	 */
	public static String ctrlDateMinute(Date date,int minute){
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
        Calendar c = Calendar.getInstance();  
		c.setTime(date);  
		c.add(c.MINUTE, minute);//属�?�很多也有月等等，可以操作各种时间日�?   
		Date temp_date = c.getTime();   
		return format.format(temp_date);
	}
	
}
