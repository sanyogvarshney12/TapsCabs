package com.travel.tapscabs;

import com.travel.tapscabs.logger.TapsCabsApplicationLogger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TapsCabsApplicationMain {

    private static TapsCabsApplicationLogger LOG = new TapsCabsApplicationLogger();
    private static final String CLASSNAME = TapsCabsApplicationMain.class.getSimpleName();

    public static void main(String[] args) {
        if (LOG.isInfoEnabled()) {
            LOG.info(CLASSNAME, "main", "Starting TapsCabs Application");
        }
        SpringApplication.run(TapsCabsApplicationMain.class, args);
    }
}
