package com.sunbeam;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Demo17_02Main {
	public static void main(String[] args) throws Exception {
		RandomAccessFile aFile = new RandomAccessFile("/home/nilesh/mar-23/dac/java/Day16/dept.csv", "rw");
		FileChannel inChannel = aFile.getChannel();

		ByteBuffer buf = ByteBuffer.allocate(32);

		int bytesRead = inChannel.read(buf); // write data into buffer (from channel)
		while (bytesRead != -1) {
		    System.out.println("Read " + bytesRead);
		    buf.flip(); // switch buffer from write mode to read mode

		    while(buf.hasRemaining()){
		        System.out.print((char) buf.get()); // read data from the buffer
		    }

		    buf.clear(); // clear the buffer
		    bytesRead = inChannel.read(buf);
		}
		aFile.close();
	}
}
