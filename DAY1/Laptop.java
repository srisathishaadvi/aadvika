package DAY1;

public class Laptop {
String brand;
String color;
int price;
Ram ram;
public Laptop (String brand,String color,int price,Ram ram) {
	this.brand = brand;
	this.color = color;
	this.price = price;
	this.ram = ram;
}
public String toString() {
	return "Brand="+" "+brand+", Color="+" "+color+", Price="+" "+price+","+ram;
}
}
