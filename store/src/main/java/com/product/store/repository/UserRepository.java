package com.product.store.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.product.store.dao.UserDetails;

@Repository
public interface UserRepository extends CrudRepository<UserDetails,Long>{
	
	@Query("Select u from UserDetails u where u.username=?1 and u.confirmPassword=?2")
	public UserDetails validUser(String userName,String confirmPassword);

}
