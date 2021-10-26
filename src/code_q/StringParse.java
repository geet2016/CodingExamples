package code_q;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.*;

public class StringParse {

/*	["<?xml version=\"1.0\" encoding=\"UTF-8\"?>",
	 "<!DOCTYPE hibernate-configuration PUBLIC \"-//Hibernate/Hibernate Configuration DTD 3.0//EN\" \"http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd\">",
	 "<hibernate-configuration>","  <session-factory>","  "
	 		+ "  <property name=\"hibernate.dialect\">org.hibernate.dialect.OracleDialect</property>","   "
	 				+ " <property name=\"hibernate.connection.datasource\">java:jboss/jdbc/SNE-SWClusterDatasource</property>",""
	 						+ "    <property name=\"current_session_context_class\">thread</property>",""
	 								+ "    <property name=\"show_sql\">false</property>",""
	 										+ "    <!-- Add mapping below -->","   "
	 												+ "     <mapping resource=\"com/motorola/merchandiser/cdnnotification/adapters/hibernate/hbms/PlayEventPropertyDb.hbm.xml\"/>","    "
	 														+ "    <mapping resource=\"com/motorola/merchandiser/cdnnotification/adapters/hibernate/hbms/PlaybackEventDb.hbm.xml\"/>"," "
	 																+ " </session-factory>","</hibernate-configuration>"]
	*/
	public static void main(String args[])
	{
		/*//String s= "<property name=\"hibernate.connection.datasource\">java:jboss/jdbc/SNE-SWClusterDatasource</property>";
		final Pattern pattern = Pattern.compile("<property>(.+?)</property>", Pattern.DOTALL);
		final Matcher matcher = pattern.matcher(s);
		if (matcher.matches()) {
		    String tag_value = matcher.group(1); //taking only group 1
		    System.out.println(tag_value); //printing only group 1
		}
	   String s ="TVHD,TVUHD,DASHSD";
	   String[] platforms = s.split(",");
	   List<String> list =Arrays.asList(platforms);
	   String definition= "";
	   if(list.stream().anyMatch(p -> p.endsWith("UHD")))
	   {
		   definition = "UHD";
	   }
	   else if(list.stream().anyMatch(p -> p.endsWith("HD")))
	   {
		   definition = "HD";
	   }
	   else if(list.stream().anyMatch(p -> p.endsWith("SD")))
	   {
		   definition = "SD";
	   }
	   else{
		   definition = "NONE";
	   }
	   System.out.println(definition);
	   for(int i=0;i<s1.length;i++){
	   System.out.println(s1[i]);
	   if(s1[i].endsWith("SD")){
		   System.out.println("SD");
	   }
	   if(s1[i].endsWith("SD")){
		   System.out.println("SD");
	   }
	   }*/
		
		//1629799158596 -> 24 aug
		//1628501939693 -> 9 aug
		long today = System.currentTimeMillis();
		System.out.println(today);
		long epoch = Long.parseLong("1628501939693");
		System.out.println(epoch);
		System.out.println(today>epoch);
		System.out.println(System.nanoTime());
	}
}
