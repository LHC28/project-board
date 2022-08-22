package com.fastcampus.projectboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan // configurationProperty를 만들면 직접 스캔해야 하는데 이를 위해.
@SpringBootApplication
public class FastCampusProjectBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastCampusProjectBoardApplication.class, args);
    }

}
