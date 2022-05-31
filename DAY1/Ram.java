package DAY1;

public class Ram {
String brand;
String gb;
int price;
public Ram (String brand,String gb,int price) {
	this.brand = brand;
	this.gb = gb;
	this.price = price;
	
}
public String toString() {
	return "Brand="+" "+brand+", GB="+" "+gb+", Price="+" "+price;
}
}
