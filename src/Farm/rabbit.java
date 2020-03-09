package Farm;

public class rabbit extends animal implements food{
	private String name;
	public String getName(){
		return this.name;
	}
	public void eat(String sth){
		System.out.println("мцвсЁтак"+sth);
	}
	public void setName(String name){
		this.name=name;
	}
}
