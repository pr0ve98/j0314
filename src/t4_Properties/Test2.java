package t4_Properties;

class MyThread extends Thread {
	@Override
	public void run() {
		try {Thread.sleep(400);} catch (InterruptedException e) {}
		System.out.println(getName() + "우선순위: "+getPriority());
		System.out.println();
	}
}

// 스레드에 우선 순위 지정: getPriority(), setPriority()
public class Test2 {
	public static void main(String[] args) {
		// 스레드 기본순위
		for(int i=0; i<3; i++) {
			System.out.println("메인스레드 "+i+"번째입니다.");
			Thread thread = new MyThread();
			thread.start();
		}
		
		// 스레드 우선 순위 지정
		for(int i=0; i<10; i++) {
			Thread thread = new MyThread();
			thread.setName(i+"번째 스레드");
			if(i==9) thread.setPriority(10); // 큰 숫자가 높은 순위
			thread.start();
		}
	}
}
