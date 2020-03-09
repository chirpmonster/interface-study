package Farm;                            //Ω”ø⁄¡∑œ∞

public class farmer {
	public String name;
	public void feed(animal hungry,String sth){
		System.out.println(this.name+"Œπ"+hungry.getName()+"≥‘"+sth);
		hungry.eat(sth);
	}
	public void feed2(hunter hungry,food sth){
		System.out.println(this.name+"Œπ"+((animal) hungry).getName()+"≥‘"+((animal) sth).getName());
		hungry.hunt(sth);
	}
	public static void main(String[] args) {
		farmer people1=new farmer();
		tiger tiger1=new tiger();
		tiger tiger2=new tiger();
		snake snake1=new snake();
		rabbit rabbit1=new rabbit();
		people1.name="‡”‡”π÷";
		tiger1.setName("¥Û¿œª¢");
		tiger2.setName("–°¿œª¢");
		rabbit1.setName("–°Õ√Õ√");
		snake1.setName("¥Û…ﬂ");
		people1.feed(tiger1,"»‚");
		people1.feed2(snake1,rabbit1);
	}
}