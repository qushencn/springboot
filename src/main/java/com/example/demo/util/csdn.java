package com.example.demo.util;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class csdn {

	public int selectcsdn() throws IOException {
	 Document doc = Jsoup.connect("https://blog.csdn.net/weixin_38959210")
					.header("Accept-Encoding", "gzip, deflate")
				    .userAgent("Mozilla/5.0 (Windows NT 6.1; WOW64; rv:23.0) Gecko/20100101 Firefox/23.0")
				    .maxBodySize(0)
				    .timeout(600000)
				    .get();
		 
      Elements csdndoc=doc.select(".grade-box");
		 
		 Elements csdn_dd=csdndoc.select("dl dd");
		 
		 String fangwenliang=csdn_dd.get(1).attr("title");
		 
		 int fwliang = Integer.parseInt(fangwenliang);
		 
		 System.out.println("csdn访问量:"+fangwenliang);

		return fwliang;
		
	}
}
