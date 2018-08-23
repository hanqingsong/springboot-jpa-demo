package cn.song.service.impl;

import cn.song.SpringbootJpaDemoApplication;
import cn.song.repository.CustomerJpaRepository;
import cn.song.repository.CustomerRepository;
import cn.song.model.Customer;
import cn.song.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

/**
 * Created by hanqingsong on 18/8/23.
 *
 * @author hanqingsong
 * @date 18/8/23
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootJpaDemoApplication.class)
public class CustomerServiceImplTest {
    @Autowired
    CustomerService customerService;
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    CustomerJpaRepository customerJpaRepository;
    @Test
    public void findByLastName() throws Exception {
        // customerRepository.save(new Customer("Jack", "Bauer"));
        // customerRepository.save(new Customer("Chloe", "O'Brian"));
        // customerRepository.save(new Customer("Kim", "Bauer"));
        // customerRepository.save(new Customer("David", "Palmer"));
        // customerRepository.save(new Customer("Michelle", "Dessler"));

        Iterable<Customer> all = customerRepository.findAll();
        log.info("{}",all);
        List<Customer> byLastName = customerService.findByLastName("Bauer");
        log.info("{}",byLastName);
        Optional<Customer> byId = customerRepository.findById(1L);
        long count = customerRepository.count();
    }

    @Test
    public void jpaRepositoryTest(){
        Iterable<Customer> all = customerRepository.findAll();
        List<Customer> bauer = customerRepository.findBySql("Bauer");
        System.out.println();
    }
}