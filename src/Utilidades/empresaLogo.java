
package Utilidades;

import javax.swing.ImageIcon;


public class empresaLogo {
    private static ImageIcon logo;

    public static ImageIcon getLogo() {
        return logo;
    }

    public static void setLogo(ImageIcon logo) {
        empresaLogo.logo = logo;
    }

    
}
