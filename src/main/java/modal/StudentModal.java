package modal;

public class StudentModal {
	
	int student_id;
	String student_fname,student_lname,student_dob,student_gender,student_address,student_parentcontect,student_information,student_enrollmentdob,student_grade;

	public StudentModal() {
		
	}
	
	public StudentModal(int student_id, String student_fname, String student_lname, String student_dob,
			String student_gender, String student_address, String student_parentcontect, String student_information,
			String student_enrollmentdob, String student_grade) {
		super();
		this.student_id = student_id;
		this.student_fname = student_fname;
		this.student_lname = student_lname;
		this.student_dob = student_dob;
		this.student_gender = student_gender;
		this.student_address = student_address;
		this.student_parentcontect = student_parentcontect;
		this.student_information = student_information;
		this.student_enrollmentdob = student_enrollmentdob;
		this.student_grade = student_grade;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_fname() {
		return student_fname;
	}
	public void setStudent_fname(String student_fname) {
		this.student_fname = student_fname;
	}
	public String getStudent_lname() {
		return student_lname;
	}
	public void setStudent_lname(String student_lname) {
		this.student_lname = student_lname;
	}
	public String getStudent_dob() {
		return student_dob;
	}
	public void setStudent_dob(String student_dob) {
		this.student_dob = student_dob;
	}
	public String getStudent_gender() {
		return student_gender;
	}
	public void setStudent_gender(String student_gender) {
		this.student_gender = student_gender;
	}
	public String getStudent_address() {
		return student_address;
	}
	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}
	public String getStudent_parentcontect() {
		return student_parentcontect;
	}
	public void setStudent_parentcontect(String student_parentcontect) {
		this.student_parentcontect = student_parentcontect;
	}
	public String getStudent_information() {
		return student_information;
	}
	public void setStudent_information(String student_information) {
		this.student_information = student_information;
	}
	public String getStudent_enrollmentdob() {
		return student_enrollmentdob;
	}
	public void setStudent_enrollmentdob(String student_enrollmentdob) {
		this.student_enrollmentdob = student_enrollmentdob;
	}
	public String getStudent_grade() {
		return student_grade;
	}
	public void setStudent_grade(String student_grade) {
		this.student_grade = student_grade;
	}

	
}
