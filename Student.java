class Student{
	public void main(int i) {
		System.out.println("int arg");
	}
	public void main(float f) {
		System.out.println("float arg");
	}
	public void main() {
		System.out.println("No arg");
	}
	public static void main(String[] args) {
		Student S = new Student();
		S.main();
		S.main(10);
		S.main(10.23f);
		
		
	}
}