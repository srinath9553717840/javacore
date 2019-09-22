package com.nt.beans;

class FindCommon 
{ 
	 
	void findCommon(int ar1[], int ar2[], int ar3[]) 
	{ 
	
		int i = 0, j = 0, k = 0; 

		
		while (i < ar1.length && j < ar2.length && k < ar3.length) 
		{ 
			
			if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) 
			{ System.out.print(ar1[i]+" "); i++; j++; k++; } 

			
			else if (ar1[i] < ar2[j]) 
				i++; 

		
			else if (ar2[j] < ar3[k]) 
				j++; 

			
			else
				k++; 
		} 
	} 

	
	public static void main(String args[]) 
	{ 
		FindCommon ob = new FindCommon(); 
	int	ar1[] = {1, 5, 9};
	int	ar2[] = {3, 4, 5, 9, 10};
	int	ar3[] = {5, 9, 10, 20};

		System.out.print("Common elements are "); 
		ob.findCommon(ar1, ar2, ar3); 
	} 
} 

