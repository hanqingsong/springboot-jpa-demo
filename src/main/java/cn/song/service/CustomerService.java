package cn.song.service;

import cn.song.model.Customer;

import java.util.List;

/**
 * Created by hanqingsong on 18/8/23.
 *
 * @author hanqingsong
 * @date 18/8/23
 */
public interface CustomerService {

    List<Customer> findByLastName(String lastName);
}
