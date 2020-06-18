package com.river.dto;

import org.springframework.data.jpa.repository.JpaRepository;
import com.river.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
