public class ascii {
        char character;
        public ascii()
        {
            character='f';
        }
        public ascii(char ch)
        {
            this.character=ch;
        }
        void ascii()
        {
            int asc=(int)character;
            System.out.println("ascii value of character: '" +character+"' = "+asc);
        }
    }
    class asciii
    {
        public static void main(String args[])
        {
            ascii obj = new ascii();
            obj.ascii();
            ascii obj1 = new ascii('r');
            obj1.ascii();

        }
    }

