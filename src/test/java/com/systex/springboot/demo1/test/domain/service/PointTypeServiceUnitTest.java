package com.systex.springboot.demo1.test.domain.service;

import com.systex.springboot.demo1.domain.PointType;
import com.systex.springboot.demo1.domain.common.repository.PointTypeRepository;
import com.systex.springboot.demo1.domain.common.service.PointTypeService;
import com.systex.springboot.demo1.domain.common.service.PointTypeServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

public class PointTypeServiceUnitTest {
    private PointTypeRepository repository;
    private PointTypeService service;

    @BeforeEach
    void prepare(){
        System.out.println("!!!!!!prepare test");
        repository = mock(PointTypeRepository.class);
        when(repository.save(ArgumentMatchers.any(PointType.class))).thenReturn(UUID.randomUUID());
        service = new PointTypeServiceImpl(repository);
    }
    @Test
    void domainTest1(){
        System.out.println("test1");
        PointType type = new PointType("type1","desc1");
        UUID id = service.createPointType(type);
        //verify(repository).save((ArgumentMatchers.any(PointType.class)));
        System.out.println("id="+id);
        assertNotNull(id);
    }
    @Test
    void demainTest2(){
        System.out.println("test2");
        service.allTypes();
        verify(repository).getAll();
    }

}
