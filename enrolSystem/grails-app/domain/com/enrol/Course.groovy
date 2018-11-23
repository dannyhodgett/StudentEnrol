package com.enrol

class Course {

String department
String title
String leader
String code
Date startDate
Date endDate
String description
int numberOfStudents
Double tuitionFees
String studyMode

    static constraints = {
	title blank: false, nullable: false
	department blank: false, nullable: false
	leader blank: false, nullable: false
	numberOfStudents nullable: false, blank: false, min: 20, max: 60
	startDate nullable: false, blank: false
	endDate nullable: false, blank: false
	studyMode nullable: false, blank: false, maxSize: 20
	description nullable: false, blank: false, maxSize: 5000, widget: 'textarea'
	tuitionFees nullable: false, blank: false, scale: 2

    }
}
