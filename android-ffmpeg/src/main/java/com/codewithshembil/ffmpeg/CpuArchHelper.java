package com.codewithshembil.ffmpeg;

import android.os.Build;

public class CpuArchHelper {
    public static final String X86_CPU = "x86";
    public static final String X86_64_CPU = "x86_64";
    public static final String ARM_64_CPU = "arm64-v8a";
    public static final String ARM_V7_CPU = "armeabi-v7a";


    public static final String i686 = "I686";
    public static final String ARM = "ARM";
    public static final String x86 = "X86";

    public static CpuArch getCpuArch() {
        Log.d("Build.CPU_ABI : " + Build.CPU_ABI);
        Log.d("OS.ARC : " + System.getProperty("os.arch"));
        String arch = System.getProperty("os.arch");
        String arc = arch.toUpperCase();
        switch (arc) {
            case i686:
                return CpuArch.i686;
            case x86:
                return CpuArch.x86;
            case ARM:
                return CpuArch.ARMv7;
            default:
                return CpuArch.NONE;
        }

        /*switch (Build.CPU_ABI) {
            case X86_CPU:
            case X86_64_CPU:
                return CpuArch.x86;
            case ARM_64_CPU:
            case ARM_V7_CPU:
                return CpuArch.ARMv7;
            default:
                return CpuArch.NONE;
        }*/
    }
}
