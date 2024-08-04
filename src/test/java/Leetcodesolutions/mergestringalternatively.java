package Leetcodesolutions;

public class mergestringalternatively {

    public static String mergealternatively(String s1,String s2){

        StringBuilder results = new StringBuilder();
        int i=0;
        while(i<s1.length()||i<s2.length()) {
            if (i < s1.length()) {
                results.append(s1.charAt(i));
            }
            if(i<s2.length()){
                results.append(s2.charAt(i));
            }
            i++;
        }

        return results.toString();
    }

    public static void main(String[] args){
        System.out.println(mergealternatively("venkat","Kannan"));
    }
}
