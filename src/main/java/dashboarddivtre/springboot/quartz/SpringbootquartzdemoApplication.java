/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboarddivtre.springboot.quartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 *
 * @author sgh88
 */
@Import({ SchedulerConfig.class })
@SpringBootApplication
public class SpringbootquartzdemoApplication {
     public static void main(String[] args) {
        SpringApplication.run(SpringbootquartzdemoApplication.class, args);
    }
}
