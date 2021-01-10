package Utilidades;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;
import javax.swing.JOptionPane;

public class DatosConexion {
    Properties properties;
    /**
     * @return the CorteCaja
     */
    public String getCorteCaja() {
        try (FileReader reader = new FileReader("Config")) {
            properties = new Properties();
            properties.load(reader);
            return CorteCaja = properties.getProperty("CorteCaja");
        } catch (Exception e) {
            return CorteCaja;
        }
    }

    /**
     * @param CorteCaja the CorteCaja to set
     */
    public void setCorteCaja(String CorteCaja) {
        try (FileReader reader = new FileReader("Config")) {
            properties = new Properties();
            properties.load(reader);
            properties.setProperty("CorteCaja", CorteCaja);
            properties.store(new FileWriter("Config"), "un comentario");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        this.CorteCaja = CorteCaja;
    }

    /**
     * @return the IVA
     */
    public String getIVA() {
        try (FileReader reader = new FileReader("Config")) {
            properties = new Properties();
            properties.load(reader);
            return IVA = properties.getProperty("IVA");
        } catch (Exception e) {
            return IVA;
        }
    }

    /**
     * @param IVA the IVA to set
     */
    public void setIVA(String IVA) {
        try (FileReader reader = new FileReader("Config")) {
            properties = new Properties();
            properties.load(reader);
            properties.setProperty("IVA", IVA);
            properties.store(new FileWriter("Config"), "un comentario");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Algo salio mal: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        this.IVA = IVA;
    }
    

    /**
     * @return the RangoDias
     */
    public String getRangoDias() {
        try (FileReader reader = new FileReader("Config")) {
            properties = new Properties();
            properties.load(reader);
            return RangoDias = properties.getProperty("RangoDias");
        } catch (Exception e) {
            return RangoDias;
        }
    }

    /**
     * @param RangoDias the RangoDias to set
     */
    public void setRangoDias(String RangoDias) {
        this.RangoDias = RangoDias;
    }

    /**
     * @return the RangoStock
     */
    public String getRangoStock() {
        try (FileReader reader = new FileReader("Config")) {
            properties = new Properties();
            properties.load(reader);
            return RangoStock = properties.getProperty("RangoStock");
        } catch (Exception e) {
            return RangoStock;
        }
    }

    /**
     * @param RangoStock the RangoStock to set
     */
    public void setRangoStock(String RangoStock) {
        this.RangoStock = RangoStock;
    }

    /**
     * @return the NameServer
     */
    public String getNameServer() {
        try (FileReader reader = new FileReader("Config")) {
            properties = new Properties();
            properties.load(reader);
            return NameServer = properties.getProperty("NameServer");
        } catch (Exception e) {
            return NameServer;
        }
    }

    /**
     * @param NameServer the NameServer to set
     */
    public void setNameServer(String NameServer) {
        this.NameServer = NameServer;
    }

    /**
     * @return the Puerto
     */
    public String getPuerto() {
        try (FileReader reader = new FileReader("Config")) {
            properties = new Properties();
            properties.load(reader);
            return Puerto = properties.getProperty("Puerto");
        } catch (Exception e) {
            return Puerto;
        }
    }

    /**
     * @param Puerto the Puerto to set
     */
    public void setPuerto(String Puerto) {
        this.Puerto = Puerto;
    }

    /**
     * @return the NombreBD
     */
    public String getNombreBD() {
        try (FileReader reader = new FileReader("Config")) {
            properties = new Properties();
            properties.load(reader);
            return NombreBD = properties.getProperty("NombreBD");
        } catch (Exception e) {
            return NombreBD;
        }
    }

    /**
     * @param NombreBD the NombreBD to set
     */
    public void setNombreBD(String NombreBD) {
        this.NombreBD = NombreBD;
    }

    /**
     * @return the Username
     */
    public String getUsername() {
        try (FileReader reader = new FileReader("Config")) {
            properties = new Properties();
            properties.load(reader);
            return Username = properties.getProperty("Username");
        } catch (Exception e) {
            return Username;
        }
    }

    /**
     * @param Username the Username to set
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        try (FileReader reader = new FileReader("Config")) {
            properties = new Properties();
            properties.load(reader);
            return Password = properties.getProperty("Password");
        } catch (Exception e) {
            return Password;
        }
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }
    private String NameServer;
    private String Puerto;
    private String NombreBD;
    private String Username;
    private String Password;
    private String RangoDias;
    private String RangoStock;
    private String CorteCaja;
    private String IVA;
}
