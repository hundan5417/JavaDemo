package ylee;

class Teacher {
	String name;
	Integer age;
	Boolean isMan;
	Byte sex;

	void teacher(String course) { // ����1
		System.out.println("��ʦ" + name + "���ڵĿγ���1��" + course);
	}

	public String toString() {
		String tmp = "Teacher name:" + this.name + "age:" + this.age + "isMan" + this.isMan;
		return tmp;
	}
}

public class Student {
	public static void main(String[] args) {
		Teacher teacher = new Teacher(); // ���췽��
		System.out.println(teacher.toString());
		teacher.name = "laoshi";
		teacher.age = 30;
		teacher.isMan = false;
		teacher.sex = 0;
		teacher.teacher("Java"); // ������1��ֵ
		System.out.println(teacher.toString());
	}
}
