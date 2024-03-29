package org.example.vistas;

import org.example.controller.nombreXventas;
import org.example.controller.pregunta1;
import org.example.dao.primeraPreguntaDAO;
import org.example.dao.segundaPreguntaDao;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.util.List;

import static java.lang.String.valueOf;

public class pregunta2 extends JFrame{
    private JPanel panel2;
    public pregunta2(){
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(500, 500));
        this.setMinimumSize(new Dimension(400, 400));

        segundaPreguntaDao obj=new segundaPreguntaDao();
        List<nombreXventas>listaOBJDAO= obj.obtenerPregunta2();
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        if(listaOBJDAO.isEmpty()){
            System.out.println("no hay cosas");
        }else {
            for(nombreXventas datosLista: listaOBJDAO){
                datos.setValue(datosLista.getCantidad_ventas(),
                        valueOf(datosLista.getNombre()),
                        "cantidad");
            }
        }

        JFreeChart graficoBarras = ChartFactory.createBarChart(
                "Nombres repetidos",
                "y",
                "x",
                datos,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );
        ChartPanel panel=new ChartPanel(graficoBarras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(800,800));

        panel2.setLayout(new BorderLayout());
        panel2.setSize(new Dimension(800,800));
        panel2.add(panel,BorderLayout.NORTH);
        pack();
        repaint();
        this.add(panel2);
        this.setVisible(true);

    }

}
