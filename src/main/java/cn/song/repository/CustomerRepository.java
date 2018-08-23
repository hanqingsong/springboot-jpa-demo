package cn.song.repository;

import cn.song.model.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by hanqingsong on 18/8/23.
 *
 * @author hanqingsong
 * @date 18/8/23
 */
public interface CustomerRepository extends CrudRepository<Customer,Long>{
    List<Customer> findByLastName(String lastName);

    @Query(nativeQuery = true,value = "select * from customer where last_name=:lastName")
    List<Customer> findBySql(@Param("lastName") String lastName);
}
