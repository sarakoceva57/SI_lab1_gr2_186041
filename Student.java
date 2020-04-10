class Student {
	String index;
	String firstName;
	String lastName;
	int[] grades;

	//TODO constructor
	
	public Student(String index, String firstName, String lastName, int[] grades) {
		super();
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades = grades;
	}

	//TODO seters & getters

	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int[] getGrades() {
		return grades;
	}
	public void setGrades(int[] grades) {
		this.grades = grades;
	}
	public double getAverage(int[]grades ) {
		//TODO
		int suma=0;
		for(int i=0; i<grades.length;i++){
			suma+=grades[i];
		}
		return (double) suma/grades.length;
	}
	
	int ECTSCredits(int[]grades ) {
		//TODO
		int vkupno=grades.length;
		int temp=0;
		for(int i=0;i<=vkupno;i++) {
			temp=vkupno*6;
			
		}
		return temp;
		
		
	}
}
