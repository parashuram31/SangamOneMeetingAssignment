package com.SangamOne.meeting.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SangamOne.meeting.Entity.UserDetails;

public interface UserRepository extends JpaRepository<UserDetails, Integer> {

}
