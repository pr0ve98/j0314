package t3_MultiThreadTest2;

class SMIFile extends Thread {
	@Override
	public void run() {
		// #2. 자막
		String[] smiArray = {"하나","둘","셋","넷","다섯"};
		try {Thread.sleep(10);} catch (InterruptedException e) {}
				
		// #4. 자막출력
		for(int i=0; i<smiArray.length; i++) {
			System.out.println("- 자막: "+smiArray[i]);
			try {Thread.sleep(300);} catch (InterruptedException e) {}
		}
	}	
}
class ScreenFile extends Thread {
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
}


public class T2_ThreadRun {
	public static void main(String[] args) {
		// 자막 객체 생성 실행
		Thread smi = new SMIFile();
		smi.start();
		
		// 영상 객체 생성 실행
		Thread screenFile = new ScreenFile();
		screenFile.start();
	}
}
