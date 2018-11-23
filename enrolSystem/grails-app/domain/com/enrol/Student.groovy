package com.enrol

class Student {

String name
String studentID
Date dob
Boolean isFundingAvailable
String email
String username
String password
String course

    static constraints = {

	name blank: false, nullable: false
	studentID blank: false, nullable: false
	dob blank: false, nullable: false
	email nullable: false, blank: false, email: true
	username nullable: false, blank: false, unique: true
	password nullable: false, blank: false
	isFundingAvailable nullable: false, blank: false
	course nullable: false, blank: false
	
    }
}
