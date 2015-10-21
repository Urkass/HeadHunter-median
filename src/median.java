import java.util.Arrays;
import java.util.Scanner;



public class median {

	public static void main(String[] args) {
		System.out.print("Введите оба массива одинаковой длины (через пробел):\n");
		Scanner in = new Scanner(System.in);
		float[] arr1 = Read(in, 0);
		Arrays.sort(arr1);
		float[] arr2 = Read(in, arr1.length);
		Arrays.sort(arr2);
		in.close();
		System.out.print("Отсортированный 1ый массив: ");
		ShowArr(arr1);
		System.out.print("\nОтсортированный 2ой массив: ");
		ShowArr(arr2);
		float[] combinedArray = JoinArrays(arr1, arr2);
		Arrays.sort(combinedArray);
		System.out.print("\nОбщий массив: ");
		ShowArr(combinedArray);
		System.out.print("\nМедиана общего массива: ");
		FindMedian(combinedArray, arr1.length);

	}
	public static float[] Read(Scanner in, int lengthOfFirstArr){
		
		String mass;
		mass=in.nextLine();
		String[] stringMass = mass.split(" ");
		int length;
		//если lengthOfFirstArr = 0, то читаем первый массив, т.е. размер его еще не выбран
		//если больше 0, то читаем второй массив, т.е. первый массив уже задан, он определенной длины, и 2ой массив может быть только такого же размера
		if (lengthOfFirstArr>0) length=lengthOfFirstArr;
		else length=stringMass.length;
		float[] massOfFloat  = new float[length];
		if (stringMass.length==length){
			try{
				for (int i=0; i<length;i++){
				massOfFloat[i] = Float.parseFloat(stringMass[i]);
				}
			}catch(NumberFormatException e){
				System.out.println("Неверный формат массива. Введите заново: ");
				massOfFloat = Read(in, lengthOfFirstArr);
			}
		}
		else{
			System.out.println("Второй массив должен быть одинаковой длины с первым. Введите заново: ");
			massOfFloat = Read(in, lengthOfFirstArr);
		}
		
		
		return massOfFloat;
	}
	public static void ShowArr(float[] arr){
		for (int i=0; i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}
	public static float[] JoinArrays(float[] arr1, float[] arr2){
		 	if(arr1==null)return arr2;
		 	if(arr2==null)return arr1;
		 	float[] result=new float[arr1.length+arr2.length];
		 	System.arraycopy(arr1, 0, result, 0, arr1.length);
		 	System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
		 	return result;
		 }
	public static void FindMedian(float[] combinedArray, int mid){
		float median = (combinedArray[mid-1]+combinedArray[mid])/2;
		System.out.print(median);
	}

}
