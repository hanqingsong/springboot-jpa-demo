package cn.song.repository;

import cn.song.model.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by hanqingsong on 18/8/23.
 *
 * @author hanqingsong
 * @date 18/8/23
 */

@RepositoryRestResource(collectionResourceRel = "customer", path = "customer")
public interface Customer2Repository extends CrudRepository<Customer,Long>{

    List<Customer> findByLastName(String lastName);

    @Query(nativeQuery = true,value = "select * from customer where last_name=:lastName")
    List<Customer> findBySql(@Param("lastName") String lastName);
}
