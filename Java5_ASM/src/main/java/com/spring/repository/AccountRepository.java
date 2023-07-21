package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spring.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{
	@Query("Select e from Account e where e.ten = :ten and e.matKhau = :matkhau")
	Account findByTenAndMatKhau(@Param("ten") String ten,@Param("matkhau") String matKhau);
	@Query("Select e from Account e where e.ten = :ten")
	Account getByUsername(@Param("ten") String ten);
}
