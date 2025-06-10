
package This_is_java_1;
import java.util.Scanner;
public class Reference_type_Example {
	public static void main (String[] args) {
	//최소값 구하기
	int[] array = {9, 5, 2, 8, 6};
	int min = 99;
	for(int i = 0; i < 5; i++) {
		if(array[i] <  min) {
			min = array[i];
			}
		}
	System.out.println("min: "+ min);
	
	//평균값 구하기
	int[][] array1 = {
			{95, 86},
			{83, 92, 96},
			{78, 83, 93, 87, 88}
	};
	int sum1 = 0;
	double avg1 = 0.0;
	
	for(int i = 0; i < 3; i++) {
		for(int a = 0; a < array1[i].length; a++) {
			sum1 += array1[i][a];
		}
		avg1 = (double)sum1 / (array1[0].length + array1[1].length + array1[2].length);
	}
	
	System.out.println("sum ="+sum1);
	System.out.println("avg ="+avg1);
	//향산된 for 문 이용
	System.out.println("----------------------");
	int sum2 = 0;
	double avg2 = 0;
	int count = 0;
	for(int row[] : array1) {
		for(int value : row) {
			sum2 += value;
			count++;
		}
	}
	avg2 = (double)sum2 / count;
	System.out.println("sum ="+sum2);
	System.out.println("avg ="+avg2);
	System.out.println("sum2의 타입: " + ((Object)sum2).getClass().getSimpleName());
	System.out.println("count의 타입: " + ((Object)count).getClass().getSimpleName());
	//최고값과 평균값 구하기
	System.out.println("----------------------");
	boolean run = true;
	int studentNum = 0;
	int[] scores = null;
	int sum = 0;
	int count1 = 0;
	double avg = 0;
	int max = 0;
	Scanner scanner = new Scanner(System.in);
	
	while(run) {
		System.out.println("----------------------");
		System.out.println("1. 학생 수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
		System.out.println("----------------------");
		System.out.print("선택: ");
		
		int selectNo = scanner.nextInt();
		
		if(selectNo == 1) {
			System.out.print("학생 수: ");
			int selectNo1 = scanner.nextInt();
			studentNum = selectNo1;
			scores = new int[studentNum];
		} else if(selectNo == 2) {
			for(int i = 0; i < studentNum; i++) {
				System.out.print("scores["+i+"]: ");
				int selectSr = scanner.nextInt();
				scores[i] = selectSr; 
			}
		} else if(selectNo == 3) {
			for(int i = 0; i < studentNum; i++) {
				System.out.println("scores["+i+"]: " + scores[i]);
			}
		} else if(selectNo == 4) {
			for(int i = 0; i < studentNum; i++) {
				if(scores[i] > max) {
					max = scores[i];
				}
				for(int value : scores) {
						sum += value;
						count1++;
				}
				avg = (double)sum/count1;
			}
			System.out.println("최고 점수: "+max);
			System.out.println("평균 점수: "+avg);
			} 
		else if(selectNo == 5) {
			run = false;
			System.out.println("프로그램 종료");
		}
	}
	}
}
