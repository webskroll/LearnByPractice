package com.learnbypractice.usage.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 *
 * This configuration class is added to show how beans can be created with annotation @ComponentScan.
 *
 * Notice @ComponentScan can only be used in conjugation with @Configuration.
 *
 * This configuration class scans the given package ,
 * reads all classes annotated with Service, Controller, Repository, Component annotations
 * and instantiates Beans.
 *
 * ComponentScan has attribute useDefaultFilters which is true by default.
 * It automatically detects classes annotated with  Service, Controller, Repository, Component annotations
 *
 *
 * Check {@link - InitializeComponentBeansWithConfigurationAndComponentScanTest} in tests  and
 * {@link  com.learnbypractice.usage.springframework.InitializeComponentBeansWithConfigurationAndComponentScanApplication}
 * in main spring framework application
 *
 */
@Configuration
@ComponentScan(
        basePackages = "com.learnbypractice.app.simple"
)
public class InitializeAllBeansWithConfigurationAndComponentScan {

}
