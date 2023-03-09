package C_NonPrimitiveDataType.C_Class.StudentGrades;

public class Result {
	
	public  String resultCalculator(Student student) {
		String grade="";
		double totalMarks=0;
		if(student.getMarks1()<40  ||student.getMarks2()<40 ||student.getMarks3()<40 ) {
			grade="Fail";
		}else {
			totalMarks=student.getMarks1()+student.getMarks2()+student.getMarks3();
			double percentage=(totalMarks*100)/300;
			if(percentage>=70) {
				grade="A";
			}else if(percentage>=55 && percentage<70) {
				grade="B";
			}else if(percentage>=40 && percentage<55){
				grade="C";
			}
		}
		return grade;
	}
}
