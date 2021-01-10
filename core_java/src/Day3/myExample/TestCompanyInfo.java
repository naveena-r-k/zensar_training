package Day3.myExample;

public class TestCompanyInfo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CompanyInfo fa = new CompanyInfo(1251,"Alphabhet");
		CompanyInfo fa2 = new CompanyInfo(2156,"Google");
		CompanyInfo fa3 = new CompanyInfo(2189,"Microsoft");

		System.out.println(fa);
		System.out.println(fa2);
		System.out.println(fa3);				
		
		CompanyInfo[] fa4= {fa, fa2, fa3};
		
		TestCompanyInfo fb = new TestCompanyInfo();
		fb.findData(fa4);
	}

	public void findData(CompanyInfo[] fa) {
		
		int searchId=2189;
		for (CompanyInfo findExampleA : fa) {
			int id=findExampleA.getId();
			if(searchId==id) {
				System.out.println("Found");
				System.out.println("Display info:");
				System.out.println("id:"+id);
				System.out.println("Name:"+findExampleA.getName());
				break;
			} 
		}

	}
}
