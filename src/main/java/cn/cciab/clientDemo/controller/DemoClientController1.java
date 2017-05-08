package cn.cciab.clientDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import cn.cciab.clientDemo.entity.News;

@RestController
public class DemoClientController1 {
	/*自动注入resttemplate，用来支持微服务的调用*/
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("newsAndType/{id}")
	public News newsAndType(@PathVariable int id){
		News n=restTemplate.getForObject("http://localhost:7905/news/"+id,News.class);
		n.setTypeName("体育新闻");
		return n;
	}
}
