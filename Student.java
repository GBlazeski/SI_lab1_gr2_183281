class Student {
	String index;
	String firstName;
	String lastName;
	int grades[100];
	//TODO constructor
	public Student()
	{
		index = "";
		firstName = "";
		lastName = "";
		grades = new int[]{0};
	}
	//TODO seters & getters
	public String getIndex(){
		return index;
	}

	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public grades[] getGrades()
	{
		return grades[];
	}
	public void setFirstName(String newFirstName)
	{
		this.firstName = newFirstName;
	}
	public void setIndex(String newIndex)
	{
		this.index= newIndex;
	}
	public void setLasttName(String newLastName)
	{
		this.lastName = newLirstName;
	}
	public void setGrades(grades[] grades )
	{
		this.grades = grades;
	}
	public double getAverage() {
		double avg = 0.0;
		int sum = 0;

		return avg;

	}

	public int ECTSCredits() {
		double ects = 0.0;
		return ects;
		}
}
