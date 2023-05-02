package com.sunbeam;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.stream.Stream;

// Java NIO
public class Demo17_01Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a path: ");
		String pathString = sc.nextLine();
		// Path object represents a path of file/directory in the filesystem
		Path path = Path.of(pathString);
		
		if(!Files.exists(path)) {
			System.out.println("Invalid path.");
			System.exit(1);
		}
		
		if(Files.isDirectory(path)) {
			Stream<Path> stream = Files.list(path);
			stream.forEach(p -> System.out.println(p));
		}
		else if(Files.isRegularFile(path)) {
			System.out.println("File Name: " + path.getFileName());
			System.out.println("File Size: " + Files.size(path));
			String mode = (Files.isReadable(path)?"r":"-")
				+ (Files.isWritable(path)?"w":"-")
				+ (Files.isExecutable(path)?"x":"-");
			System.out.println("File Permissions: " + mode);
		}
		else
			System.out.println("Neither file nor directory.");
	}
}
