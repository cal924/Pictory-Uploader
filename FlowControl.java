package session2;

public class FlowControl {

	public static void main(String[] args){
		System.out.println("Hello World");
		
		int input = 1;
		
		if (input < 0){
			input = -input;
		}
		
		System.out.println("The absolute value is " + input);
		
		
		int x = 1;
		int y = 5;
		if (x > y){
			System.out.println("x is greater");
		}else{
			System.out.println("y is greater");
		}
		
		double score = 90.5;
		char grade = ' ';
		if (score >= 90){
			grade = 'A';
		}else if (score >= 75){
			grade = 'B';
		}else if (score >= 50){
			grade = 'C';
		}else if (score >= 40){
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		switch (grade){
			case 'A': System.out.println("The score should be 90 - 100");break;
			case 'B': System.out.println("The score should be 75 - 89");break;
			case 'C': System.out.println("The score should be 50 - 74");break;
			case 'D': System.out.println("The score should be 40 - 49");break;
			case 'F': System.out.println("The score should be below 40");break;
			default: System.out.println("The grade cannot be recognized");break;
		}
		
		System.out.println("Your grade is " + grade);
		
		int max = (x > y) ? x : y;
		
		grade = (score >= 90) ? 'A'
					:((score >=75) ? 'B'
						:((score >= 50) ? 'C'
							:((score >= 40) ? 'D'
								: 'F')));
		
		
		boolean boolean1 = true, boolean2 = false, boolean3 = true, boolean4 = false;
		
		if (boolean1){
			if (boolean2){
				//Boolean 1 and 2 are true
			}else{
				//Boolean 1 is true, Boolean 2 is false
			}
			if (boolean3){
				//Boolean 1 and 3 are true
			}
		}else{
			if (boolean4){
				//Boolean 1 is false, Boolean 4 is true
			}
		}
		
		int factorial = 1;
		int number = 4;
		
		while (number > 0){
			factorial *= number;	//factorial = factorial * number
			number--;				//number = number - 1;
		}
		
		System.out.println("The factorial result of 4 is " + factorial);
		
		
		
		
		
		int row = 1;
		while (row < 10){
			int col = 1;
			while (col < 10){
				System.out.print(String.format("%02d", row * col) + " ");
				col++;
			}
			System.out.println(" ");
			row++;
		}
		
		int byteMax = 127;
		int base = 5;
		int power = 6;
		int result = 1;
		
		while (power > 0){
			if ((result * base) > byteMax){
				break;
			}
			result *= base;
			power--;
		}
		byte result2 = (byte) result;
		
		System.out.println("5 to the power 6 = " + result);
		
		
		String[] students = {"Peter", "Paul", "Mary"};
		for (int i = 0 ; i < students.length ; i++){
			System.out.println("Student No." + (i+1) + " is called " + students[i]);
		}
		
		System.out.println('\n');
		System.out.println('\n');
		System.out.println('\n');
		System.out.println('\n');
		
		int i = 0;
		while (i < students.length){
			System.out.println("Student No." + (i+1) + " is called " + students[i]);
			i++;
		}
		
		for(int r = 1; r < 10 ; r++){
			for(int c = 1 ; c < 10 ; c++){
				System.out.print(String.format("%02d", r * c) + " ");
			}
			System.out.println(" ");
			row++;
		}
		
		LeaveApplication[] la = new LeaveApplication[10];
		
		int l = 0;
		while (l < la.length){
			if (la[l].isOverApplication()){
				l++;
				continue;
			}
			la[l].submitApplication();
			l++;
		}
	}
	
	
	public class LeaveApplication{
		public boolean isOverApplication(){
			return false;
		}
		
		public void submitApplication(){
			
		}
	}
}
