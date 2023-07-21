package com.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spring.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>{

	@Query("Select e from Cart e where e.username.ten = :user")
	List<Cart> giohang(@Param("user") String username);
	@Query("Select e from Cart e where e.username.ten = :user and product.id = :id")
	Cart getByID(@Param("user") String username,@Param("id") Integer id);
	@Query("Delete from Cart e where e.username.ten = :user")
	void deleteCartbyUsername(@Param("user") String username);
	
}

