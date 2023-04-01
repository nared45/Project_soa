package com.example.config;

import java.util.Date;
import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;

@Configuration
public class TimeZoneConfig {
	@PostConstruct
    public void init() {

        TimeZone.setDefault(TimeZone.getTimeZone("GMT"));

        System.out.println("Date in UTC: " + new Date().toString());
    }
	
}
