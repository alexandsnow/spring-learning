package com.gy.claus.config;

import com.gy.claus.Util.GyLogProcessor;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

@Configuration
public class EnableGyLog implements ImportBeanDefinitionRegistrar {

    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        BeanDefinitionBuilder logBeanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(GyLogProcessor.class);
        beanDefinitionRegistry.registerBeanDefinition("gyLogProcessor", logBeanDefinitionBuilder.getBeanDefinition());
    }
}
