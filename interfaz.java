//package Swing;
import java.awt.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.*;
import java.io.*;
import java.util.*;


public class interfaz {

    public static void main(String[] args) {
        //System.out.println("Hello World");
        JFrame f = new JFrame("Registro y control de equipos en centro de investigacion");
        
        //f.setResizable(false);
        
        f.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        f.setSize(250,550);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel l1 = new JLabel("Ingrese data del equipo");
        f.add(l1);
        JLabel l2 = new JLabel("Descripcion");
        f.add(l2);
        JTextField t2 = new JTextField(20);
        f.add(t2);
        JLabel l3 = new JLabel("Cantidad");
        f.add(l3);
        JTextField t3 = new JTextField(20);
        f.add(t3);
        JLabel l4 = new JLabel("Costo unitario (Bs)");
        f.add(l4);
        JTextField t4 = new JTextField(20);
        f.add(t4);
        JLabel l5 = new JLabel("Fecha de adquisicion: dd/mm/aaaa");
        f.add(l5);
        JTextField t5 = new JTextField(20);
        f.add(t5);
        JLabel l6 = new JLabel("Nro de factura");
        f.add(l6);
        JTextField t6 = new JTextField(20);
        f.add(t6);
        JLabel l7 = new JLabel("C.I. del responsable del equipo");
        f.add(l7);
        JTextField t7 = new JTextField(20);
        f.add(t7);
        
        

        JButton b1 = new JButton("Registar data"); //figura 1
        JButton b2 = new JButton("Generar reporte"); //figura 2 (falta implementar)
        JButton b3 = new JButton("Salir"); //Salir

        

        b1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String desc = t2.getText();
            String text = t3.getText();
            int ct = Integer.parseInt(text);
            text = t4.getText();
            int mu = Integer.parseInt(text);
            String fecha = t5.getText(); 
            String nf = t6.getText();
            String ci = t7.getText();
            
            data data1= new data();
            data1.escribir(desc, ct, mu, fecha, nf, ci);
        }
        });
        
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                interfaz2 menu2 = new interfaz2();

            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        f.add(b1);
        f.add(b2);
        f.add(b3);

        
        
        
        
        //f.pack();
        
    }
}
