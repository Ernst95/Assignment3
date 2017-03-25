package com.Assignment4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Ernst on 2017/03/25.
 */

@Configuration
public class AppConfig {
    @Bean(name = "loanStud")
    public LoanInterface getService()
    {
        return new StudentServiceImpl();
    }

    @Bean(name = "loanNonStud")
    public LoanInterface getService2()
    {
        return new NonStudentServiceImpl();
    }
}
