package com.secondmonth.bookable.modules.users.repository;

import com.secondmonth.bookable.modules.users.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

}
