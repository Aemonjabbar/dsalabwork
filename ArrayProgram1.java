public class HelloWorld{

     public static void main(String []args){
        int[] mylist=new int[10];
        int[] mylist1=new int[10];
        for(int i=0;i<10;i++){
            mylist[i]=i;
        }
             for(int j=0;j<10;j=j+2){
            mylist1[j]=j;
        }
            System.out.println("list 1 ");         
            for(int k=0;k<10;k++){
            System.out.println(mylist[k]);
        }
            System.out.println("list 2 ");
            for(int l=0;l<10;l++){
            System.out.println(mylist1[l]);
        }
         
         
     }
}