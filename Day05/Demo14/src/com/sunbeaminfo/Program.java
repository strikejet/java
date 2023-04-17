package com.sunbeaminfo;

enum Languages{
	C,CPP,JAVA,PYTHON
}

public class Program {

	public static void main(String[] args) {
		
		System.out.println(Languages.C);
		System.out.println(Languages.CPP);
		System.out.println(Languages.JAVA);
		
		Languages ln = Languages.valueOf("CPP");
		System.out.println(ln);
		
		Languages arr[] =  Languages.values();
		System.out.println(arr[0].ordinal());
		System.out.println(arr[1].ordinal());
		System.out.println(arr[2]);
		System.out.println(arr[3]);
	}

}
