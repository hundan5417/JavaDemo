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
		System.out.println("现在的时间是1： " + System.currentTimeMillis());
		Thread.sleep(2000);
		System.out.println("现在的时间是2： " + System.currentTimeMillis());
		System.out.println("倒计时: 10");
		Thread.sleep(1000);
		System.out.println("倒计时: 9");
		Thread.sleep(1000);
		System.out.println("倒计时: 8");
		Thread.sleep(1000);
		System.out.println("倒计时: 7");
		Thread.sleep(1000);
		System.out.println("倒计时: 6");
		Thread.sleep(1000);
		System.out.println("倒计时: 5");
		Thread.sleep(1000);
		System.out.println("倒计时: 4");
		Thread.sleep(1000);
		System.out.println("倒计时: 3");
		Thread.sleep(1000);
		System.out.println("倒计时: 2");
		Thread.sleep(1000);
		System.out.println("倒计时: 1");
		Thread.sleep(10000);
		System.out.println("等急了吗？");
		Thread.sleep(3000);
		System.out.println("别走再等等");
		Thread.sleep(10000);
		System.out.println("嗨，こんにちは");

	}

}
