package main;

public class JavaGit {

    public static void main(String[] args) {
        /*Ha hideg van, viszek kabátot, egyébként nem viszek*/
        /* 10 fok alatt van hideg */

        final int HIDEG_HATAR = 10;
        
        int fok = 7;
        boolean hidegVan = fok < HIDEG_HATAR;
        String nemViszek = "Nem viszek kabátot";
        String viszek = "Viszek kabátot";
        /* Ternális operátorral */
        
        String kiiras = hidegVan ? viszek : nemViszek;
        
        System.out.println(kiiras);
        
        
    }
    
}
