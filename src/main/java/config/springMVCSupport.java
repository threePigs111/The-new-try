package config;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

public class springMVCSupport extends WebMvcConfigurationSupport {
    //让MVC不接管html文件
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
        //registry.addResourceHandler("/pages/**","/pages/");
    }
}
