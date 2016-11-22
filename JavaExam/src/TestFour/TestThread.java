package TestFour;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class TestThread extends Thread {
	public void run() {
		Class<?> demo = null;
		demo = test9.class;
		Method method = null;
		try {
			method = demo.getMethod("pr");
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			method.invoke(demo.newInstance());
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void main(String[] args) {
		Thread tThread = new TestThread();
		tThread.start();
		
	}
	
}