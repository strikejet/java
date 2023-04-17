package com.sunbeaminfo;

import java.util.StringTokenizer;

public class Program {

	public static void main(String[] args) {
		StringTokenizer strtok = new StringTokenizer("sunbeam is a institute");
		StringTokenizer strtok2 = new StringTokenizer("https://www.sunbeaminfo.com/placements","./:",false);
		
		while(strtok2.hasMoreTokens())
			System.out.println(strtok2.nextToken());
			
	}

}
