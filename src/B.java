import java.util.Arrays;

class B {

		    public static int[] distance(int arr[], int start, int end) {
		    	int answer[] = new int[100];
		    	int j=0;
		    	boolean flag = true;
		    	for(int i=0;i<arr.length; i++) {
		    		if(arr[i]>start && arr[i]<end) {
		    			flag=false;
		    			answer[j] = arr[i];
//		    			System.out.print(answer[j]+ " ");
		    			j++;
		    		}
		    	}
//		    	int len = 0;
//		    	for(int i=0;i<answer.length;i++) {
//		    		if(answer[i]!=0) {
//		    			len++;
//		    		}
//		    	}
//		    	int newarr[] = new int[len];
//		    	int k=0;
//		    	for(int i=0;i<answer.length;i++) {
//		    		if(answer[i]!=0) {
//		    			newarr[k] = answer[i];
//		    			k++;
//		    		}
//		    	}
		    	if(flag==true) {
		    		answer[0] = -1;
		    	}
//		    	return newarr;
		    	return answer;
		       }
		    public static void main(String args[]) {
		    	int[] arr = {29, 38, 12, 48, 39, 55};
		    	int start=30;
		    	int end=50;
		    	int ans[] = distance(arr,start, end);
		    	for(int i=0;i<ans.length;i++) {
		    		System.out.print(ans[i]+ " ");
		    	}
		    }
		}