package t3_MultiThreadTest2;

//class SMIFile2 implements Runnable {
//	@Override
//	public void run() {
//		// #2. 자막
//		String[] smiArray = {"하나","둘","셋","넷","다섯"};
//		try {Thread.sleep(10);} catch (InterruptedException e) {}
//				
//		// #4. 자막출력
//		for(int i=0; i<smiArray.length; i++) {
//			System.out.println("- 자막: "+smiArray[i]);
//			try {Thread.sleep(300);} catch (InterruptedException e) {}
//		}
//	}	
//}
//class ScreenFile2 implements Runnable {
//	@Override
//	public void run() {
//		// #1. 영상프레임 1~5커트
//		int[] screenArray = {1,2,3,4,5};
//		
//		// #3. 영상출력
//		for(int i=0; i<screenArray.length; i++) {
//			System.out.print("영상프레임: "+screenArray[i]);
//			try {Thread.sleep(300);} catch (InterruptedException e) {}
//		}
//	}	
//}


public class T4_ThreadRun {
	public static void main(String[] args) {
		// 자막을 출력하는 스레드를 익명클래스로 구현한다
		Thread th1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// #2. 자막
				String[] smiArray = {"하나","둘","셋","넷","다섯"};
				try {Thread.sleep(10);} catch (InterruptedException e) {}
						
				// #4. 자막출력
				for(int i=0; i<smiArray.length; i++) {
					System.out.println(" - 자막: "+smiArray[i]);
					try {Thread.sleep(300);} catch (InterruptedException e) {}
				}
			}
		});
		
		// 영상을 출력하는 스레드를 익명클래스로 구현한다
		Thread th2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// #1. 영상프레임 1~5커트
				int[] screenArray = {1,2,3,4,5};
					
				// #3. 영상출력
				for(int i=0; i<screenArray.length; i++) {
					System.out.print("영상프레임: "+screenArray[i]);
					try {Thread.sleep(300);} catch (InterruptedException e) {}
				}
			}
		});
		
		th1.start();
		th2.start();
		
	}
}
