package org.faeterj.apicoruja.coruja.model.entity;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.faeterj.apicoruja.coruja.model.repository.AlunoRepository;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages={ "org.faeterj.apicoruja.coruja.model.entity" })
@EnableJpaRepositories(basePackages={ "org.faeterj.apicoruja.coruja.model.repository" })
@RunWith(SpringRunner.class)
@SpringBootTest
public class AlunoTest {

        @Autowired
        private AlunoRepository repository;

        @Before
        public void setUp ( ) throws Exception {

        }

        @Test
        public void findByNome ( ) {
                assertThat (true, is (true));
        }

}
