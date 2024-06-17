
public class RomanToIntegerLeet {
    public static void main(String [] args){
        HashMap<Character , Integer > n1 = new HashMap<>();
       int ans = 0;
       n1.put('I' ,1);
       n1.put('V' ,5);
       n1.put('X' ,10);
       n1.put('L' ,50);
       n1.put('C' ,100);
       n1.put('D' ,500);
       n1.put('M' ,1000);

       for(int i = 0 ; i < n1.length() ; i++){
         if (i < s.length() - 1 && n1.get(s.charAt(i)) < n1.get(s.charAt(i + 1))) {
                ans -= n1.get(s.charAt(i));
            } else {
                ans += n1.get(s.charAt(i));
            }
       }
       System.out.println("ans is: "+ans);
    }
}
