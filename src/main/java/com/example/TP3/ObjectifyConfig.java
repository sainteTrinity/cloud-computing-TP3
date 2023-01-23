package com.example.TP3;

import com.example.TP3.model.Employe;
import com.googlecode.objectify.ObjectifyFilter;
import com.googlecode.objectify.ObjectifyService;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

public class ObjectifyConfig {
    @Bean
    public FilterRegistrationBean<ObjectifyFilter> objectifyFilterRegistration() {
        final FilterRegistrationBean<ObjectifyFilter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new ObjectifyFilter());
        registration.addUrlPatterns("/*");
        registration.setOrder(1);
        return registration;
    }

    @Bean
    public ServletListenerRegistrationBean<ObjectifyListener> listenerRegistrationBean() {
        ServletListenerRegistrationBean<ObjectifyListener> bean =
                new ServletListenerRegistrationBean<>();
        bean.setListener(new ObjectifyListener());
        return bean;
    }

    @WebListener
    public static class ObjectifyListener implements ServletContextListener {

        @Override
        public void contextInitialized(ServletContextEvent sce) {

            ObjectifyService.init();

            ObjectifyService.register(Employe.class);
        }

        @Override
        public void contextDestroyed(ServletContextEvent sce) {
        }
    }
}
