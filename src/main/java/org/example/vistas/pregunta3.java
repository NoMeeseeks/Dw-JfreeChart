package org.example.vistas;

import org.example.controller.Usuario;
import org.example.controller.ventasXrango;
import org.example.dao.ventasXrangoDAO;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class pregunta3 extends JFrame {
    private JPanel form33;

    public pregunta3(){
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            this.setSize(new Dimension(500, 500));
            this.setMinimumSize(new Dimension(400, 400));

            ventasXrangoDAO usuariosDAO=new ventasXrangoDAO();
            List<ventasXrango> usuarios=usuariosDAO.obtenerRango();
            DefaultPieDataset datos = new DefaultPieDataset<>();
            if(usuarios.isEmpty()){
                System.out.println("no hay cosas");
            }else {
                for(ventasXrango aaa: usuarios){
                    datos.setValue(String.valueOf(aaa.getMonth()),aaa.getCantidad());
                }
            }

            JFreeChart grafico = ChartFactory.createPieChart(
                    "Grafio sobre la cantidad de datos en los meses",
                    datos,
                    true,
                    true,
                    false
            );
            ChartPanel panel=new ChartPanel(grafico);
            panel.setMouseWheelEnabled(true);
            panel.setPreferredSize(new Dimension(400,200));

        form33.setLayout(new BorderLayout());
        form33.setSize(new Dimension(500,500));
        form33.add(panel,BorderLayout.NORTH);
            pack();
            repaint();
            this.add(form33);
            this.setVisible(true);
    }

}
