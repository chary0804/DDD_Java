package com.systex.springboot.demo1.infrastructure.configuration;

import com.systex.springboot.demo1.domain.common.repository.PointTypeRepository;
import com.systex.springboot.demo1.domain.common.service.PointTypeService;
import com.systex.springboot.demo1.domain.common.service.PointTypeServiceImpl;
import com.systex.springboot.demo1.infrastructure.respository.PointTypeMemRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    PointTypeService pointTypeService(PointTypeRepository repository){
        return new PointTypeServiceImpl(repository);
    }
    @Bean
    PointTypeRepository pointTypeRepository(){
        return new PointTypeMemRepository();
    }
}
