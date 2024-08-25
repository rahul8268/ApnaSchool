package modal;

public class TeacherModal {
	
	int id;
	String fName,lName,dob,gender,address,contectNumber,hireDate,department,subjectTaught,classSedule,attendecRecode;
	
	public TeacherModal() {
		
	}
	public TeacherModal(int id, String fName, String lName, String dob, String gender, String address,
			String contectNumber, String hireDate, String department, String subjectTaught, String classSedule,
			String attendecRecode) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.contectNumber = contectNumber;
		this.hireDate = hireDate;
		this.department = department;
		this.subjectTaught = subjectTaught;
		this.classSedule = classSedule;
		this.attendecRecode = attendecRecode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return fName;
	}
	public void setFirstName(String firstName) {
		this.fName = firstName;
	}
	public String getLastName() {
		return lName;
	}
	public void setLastName(String lastName) {
		this.lName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContectNumber() {
		return contectNumber;
	}
	public void setContectNumber(String contectNumber) {
		this.contectNumber = contectNumber;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getSubjectTaught() {
		return subjectTaught;
	}
	public void setSubjectTaught(String subjectTaught) {
		this.subjectTaught = subjectTaught;
	}
	public String getClassSedule() {
		return classSedule;
	}
	public void setClassSedule(String classSedule) {
		this.classSedule = classSedule;
	}
	public String getAttendecRecode() {
		return attendecRecode;
	}
	public void setAttendecRecode(String attendecRecode) {
		this.attendecRecode = attendecRecode;
	}
	
	

}
