class MyInteger {
    public int newValue;

    public MyInteger(int value) {
        newValue = value;
    }

    public int getValue() {
        return newValue;
    }

    public boolean isEven() {
        return (newValue % 2) == 0;
    }

    public boolean isOdd() {
        return (newValue % 2) == 1;
    }

    public boolean isPrime() {
        if (newValue == 1 || newValue == 2) {
            return true;
        }
        else {
            for (int i = 2; i < newValue; i++) {
                if (i % newValue == 0) return false;
            }
        }
        return true;
    }

    public static boolean isEven(int newInt) {
        return (newInt % 2) == 0;
    }

    public static boolean isOdd(int newInt) {
        return (newInt % 2) == 1;
    }

    public static boolean isPrime(int newInt) {
        if (newInt == 1 || newInt == 2) {
            return true;
        }
        else {
            for (int i = 2; i < newInt; i++) {
                if (i % newInt == 0) return false;
            }
        }
        return true;
    }    

    public static boolean isEven(MyInteger newInt) {
        return newInt.isEven();
    }

    public static boolean isOdd(MyInteger newInt) {
        return newInt.isOdd();
    }

    public static boolean isPrime(MyInteger newInt) {
        return newInt.isPrime();
    }

    public boolean equals(int testInt) {
        if (testInt == newValue) 
            return true;
        return false;
    }

    public boolean equals(MyInteger newInt) {
        if (newInt.newValue == this.newValue) 
            return true;
        return false;
    }

    public static int parseInt(char[] integers) {
        int sum = 0;
        for (char i : integers) {
            sum += Character.getNumericValue(i);
        }
        return sum;
    }

    public static int parseInt(String value) {
        return Integer.parseInt(value);
    }
}