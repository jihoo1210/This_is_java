package This_is_java_1;

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
	}
}
