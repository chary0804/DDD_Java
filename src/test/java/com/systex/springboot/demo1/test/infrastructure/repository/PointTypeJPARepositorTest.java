package com.systex.springboot.demo1.test.infrastructure.repository;

import com.systex.springboot.demo1.domain.PointType;
import com.systex.springboot.demo1.infrastructure.repository.PointTypeJPARepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class PointTypeJPARepositorTest {
    @Autowired
    private PointTypeJPARepository repository;

    @Test
    void repositoryShouldNotBeNull() {
        assertNotNull(repository);
    }
    @Test
    void savePointTypeAndCheck(){
        PointType t=repository.save(new PointType("個人課","50分鐘"));
        assertThat(repository.findById(t.getTypeId())).isNotNull();
    }

}
