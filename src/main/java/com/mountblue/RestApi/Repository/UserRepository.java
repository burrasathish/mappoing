package com.mountblue.RestApi.Repository;

import com.mountblue.RestApi.Entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<UserData , Long>
{


}

