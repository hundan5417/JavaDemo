package collection;

import java.io.PrintStream;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<exm> lList = new LinkedList<exm>();
		PrintStream out = System.out;
		lList.add(new exm("����", 1999));
		lList.add(new exm("���", 1997));
		lList.add(new exm("���", 1911));
		lList.add(new exm("��½", 1949));
		lList.add(new exm("����", 1921));
        out.println("lList.size() : " + lList.size());
        out.println("lList : " + lList);
//        out.println("��˳���ӡlist�����Ԫ��: ");
//        out.println(lList.pop());
//        out.println(lList.pop());
//        out.println(lList.pop());
//        out.println(lList.pop());
//        out.println(lList.pop());//��˳�򵯳�list�����Ԫ��
        exm exm1=new exm("�Ѿ�", 1911);
        out.println("lList.offer(exm1) : " + lList);
        lList.offer(exm1);
        out.println("lList.offer(exm1) ���һ��Ԫ�� exm1: " + lList);
        
       
 
	}

}
