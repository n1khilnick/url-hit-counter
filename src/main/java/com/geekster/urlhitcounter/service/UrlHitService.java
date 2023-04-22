package com.geekster.urlhitcounter.service;

import com.geekster.urlhitcounter.model.UrlHit;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UrlHitService {

    static HashMap<String,Integer> urlHitCountMap = new HashMap<>();

    public int getTotalHitCount(){
        return UrlHit.totalCounter;
    }

    public UrlHit getHitCount(String username) {
        int counter = urlHitCountMap.getOrDefault(username,0)+1;
        urlHitCountMap.put(username,counter);
        return new UrlHit(username,counter);
    }
}
