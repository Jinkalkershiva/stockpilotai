package com.jinkalker.stockpilotai.repository;

import com.jinkalker.stockpilotai.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
