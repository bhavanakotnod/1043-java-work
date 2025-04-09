package ScannerClass;

public class Student_Details {
	public void total(int math, int phy, int bio) {
		int total = 0;
		double avg = 0;
		total = math + phy + bio;
		System.out.println("total marks addition  " + total);
		avg = total / 3;
		System.out.println("average of total marks  " + avg);

	}

	public void grade(double avg) {
		int passing_marks = 50;
		char grade = 0;
		if (avg > passing_marks) { 
			if (avg >=  90) 
				grade = 'A';
				else if(avg >= 80)
					grade = 'B';
				else if(avg >= 80)
			       grade = 'C';
				else if(avg >= 70)
					grade = 'D';
			System.out.println("you passed the exam and your grade is " + grade);
				
			
		}
		else {
			grade = 'F';
			System.out.println("you failed the exam and your grade is "+grade);
		}
	}

}
