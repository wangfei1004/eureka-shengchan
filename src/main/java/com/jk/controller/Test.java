package com.jk.controller;

import com.jk.model.User;
import com.jk.service.TestService;

import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.impl.XMLResponseParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Test {
    @Autowired
    private TestService testService;
    @RequestMapping("test")
    public String hhh(String name){
        return testService.haha(name);
    }

    @RequestMapping("getUser")
    public List getUser(){
        return testService.getUser();
    }

    @RequestMapping("querylist")
    public void querylist(){
        String url = "http://localhost:8080/solr/mycore";
        HttpSolrServer core = new HttpSolrServer(url);
        core.setMaxRetries(1);
        core.setConnectionTimeout(5000);
        core.setParser(new XMLResponseParser()); // binary parser is used by default
        core.setSoTimeout(1000); // socket read timeout
        core.setDefaultMaxConnectionsPerHost(100);
        core.setMaxTotalConnections(100);
        core.setFollowRedirects(false); // defaults to false
        core.setAllowCompression(true);
    }

   @RequestMapping("login")
    public void login(){

   }
}
