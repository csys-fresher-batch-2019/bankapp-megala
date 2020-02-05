package branch;

public class Branch {
	private int id;
	public String name;
	public String city;
	public void setId(int id) throws IllegalAccessException {
		if(id<0) {
			throw new IllegalAccessException("invalid number");
		}
		this.id=id;
		}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Branch [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
}
