package com.vrinda.Food.App.Respository;

import com.vrinda.Food.App.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
