import java.util.Vector;


public class Master {
	
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		Vector vector = new Vector<>();
		for (int i = 0; i < 25; i++) {
			byte[] b = null;
			b = new byte[1024*1024];
			vector.add(b);
		}
		System.out.println(System.currentTimeMillis());
		System.out.println("kkkkkk");
		System.out.println("hello");

	}
}
