package edu.bu.met.cs665;

public class HandleProxy {

    private static volatile HandleProxy handleProxy;
    GenerateEmailCommand generateEmailCommand;
    private HandleProxy() {
        generateEmailCommand = new GenerateEmailCommand();
    }

    public static HandleProxy getInstance() {
        if(handleProxy == null) {
            synchronized (HandleProxy.class) {
                if(handleProxy == null) {
                    handleProxy = new HandleProxy();
                }
            }
        }
        return handleProxy;
    }



}
