import java.util.*;

public class QuickSort{

   public static void quickSort(double[] productPrices,int low,int high){
    if(low<high){
        int pivotIndex=partition(productPrices,low,high);
        quickSort(productPrices,low,pivotIndex-1);
        quickSort(productPrices,pivotIndex+1,high);

    }
   }
   public static int partition(double[] productPrices,int low,int high){
    double pivot=productPrices[high];
    int i=low-1;

    for(int j=low;j<high;j++){
        if(productPrices[j]<pivot){
            i++;
            double temp=productPrices[i];
            productPrices[i]=productPrices[j];
            productPrices[j]=temp;
        }
    }
    double temp=productPrices[i+1];
    productPrices[i+1]=productPrices[high];
    productPrices[high]=temp;
    return i+1;

   }

    

   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no of products: ");
    int n=sc.nextInt();
    double[] productPrices=new double[n];
    System.out.println("Enter the product prices: ");

    for(int i=0;i<n;i++){
        productPrices[i]=sc.nextDouble();
    }
    quickSort(productPrices,0,n-1);
    System.out.println("Sorted Prices:");
    for(double price:productPrices){
        System.out.println(price+" ");
    }
   }

}