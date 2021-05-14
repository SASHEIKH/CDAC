public class ascii {
        char character;
        public void setcharacter(char c)
        {
            character=c;
        }
        int ascii()
        {
            return ((int)character);
        }
    }
    class asciii
    {
        public static void main(String args[])
        {
            ascii obj = new ascii();
            obj.setcharacter('s');
            System.out.println("ascii value of character: '" + obj.character+"' = "+ obj.ascii());
        }
    }

