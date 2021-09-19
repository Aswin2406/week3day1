package week3day1;

public class Students {
	public void getstudentinfo(String name) {
		System.out.println("name of the student :"+ name);
	}
	public void getstudentinfo(short id) {
		System.out.println("id :"+ id);
		
	}
	public void getstudentinfo(String email , int rollnum) {
		System.out.println(" student email id and rollnum");
	}
	public void getstudentinfo(long number) {
		System.out.println("student phonrnumber");
		
	}
 public static void main(String[] args) {
	Students std = new Students();
	std.getstudentinfo("mr.x");
	std.getstudentinfo(2455);
	std.getstudentinfo("aswinak007@gmail.com", 24);
	std.getstudentinfo(956554656);
	
}
 
}
