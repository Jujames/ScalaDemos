
public class ExceptionDemo {
    public static void main(String[] args) {
		ThrowsExceptionClass tec = new ThrowsExceptionClass();
		try {
		    tec.doThrow();
		}catch(Exception e) {
			System.out.println("Caught it!");
		}
	}

}
