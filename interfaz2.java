import java.awt.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.*;

public class interfaz2 {
    JFrame f = new JFrame("Reporte del inventario del centro de investigacion");
    interfaz2(){
        //System.out.println("Hello World");
        
        f.setVisible(true);
        f.setSize(450,400);
        f.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel l1 = new JLabel("Tipo reporte: ");
        f.add(l1);
        
        JRadioButton option1 = new JRadioButton("Individual"); 
        JRadioButton option2 = new JRadioButton("General");
        ButtonGroup grupo = new ButtonGroup();
        option1.setSelected(true);
        grupo.add(option1);
        grupo.add(option2);


        option2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                interfaz3 menu3 = new interfaz3();
            }
        });

        f.add(option1);
        f.add(option2);

        JLabel l2 = new JLabel("C.I. del responsable de equipos: ");
        f.add(l2);
        JTextField t2 = new JTextField(20);
        f.add(t2);
        JButton b1 = new JButton("Totalizar:");
        
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Se debe actualizar la totalizacion");
            }
        });
        
        f.add(b1);
        JLabel l3 = new JLabel("Totalizacion: ");
        f.add(l3);

        //Lectura de numero de equipos
    
        /////////////////////////////////
        //Lectura de costo

        /////////////////////////////////

        JLabel l4 = new JLabel("___ equipos\n"+"___ BS ");
        f.add(l4);
        JButton b2 = new JButton("Continuar");
        
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        f.add(b2);


        

        //f.pack();
    }
}

