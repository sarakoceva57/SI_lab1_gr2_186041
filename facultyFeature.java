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