package com.kadhy.MadrasatRegistration.repositories;

import com.kadhy.MadrasatRegistration.modules.MadrasaReg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MadrasaRegRepo extends JpaRepository<MadrasaReg, Long> {

}
