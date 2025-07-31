package org.example;

public class SomeClass {
    static int staticHex;
    static byte staticByte;
    static String staticString;

    static {
        staticHex = 0x1A2B;
        staticByte = 1;
        staticString = "Progress, not perfection.";
    };

    private int instanceBinary;
    private int instanceOctal;
    private double instanceDouble;

    SomeClass(int instanceBinary, int instanceOctal, double instanceDouble){
        this.instanceBinary = instanceBinary;
        this.instanceOctal = instanceOctal;
        this.instanceDouble = instanceDouble;
    }

    public int getInstanceBinary() {
        return instanceBinary;
    }

    public int getInstanceOctal() {
        return instanceOctal;
    }

    public double getInstanceDouble() {
        return instanceDouble;
    }
}
