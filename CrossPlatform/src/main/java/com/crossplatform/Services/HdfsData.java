package com.crossplatform.Services;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

public class HdfsData {
public List retriveData(){
	List l=new ArrayList();
	String uri="hdfs://localhost:9000/p/write.csv";
	Configuration conf=new Configuration();
	
	String outputpath="C:/Users/USER/Desktop/user.csv";
	conf.set("fs.defaultFS", "hdfs://nameNode:9000");
	
	//OutputStream out = null;
	
	String user[]=null;
	try{
		FileSystem fs=FileSystem.get(URI.create(uri),conf);
		InputStream in=null;
		OutputStream out1=new BufferedOutputStream(new FileOutputStream(outputpath));
		InputStream in1=fs.open(new Path(uri));
		
	in=fs.open(new Path(uri));
	//String s="";
	//IOUtils.copyBytes(in,System.out, 14096,false);

	
	//System.out.println("-----success----");
OutputStream out = System.out;
    byte buffer[] = new byte[14096];
    int bytesRead = 0;
    while ((bytesRead = in1.read(buffer)) > 0) {
    	//System.out.println("-----start----");
      //  out.write(buffer, 0, bytesRead);
      //  System.out.println("-----done----");
        String s=new String(buffer);
        //System.out.println(s);
        user=s.split("\\n");

for(int i=0;i<user.length-1;i++){
	l.add(user[i]);
	
}

     }
    
    
	}
	catch (Exception e)
	{
		System.out.println(e);
	}
	
	return l;
}
	
}
