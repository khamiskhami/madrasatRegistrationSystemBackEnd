package com.kadhy.MadrasatRegistration.repositories;

import com.kadhy.MadrasatRegistration.modules.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepo extends JpaRepository<Status, Long> {

}
