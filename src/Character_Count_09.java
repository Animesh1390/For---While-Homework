public class Character_Count_09 {

   static int output =0; // variable declared and initialised.



    public static void main(String[] args) // main method

    {

        String s= "Hello Java I am gonna make it";
        char   c = 'a';
        System.out.println(count(s , c));
    }
    public static int count(String s, char c) // int count method
    {
        for (int i =0; i<s.length(); i++)   // using for loop method
        {
            if (s.charAt(i)==c)
                output++;


        }
        return output;

    }
}

