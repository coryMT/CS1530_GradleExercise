package demo;

public class GradleDemo{

  public static void main(String[] args){
    String arg1 = args[0];
    int arg2 = 0;

    try{
      arg2 = Integer.valueOf(args[1]);
    }
    catch(Exception e){
      System.out.println("That was not an int.");
      System.exit(2);
    }

    if(arg1.equals("lazy")){
      Lazy(arg2);
    }
    else if(arg1.equals("triangle")){
      Tri(arg2);
    }
    else {
      System.out.println("You must enter Lazy or Triangle");
      System.exit(2);
    }
  }

  public static int Tri(int n){
    int sum = n*(n+1)/2;
    System.out.println("Tri(" + n + ") = " + n*(n+1)/2);
    return sum;
  }

  public static int Lazy(int n){
    int sum = (int)(Math.pow(n, 2) + n + 2)/2;
    System.out.println("Lazy(" + n + ") = " + (Math.pow(n, 2) + n + 2)/2);
    return sum;
  }
}
