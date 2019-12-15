package com.techtibet.restapi.DummyApi.repo;

import com.techtibet.restapi.DummyApi.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
}
