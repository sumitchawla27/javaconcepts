public class ExceptionHandlingRelatedConcept {
	public int method(){
		try {
			System.out.println("try");
			return 1;
		}
		catch (Exception e){
			System.out.println("catch");
			return 2;
		}
		finally {
			System.out.println("finally");
			return 3;
		}
	}

	public int secondMethod(){
		// yes try can be used without catch and only with finally as well.
		try {
			return 1;
		}
		finally {
			return 3;
		}
	}

	public static void main(String[] args) {
		ExceptionHandlingRelatedConcept exceptionHandlingRelatedConcept = new ExceptionHandlingRelatedConcept();
		System.out.println(exceptionHandlingRelatedConcept.method());
		//output will be value returned by finally block, try block is also executed
		// but value returned by try block is over written by one returned by finally block
		System.out.println(exceptionHandlingRelatedConcept.secondMethod());
	}
}
