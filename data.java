import java.io.*;
import java.util.*;
import java.awt.*;
public class data {
    public String desc="?"; // Descripción del equipo
    public int ct=-1; // Cantidad de equipos
    public int mu=-1; // Costo unitario
    public String Fecha;
    public String nf="?"; // Número de factura
    public String ci="?"; // Cédula de identidad del profesor

    public void escribir(String desc,int ct,int mu,String Fecha,String nf,String ci)
    {
        try {

            File archivo= new File("data.txt");
            FileWriter escritor = new FileWriter(archivo,true);
            String linea=desc+"#"+ct+"#"+mu+"#"+Fecha+"#"+nf+"#"+ci+"\n";
            escritor.write(linea);
            escritor.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void leerf()
    {
        try {
            FileReader archivo = new FileReader("data.txt");
            BufferedReader lector = new BufferedReader(archivo);
            int Bs_totales;
            String linea;
            int i = 0;
            while ((linea = lector.readLine()) != null) {
                String[] partes= linea.split("#");
                this.ct=Integer.parseInt(partes[1]);//cantidad
                this.mu=Integer.parseInt(partes[2]); //mu
                this.ci=partes[7];            //cedula
                Bs_totales=ct*mu;
                


                System.out.println(Bs_totales);
                i = i+1;
            }
            lector.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    



}
