package collection;

import java.io.PrintStream;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<exm> lList = new LinkedList<exm>();
		PrintStream out = System.out;
		lList.add(new exm("澳门", 1999));
		lList.add(new exm("香港", 1997));
		lList.add(new exm("民国", 1911));
		lList.add(new exm("大陆", 1949));
		lList.add(new exm("兔子", 1921));
        out.println("lList.size() : " + lList.size());
        out.println("lList : " + lList);
//        out.println("按顺序打印list里面的元素: ");
//        out.println(lList.pop());
//        out.println(lList.pop());
//        out.println(lList.pop());
//        out.println(lList.pop());
//        out.println(lList.pop());//按顺序弹出list里面的元素
        exm exm1=new exm("友军", 1911);
        out.println("lList.offer(exm1) : " + lList);
        lList.offer(exm1);
        out.println("lList.offer(exm1) 添加一个元素 exm1: " + lList);
        
       
 
	}

}
