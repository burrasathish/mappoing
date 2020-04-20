package com.mountblue.RestApi.Repository;


import com.mountblue.RestApi.Entity.UsersContact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersContactRepository extends JpaRepository<UsersContact, Integer> {
}