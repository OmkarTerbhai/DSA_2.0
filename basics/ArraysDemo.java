
public class ArraysDemo {
	
	public static void main(String[] args) {
		String[] sArr = {"Demo", "Hello", "Fun", "Gun"};
		
		for(String s : sArr) {
			System.out.println(s);
		}
		
		System.out.println();
		
		for(int i = sArr.length - 1; i != 0; i--) {
			System.out.println(sArr[i]);
		}
	}
}

