package library;

public class Members {
	private int id;
	private String username;
	Members(int id,String username){
		this.id=id;
		this.username=username;
	}
	public void displaymeminfo() {
		System.out.println("Username is: "+username+"id is: "+id);
	}

}
