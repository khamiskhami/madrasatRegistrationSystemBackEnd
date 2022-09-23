package com.kadhy.MadrasatRegistration.repositories;

import com.kadhy.MadrasatRegistration.modules.UserCredintial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCredintialRepo extends JpaRepository<UserCredintial, Long> {

}
