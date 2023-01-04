 class Quiz {
	private int id;
	private Student student;
	private int totalScore;
	private int maxScore;

	public Quiz(int id, Student student, int totalScore, int maxScore) {
		this.id = id;
		this.student = student;
		this.totalScore = totalScore;
		this.maxScore = maxScore;
	}

	public double grade() {
		return (double) ((this.totalScore*100) / this.maxScore);
	}

	public static void main(String[] args) {
		// create a new student
		Student student = new Student("Jgot");
        System.out.println(student.getName());


		int totalScore = 0;
		int maxScore = 0;

		// create a new quiz for the student
		Quiz quiz1 = new Quiz(1, student, 7, 10);
		totalScore += quiz1.totalScore;
		maxScore += quiz1.maxScore;
        System.out.println("Quiz 1 Score: "+quiz1.totalScore);

		// create another quiz for the student
		Quiz quiz2 = new Quiz(2, student, 9, 10);
		totalScore += quiz2.totalScore;
		maxScore += quiz2.maxScore;
		System.out.println("Quiz 2 Score: "+quiz2.totalScore);

		// print the student's total grade on all quizzes
		double totalGrade = ((double) totalScore / maxScore)*100;
		System.out.println("\nTotal grade: " + totalGrade);
	}
}
