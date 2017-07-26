package com.mifeng.acm.practice.base;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {
	public static void main(String[] args){
		String src = "wel23come to chi6na";
		//int idx = src.indexOf(2);
		int idx2 = src.indexOf("comes");
		//System.out.println("idx:"+idx+", idx2:" + idx2);
		System.out.println(", idx2:" + idx2);
		String str = src.substring(3);
		String str2 = src.substring(3, 6);
		
//		System.out.println("str is "+str+", str2 is "+str2);
//		String regEx = "c*";
//		Pattern pattern = Pattern.compile(regEx);
//		Matcher matcher = pattern.matcher(src);
//		Boolean rs = matcher.find();
//		System.out.println(rs);
//		String reg = "\\d+";
//		Pattern pattern2 = Pattern.compile(reg);
//		Matcher matcher2 = pattern2.matcher(src);
//		//Boolean rs = matcher.find();
//		matcher2.s
//		System.out.println("start is :"+matcher2.start());
//		System.out.println("end is :"+matcher2.end());
//		Pattern p=Pattern.compile("\\d"); 
//		Matcher m=p.matcher("aaa2223bb"); 
//		//m.find();//匹配2223 
//		System.out.println(m.g);//返回3 
		//m.end();//返回7,返回的是2223后的索引号 
		//m.group();//返回2223 
		//String rs2 = matcher2.replaceAll("456");
		//System.out.println(rs2);
		//Character ch = 's';
		//src.startsWith(prefix)
		//matcher2.s
		//matcher2.group
		 String regEx = "count(\\d+)(df)";  
         String s = "count000dfdfsdffaaaa1";  
         Pattern pat = Pattern.compile(regEx);  
         Matcher mat = pat.matcher(s);  
         if(mat.find()){
            System.out.println(mat.group(2));
         }
		
	}

}
