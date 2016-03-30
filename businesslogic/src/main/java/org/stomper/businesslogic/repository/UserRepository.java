package org.stomper.businesslogic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.stomper.businesslogic.entity.User;

import java.util.List;

/**
 * Created by i848785 on 3/29/16.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public List<User> findByUser(String user);
}
