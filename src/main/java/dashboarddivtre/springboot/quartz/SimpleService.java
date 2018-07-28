/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboarddivtre.springboot.quartz;

import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 *
 * @author sgh88
 */
@Service
public class SimpleService {
    private static final Logger LOG = LoggerFactory.getLogger(SimpleService.class);

    public void processData() {
        LOG.info("Hello World!" + new Date());
    }
}
