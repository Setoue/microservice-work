package com.setoue.hrworker.repositories;

import com.setoue.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkRepository extends JpaRepository<Worker, Long> {

}
