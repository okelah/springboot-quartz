/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboarddivtre.springboot.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author sgh88
 */
public class SimpleJob implements Job{

    @Autowired
    private SimpleService service;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) {
        service.processData();
    }
    
}
