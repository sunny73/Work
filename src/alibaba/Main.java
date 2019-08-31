package alibaba;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

/** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    static int[] getIndexAndLongest(String users,int k) {
        int girlcount=0;
        int girlMax=0;
        int happyboy=0;
        int girlnum=0;
        int boynummax=0;
        int result[]=new int [2];

        if(users==null||users.length()==0)
        {
            return null;
        }
        for(int i=0;i<users.length();i++)
        {
            if(users.charAt(i)=='b') {
                girlcount=0;
                if (i == 0)
                {
                    if (users.charAt(users.length() - 1) == 'g') {
                        girlcount++;
                    }
                    if (users.charAt(i + 1) == 'g') {
                        girlcount++;
                    }
                }
                else if (i == users.length() - 1)
                {
                    if(users.charAt(i-1)=='g'){girlcount++;}
                    if(users.charAt(0)=='g'){girlcount++;}

                }
                else {
                    if (users.charAt(i - 1) == 'g') {
                        girlcount++;
                    }
                    if (users.charAt(i + 1) == 'g') {
                        girlcount++;
                    }
                }
                if(girlcount>girlMax){
                    girlMax=girlcount;
                    happyboy=i;
                }
                int j=i;
                girlnum=0;
                while(girlnum<=k)
                {
                    if(j==users.length()-1) {
                        j=0;
                    }else {
                        j++;
                    }
                    if(users.charAt(j)=='g')
                    {
                        girlnum++;
                    }
                    if(j>boynummax)
                    {
                        boynummax=j;
                    }
                }



            }
        }

        result[0]=happyboy;
        result[1]=boynummax;
        return   result;

    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] res;
        int k=0;

        String _users;
        try {
            _users = in.nextLine();
            k= in.nextInt();


        } catch (Exception e) {
            _users = null;
        }

        res = getIndexAndLongest(_users,k);
        System.out.println(res[0]+" "+res[1]);
    }
}