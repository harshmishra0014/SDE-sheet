package Day15;

import java.util.Stack;

public class reverseWordsInString
{
    public static void main(String[] args)
    {
        //String s=" Today is a good day";
        String s="a good example";
        String ans= reverseWords(s);
        System.out.println(ans);
    }

    // using stack
//    public static String reverseWords(String s)
//    {
//        s=s+" ";
//        String ans="";
//        Stack<String> st = new Stack<String>();
//        String temp="";
//        for(int i=0;i<s.length();i++)
//        {
//            if(s.charAt(i)==' ')
//            {
//                if(temp.length()!=0)
//                    st.push(temp);
//                temp="";
//            }
//            else
//                temp+=s.charAt(i);
//        }
//        while(!st.empty())
//        {
//            ans=ans+st.peek()+" ";
//            st.pop();
//        }
//        ans=ans.trim();
//        return ans;
//    }

    // using same string
    public static String reverseWords(String s)
    {
        s=s+" ";
        int start=0;
        int last = s.length()-1;
        String ans="";
        String temp="";
        while(start<=last)
        {
            if(s.charAt(start)==' ')
            {
                if(ans.equals(""))
                    ans=ans+temp;
                else
                    ans=temp+" "+ans;
                temp="";
            }
            else
                temp=temp+s.charAt(start);
            start++;
        }

        return  ans;
    }
}
