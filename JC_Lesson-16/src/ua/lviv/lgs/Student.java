package ua.lviv.lgs;

public class Student {

	public String name;
	public int age;
	private String lastName;
	private int course;
	private String proffesion;
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Student() {
		super();
	}

	public Student(String name, int age, String lastName, int course, String proffesion) {
		super();
		this.name = name;
		this.age = age;
		this.lastName = lastName;
		this.course = course;
		this.proffesion = proffesion;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public String getProffesion() {
		return proffesion;
	}

	public void setProffesion(String proffesion) {
		this.proffesion = proffesion;
	}
	
	public void changeUniversity(String name, String lastName) {
		System.out.println("Student " + name + " " + lastName + " transfered to another university");
	}
	
	public void changeCourse(String name, String lastName, int course) {
		System.out.println("Student " + name + " " + lastName + " transfered to the " + course + "th course");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", lastName=" + lastName + ", course=" + course
				+ ", proffesion=" + proffesion + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + course;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((proffesion == null) ? 0 : proffesion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (course != other.course)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (proffesion == null) {
			if (other.proffesion != null)
				return false;
		} else if (!proffesion.equals(other.proffesion))
			return false;
		return true;
	}

}
