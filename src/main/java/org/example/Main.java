package org.example;

/*
Expected Output:

Local Variables:
  localDecimal = 100
  localHex = 255
  localBinary = 13
  localOctal = 12
  localLong = 10000000
  localString = Every step I take gets me closer to my goal.

Instance Variables:
  instanceBinary = 45
  instanceOctal = 58
  instanceDouble = 1234.95

Static Variable:
  staticHex = 6699
  staticByte = 1
  staticString = Progress, not perfection.
 */
public class Main {
    public static void main(String[] args) {
        int localDecimal = 100;
        int localHex = 0xFF;
        int localBinary = 0b1101;
        int localOctal = 014;
        long localLong = 10000000L;
        String localString = "Every step I take gets me closer to my goal.";

        int instanceBinary = 0b101101;
        int instanceOctal = 072;
        double instanceDouble = 1234.95;

        SomeClass someClass = new SomeClass(instanceBinary, instanceOctal, instanceDouble);

        System.out.println("Local Variables:");
        System.out.println("  localDecimal = " + localDecimal);
        System.out.println("  localHex = " + localHex);
        System.out.println("  localBinary = " + localBinary);
        System.out.println("  localOctal = " + localOctal);
        System.out.println("  localLong = " + localLong);
        System.out.println("  localString = " + localString);
        System.out.println("");
        System.out.println("Instance Variables:");
        System.out.println("  instanceBinary = " + someClass.getInstanceBinary());
        System.out.println("  instanceOctal = " + someClass.getInstanceOctal());
        System.out.println("  instanceDouble = " + someClass.getInstanceDouble());
        System.out.println("");
        System.out.println("Static Variables:");
        System.out.println("  staticHex = " + SomeClass.staticHex);
        System.out.println("  staticByte = " + SomeClass.staticByte);
        System.out.println("  staticString = " + SomeClass.staticString);

    }
}