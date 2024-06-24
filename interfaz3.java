import java.awt.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class interfaz3 {
    JFrame f = new JFrame("Reporte del inventario del centro de investigacion");
    interfaz3(){
        //System.out.println("Hello World");
        
        f.setVisible(true);
        f.setSize(600,600);
        f.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel l1 = new JLabel("Tipo reporte: ");
        f.add(l1);
        
        JRadioButton option1 = new JRadioButton("Individual"); 
        JRadioButton option2 = new JRadioButton("General");
        ButtonGroup grupo = new ButtonGroup();
        option2.setSelected(true);
        grupo.add(option1);
        grupo.add(option2);


        option1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                interfaz2 menu2 = new interfaz2();
            }
        });

        f.add(option1);
        f.add(option2);
        String[] nombresColumnas = {"C.I. Responsable", "Cantidad equipos", "Monto total(Bs)"};
        //Object[][] filas;
        Object[][] filas ={
            { "", "", "" },
            { "", "", "" }
        };
        //data data1= new data();
        //data1.pue(filas);
        
        
        JTable tabla = new JTable(filas, nombresColumnas);
        //tabla.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(tabla);
        f.add(sp);
        JButton b1 = new JButton("Continuar");
        
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        f.add(b1);

        //f.pack();
    }
}

