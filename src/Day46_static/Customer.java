package Day46_static;

public class Customer {

	
	
	
	
	
		public Customer(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
		
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}
		// TODO Auto-generated method stub
		private String name;
		private String email;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		

	}

}
