package com.mountblue.RestApi.Repository;

import com.mountblue.RestApi.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    List<Users> findByName(String name);


}