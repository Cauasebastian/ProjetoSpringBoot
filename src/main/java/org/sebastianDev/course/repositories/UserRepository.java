package org.sebastianDev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.sebastianDev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
