package main;

public class JavaGit {

    public static void main(String[] args) {
        /*Ha hideg van, viszek kabátot, egyébként nem viszek*/
        /* 10 fok alatt van hideg */

        final int HIDEG_HATAR = 10;
        
        int fok = 7;
        boolean hidegVan = fok < HIDEG_HATAR;
        String kiiras = "Nem viszek kabátot";
        
        if(hidegVan){
            kiiras = "Viszek kabátot";
        }
        System.out.println(kiiras);
        
        
    }
    
}
