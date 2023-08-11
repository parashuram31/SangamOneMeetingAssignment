package com.SangamOne.meeting.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SangamOne.meeting.Entity.MeetingDetailes;

public interface MeetingRepository extends JpaRepository<MeetingDetailes, Integer> {

}
