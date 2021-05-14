class compoundint {
    public static void main(String args[])
    {
        double principle = 10000, rate = 10.25, time = 5,CI;

        CI = principle *(Math.pow((1 + rate / 100), time));

        System.out.println("CI= "+ CI);
    }
}

