class Lesson4 {
    public static void main (String[] args) {
        int t =0;
       // boolean booleanExpresson = t==0;// t<0;
       // System.out.println(booleanExpresson);
      //  if (booleanExpresson) {
      //      System.out.println("It`s zero");//"It`s frost");
     //   }   else {
      //      System.out.println("It`s no frost");
      //  }
      //
     // if (t<0) {
       //   System.out.println("It`s frost");
       // }   else {
         //   System.out.println("It`s no frost");
   // }
   // }
   // System.out.println(t<0? "it is frost" : " it is no frost");
     int m = 1; 
   // if (m==12 || m==1 || m==2) {
   //  System.out.println("winter");
   // } else if (m==3 || m==4 || m==5) {
   //   System.out.println("spring");
   // }  else {
  //  System.out.println("error");
   // }
    boolean isWeekend = false;// !false =true
    boolean isiamFree = true;
    if (isWeekend && isiamFree) {
      System.out.println("can walk") ;
    } else {
    System.out.println("no walk");
    }    
        int d = 6;
    switch (d) {
        case 12:
        case 1:
        case 2:
     System.out.println("winter");
        break;     
        case 3:
        case 4:
        case 5:
    System.out.println("spring");
        break;
    default:
    System.out.println("error");
    break;
   
   
}
}
}