package com.actitime.testscripts;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class firstnonrepeatchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="text";
LinkedHashSet h=new LinkedHashSet();
char[] c=s.toCharArray();

for(int i=0;i<=s.length()-1;i++)
{
if(!h.contains(c[i]))
{
	h.add(c[i]);
}
else
{
	h.remove(c[i]);
}

}
System.out.println(h);
System.out.println(h.toArray()[0]);
	}

}
