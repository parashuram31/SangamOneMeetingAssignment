package com.SangamOne.meeting.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SangamOne.meeting.Entity.MeetingDetailes;
import com.SangamOne.meeting.Repository.MeetingRepository;

@RestController
@RequestMapping(value="meeting")
public class MeetingController {

	@Autowired
	MeetingRepository meetingRepository;
	
	@PostMapping("/addMeeting")
	public String addMeeting(@RequestBody MeetingDetailes meetingDetailes ) {
		meetingRepository.save(meetingDetailes);
		return "Inserted";
	}
	
	@GetMapping("/viewMeeting")
	public List<MeetingDetailes>getAllMeeting(){
		return meetingRepository.findAll();
	}
}
