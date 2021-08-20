package javapractice;

public class Otpgenrate {
    public static String generateOTP() 
    { 
        long randomPin  = (long) ((Math.random()*9000)+1000);
        
        return String.valueOf(randomPin); 
    }
            public static void main(String args[])
    {
        
        System.out.println("OTP : "+generateOTP());
    }
}

