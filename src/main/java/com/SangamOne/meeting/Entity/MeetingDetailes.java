package com.SangamOne.meeting.Entity;

import org.hibernate.sql.Insert;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="meeting")
public class MeetingDetailes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="meeting_id")
	private int meetingId;
	
	@Column(name="user1")
	private int user1;
	
	@Column(name="user2")
	private int user2;
	
	@Column(name="meeting_date")
	private String meetingDate;
	
	@Column(name="meeting_time")
	private String meetingTime;
	
	@ManyToOne
	@JoinColumn (name="user1", insertable = false, updatable = false)
	private MeetingDetailes meetingDetailes;
	
	@ManyToOne
	@JoinColumn(name="user2", insertable = false, updatable = false )
	private MeetingDetailes meetingDetailes2;

	public int getMeetingId() {
		return meetingId;
	}

	public void setMeetingId(int meetingId) {
		this.meetingId = meetingId;
	}

	public int getUser1() {
		return user1;
	}

	public void setUser1(int user1) {
		this.user1 = user1;
	}

	public int getUser2() {
		return user2;
	}

	public void setUser2(int user2) {
		this.user2 = user2;
	}

	public String getMeetingDate() {
		return meetingDate;
	}

	public void setMeetingDate(String meetingDate) {
		this.meetingDate = meetingDate;
	}

	public String getMeetingTime() {
		return meetingTime;
	}

	public void setMeetingTime(String meetingTime) {
		this.meetingTime = meetingTime;
	}

	public MeetingDetailes getMeetingDetailes() {
		return meetingDetailes;
	}

	public void setMeetingDetailes(MeetingDetailes meetingDetailes) {
		this.meetingDetailes = meetingDetailes;
	}

	public MeetingDetailes getMeetingDetailes2() {
		return meetingDetailes2;
	}

	public void setMeetingDetailes2(MeetingDetailes meetingDetailes2) {
		this.meetingDetailes2 = meetingDetailes2;
	}

	
	

}
