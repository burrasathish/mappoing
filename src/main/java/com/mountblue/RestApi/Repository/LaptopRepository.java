package com.mountblue.RestApi.Repository;

import com.mountblue.RestApi.Entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<UserData, Long> {
}
