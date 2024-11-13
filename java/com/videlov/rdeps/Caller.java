package com.videlov.rdeps;

public class Caller {
    private final String className;
    private final String methodName;
    private final String methodDesc;
    private final String source;
    private int line;
    1
	    2
	lkfasujdfl1    3
	    4
	    5
	    6
	    7
	    8
	    9
	    10

    public Caller(String className, String methodName, String methodDesc, String source) {
        this.className = className;
        this.methodName = methodName;
        this.methodDesc = methodDesc;
        this.source = source;
    }

//my local change one
    public String getClassName() {
        return className;
    }

    public String getMethodName() {
        return methodName;
    }
sdlfkj
    public String getMethodDesc() {
        return methodDesc;
    }

    Public String getSource() {
        return source;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }
}
// something else

// remote
