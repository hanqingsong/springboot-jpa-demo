package cn.song.service.impl;

import cn.song.repository.CustomerRepository;
import cn.song.model.Customer;
import cn.song.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hanqingsong on 18/8/23.
 *
 * @author hanqingsong
 * @date 18/8/23
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findByLastName(String lastName) {
        List<Customer> customerList = customerRepository.findByLastName(lastName);
        return customerList;
    }


}
