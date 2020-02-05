

public class Runner {
    //your main containing tests output
    public static void main(String[] args) {
        System.out.println(mixStart("ni"));
        System.out.println(mixStart("nix"));
        System.out.println(mixStart("mix snacks"));
        System.out.println(arrayFront9([1, 2, 3, 4, 5]));
    }

    //your codingbat method here - must match
    // the method name from codingbat
    public static String helloName(String name) {
        return "hi " + name;
    }   // next codingbat method here

/*warm up 1 problem:*/
    public static boolean mixStart(String str) {
        if(str.length() < 3){
            return false;
        }
        String ix = str.substring(1, 3);
        if (ix .equals ("ix")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean arrayFront9(int[] num) {
if(num.length >= 4) {
    for (int i = 0; i < 4; i++) {
        if (num[i] == 9) {
            return true;
        }
    }
}
if(num.length < 4){
    for(int i = 0; i < num.length; i++){
        if(num[i] == 9){
            return true;
        }
    }
}
        return false;
    }





    public static int biggerTwo(int[] a, int[] b){
        int one = a[0] + a[1];
        int two = b[0] + b[1];
        if(one > two){
            return one;
        }
        if(two > one){
            return two;
        }
        return 0;
    }

    public String without2(String str) {
        if(str.length() < 2){
            return " ";
        }
        return str;
    }






/*do not code below!!!!*/
}
