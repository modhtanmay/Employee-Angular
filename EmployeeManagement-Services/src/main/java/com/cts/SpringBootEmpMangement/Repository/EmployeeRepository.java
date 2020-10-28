package com.cts.SpringBootEmpMangement.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.SpringBootEmpMangement.Model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
