package ThreadDemo;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {

		Thread thread = Thread.currentThread();
		System.out.println("thread.getName()" + thread.getName());
		System.out.println("thread.getId()" + thread.getId());
		System.out.println("thread.getPriority()" + thread.getPriority());
		System.out.println("thread.getClass()" + thread.getClass());
		System.out.println("thread.hashCode() " + thread.hashCode());
		System.out.println("thread.isAlive()" + thread.isAlive());
		System.out.println("thread.isDaemon() " + thread.isDaemon());
		System.out.println("thread.isInterrupted()" + thread.isInterrupted());
		System.out.println("thread.MAX_PRIORITY" + Thread.MAX_PRIORITY);
		System.out.println("thread.MIN_PRIORITY" + Thread.MIN_PRIORITY);
		System.out.println("thread.NORM_PRIORITY" + Thread.NORM_PRIORITY);
		System.out.println("���ڵ�ʱ����1�� " + System.currentTimeMillis());
		Thread.sleep(2000);
		System.out.println("���ڵ�ʱ����2�� " + System.currentTimeMillis());
		System.out.println("����ʱ: 10");
		Thread.sleep(1000);
		System.out.println("����ʱ: 9");
		Thread.sleep(1000);
		System.out.println("����ʱ: 8");
		Thread.sleep(1000);
		System.out.println("����ʱ: 7");
		Thread.sleep(1000);
		System.out.println("����ʱ: 6");
		Thread.sleep(1000);
		System.out.println("����ʱ: 5");
		Thread.sleep(1000);
		System.out.println("����ʱ: 4");
		Thread.sleep(1000);
		System.out.println("����ʱ: 3");
		Thread.sleep(1000);
		System.out.println("����ʱ: 2");
		Thread.sleep(1000);
		System.out.println("����ʱ: 1");
		Thread.sleep(10000);
		System.out.println("�ȼ�����");
		Thread.sleep(3000);
		System.out.println("�����ٵȵ�");
		Thread.sleep(10000);
		System.out.println("�ˣ�����ˤ���");

	}

}
