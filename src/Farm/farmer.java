package Farm;                            //�ӿ���ϰ

public class farmer {
	public String name;
	public void feed(animal hungry,String sth){
		System.out.println(this.name+"ι"+hungry.getName()+"��"+sth);
		hungry.eat(sth);
	}
	public void feed2(hunter hungry,food sth){
		System.out.println(this.name+"ι"+((animal) hungry).getName()+"��"+((animal) sth).getName());
		hungry.hunt(sth);
	}
	public static void main(String[] args) {
		farmer people1=new farmer();
		tiger tiger1=new tiger();
		tiger tiger2=new tiger();
		snake snake1=new snake();
		rabbit rabbit1=new rabbit();
		people1.name="���ӹ�";
		tiger1.setName("���ϻ�");
		tiger2.setName("С�ϻ�");
		rabbit1.setName("С����");
		snake1.setName("����");
		people1.feed(tiger1,"��");
		people1.feed2(snake1,rabbit1);
	}
}