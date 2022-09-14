class Lesson5 {
    public static void main (String[] args) {
       // int[] arrr = {11, 22, 33, 44, 55};
        //int f = 44;
        //for (int i = 0; i < arrr.length; i++) {
          //  if (arrr[i] == f) {
            //        System.out.println("found");
            //}
        //}
        
        //int wallet = 50;
       // do {
         //    int sum = (int) (Math.random() * 20); //randomno ot 0-19    
         //   wallet = wallet - sum; 
          //  System.out.println(sum + " : " + wallet);
        //} while (wallet > 0);
        int[] arr = new int[5]; // {1, 2, 3, 4, 5};        
        for (int i = 0 ; i<5; i ++) { // i=i+1 i=i+2  i+=2 eto schetchik na 2 // ;i < arr.length;
            arr[i] = i * i;// (int) (Math.random() * 20);sluch chislo
            System.out.print(i+ ":" +arr[i]);
            if (i < arr.length - 1) {
                System.out.print(" ,");  
        }   }
    
        System.out.println(" ");
    int[] arrr = {11, 22, 33, 44, 55};
        int min = arrr [0];
        for (int i = 0; i < arrr.length; i++) {
        if (arrr[1] < min) {
                min = arrr[i];
        }
        }                
                System.out.println(min);
            }
        }
