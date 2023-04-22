package com.geekster.urlhitcounter.controller;

import com.geekster.urlhitcounter.model.UrlHit;
import com.geekster.urlhitcounter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/visitor-count-app")
public class UrlHitController {
    @Autowired
    UrlHitService urlHitService;

    @GetMapping(value = "/count")
    public String getTotalHitCount(){
        int totalHitCount = urlHitService.getTotalHitCount();
        System.out.println(totalHitCount);
       return "TotalUrlHiCount: "+totalHitCount;
    }

    @GetMapping(value = "/username/{username}/count")
    public UrlHit getUserHitCount(@PathVariable String username ){
        return urlHitService.getHitCount(username);
    }
}
