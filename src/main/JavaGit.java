package main;

public class JavaGit {

    public static void main(String[] args) {
        /*Ha hideg van, viszek kabátot, egyébként nem viszek*/
        /* 10 fok alatt van hideg */

        final int HIDEG_HATAR = 10;
        
        int fok = 7;
        boolean hidegVan = fok < HIDEG_HATAR;
        String kiiras = "viszek kabátot";
        /* Ternális operátorral */
        
        kiiras = hidegVan ? kiiras : "Nem" + kiiras;
        
        System.out.println(kiiras);
        
        
    }
    
}
