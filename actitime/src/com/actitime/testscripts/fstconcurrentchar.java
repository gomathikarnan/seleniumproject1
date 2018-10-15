package com.actitime.testscripts;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class fstconcurrentchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="abbbcaca";
char[]c=s.toCharArray();
int m=0;
char d=' ';
//LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
List l=new ArrayList();
for(int i=0;i<=s.length()-1;i++)
{
	for(int j=i+1;j<=i+1;j++)
	{

	if(!l.contains(c[i]))

	{
		if(c[i]==c[j] && i!=j)
		{
			l.add(c[i]);
		}
		
	}
	
}
}
System.out.println("the maximum occuring concurrent char "+l);
	}

}
