package Farm;

public class tiger extends animal implements hunter{
	private String name;
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public void eat(String sth){
		System.out.println(this.getName()+"Ётак"+sth);
	}
	public void hunt(food food) {
		System.out.println(this.getName()+"Ётак"+((animal) food).getName());
	}
}
