package DAY1;

public class UseLaptop {
public static void main(String[] args) {
	Ram r = new Ram("Asus","8gb",1200);
	Ram r1 = new Ram("hp","16gb",2000);
	Ram r2 = new Ram("Redmi","24gb",3000);
	Laptop lap = new Laptop("Asus","Silver",35000,r);
	Laptop lap1 = new Laptop("Hp","Black",25000,r1);
	Laptop lap2 = new Laptop("Redmi","Golden",45000,r2);
	
	Laptop[] laps = {lap,lap1,lap2};
	for(int i=0;i<laps.length;i++) {
		if(laps[i].price>30000) {
			System.out.println(laps[i]);
		}
	}
	
}
}
