package org.rishmi5h.repository;


import org.rishmi5h.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepository extends JpaRepository<Users, Long> {
}
