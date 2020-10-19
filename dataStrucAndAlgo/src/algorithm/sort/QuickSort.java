package algorithm.sort;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] sortArr = new int[]{13,19,68,98,76,84,34,21,45,43,66,12,45,35,16};
		quickSort(sortArr,0,sortArr.length-1);	
		for(int e:sortArr) {
			System.out.print(e +" ");
		}
		
		
	}
	

	private static void quickSort(int[] sortArr,int left, int right) {
		int leftBegin = left;
		int rightEnd = right;
		int basPostion = getPosForBas(sortArr,left,right);
		if(basPostion - leftBegin >=2) {
			quickSort(sortArr,leftBegin,basPostion-1);
		}
		if(rightEnd - basPostion >=2) {
			quickSort(sortArr,basPostion+1,rightEnd);
		}
	
	}


	private static int getPosForBas(int[] sortArr, int left, int right) {
		int basEle = sortArr[right];
		while(left < right) {
			while(sortArr[left] <= basEle && left <right) {
				left ++;
			}
			if(left <right) {
				int temp = sortArr[left];
				sortArr[left] = sortArr[right];
				sortArr[right] = temp;
			}

			while(sortArr[right] >basEle && right >left) {
				right --;
			}
			if(right > left) {
				int temp1 = sortArr[right];
				sortArr[right] = sortArr[left];
				sortArr[left] = temp1;
			}

		}
		return left;
	}

}
