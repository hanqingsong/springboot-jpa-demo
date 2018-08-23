package cn.song.repository;

import cn.song.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by hanqingsong on 18/8/23.
 *
 * @author hanqingsong
 * @date 18/8/23
 */
public interface CustomerJpaRepository extends JpaRepository<Customer,Long> {
}
