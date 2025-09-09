package Day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.testng.annotations.Test;

public class ProgramPractice2 {
//@Test
	void splitStringCheck()
	{
		System.out.println("Enter a variable");
		Scanner sc= new Scanner(System.in);
		String word=sc.nextLine();
		String a[]=word.split("[,?\\saj]");
		System.out.println(a.length);
		System.out.println(Arrays.toString(a));
		/*for(String i:a)
		{
		System.out.println(i);
		}*/
	
	}
//@Test
void replaceStringCeck()
{
	String word="?;Lj....njbhbbjjk////}";
	String replacedString=word.replaceAll("[^a-zA-Z0-9]", " ");
	System.out.println(replacedString);
}

//@Test
void arraylistSecondLargest()
{
	ArrayList arr=new ArrayList();
	arr.add(500);
	arr.add(200);
	arr.add(400);
	arr.add(900);
	System.out.println(arr);
	Collections.sort(arr);
	System.out.println(arr);
	int secondLargest=arr.size()-2;
	System.out.println(arr.get(secondLargest));
	}
//@Test

void hashmapSortCheck() 
{
	HashMap hm=new HashMap();
	hm.put("karthi", 3);
	hm.put("siva", 4);
	hm.put("sathish", 1);
	hm.put("Iniyan", 2);
	System.out.println(hm);
	ArrayList arr=new ArrayList(hm.keySet());
	Collections.sort(arr);
	for(Object i:arr)
	{
		System.out.println(i+"\t"+ hm.get(i));
	}
}
@Test
void hashsetIteratorCheck()
{
	HashSet hs= new HashSet();
	hs.add(45);
	hs.add(89);
	hs.add(67);
	hs.add(34);
	ArrayList arr=new ArrayList(hs);
	Collections.sort(arr);
	Iterator it=arr.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
		
	}
}

//@Test
void arraySort()
{
	int a[]= {20,78,90,56};
   Arrays.sort(a);
   System.out.println(Arrays.toString(a));
}
}
