package Leetcodesolutions;

public class removeadjacentcharacter {

    public static void main(String[] args) {

        String input = "I love my country";
        char[] ch=input.toCharArray();

        for(int i=0;i<ch.length-1;i++){
            if (ch[i + 1] !=' ') {
            char temp= ch[i];
            ch[i]=ch[i+1];
            ch[i+1]=temp;
            }
            i++;
        }
        System.out.println(ch);
    }

}
