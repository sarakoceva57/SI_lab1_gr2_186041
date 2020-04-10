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

class facultyFeature {

List<Student> lista1=new List<Student>();
String imeFakultet;

public static void Prosek(List<Student>lista) {
		List<Student>tmp=null;
		int dolzhina=lista.length();
		float zbir=0,prosek;
		for(tmp=lista.getFirst();tmp!=null;tmp=tmp.succ) {
			zbir+=tmp.element;
		}
		prosek=zbir/dolzhina;

		System.out.println(prosek);
	

public static void BrishiSekojNti(List<Student>lista,int n) {
		List<Student>p=null;
		int brojac=1;
		while(p!=null)
		{	
		   if(p!=null && brojac==n)
	               {		
	                 lista.delete(p);	
			 brojac=0;
		       }
			p=p.pred;
			brojac++;
			
		}
}
