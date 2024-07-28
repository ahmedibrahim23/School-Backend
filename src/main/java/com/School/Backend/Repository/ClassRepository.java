package com.School.Backend.Repository;

import com.School.Backend.modal.StdClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<StdClass,Long> {
}
