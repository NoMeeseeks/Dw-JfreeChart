package org.example.vistas;
import org.example.controller.pregunta1;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.example.dao.primeraPreguntaDAO;

import javax.swing.*;
import java.awt.*;
import java.util.List;

import static java.lang.String.valueOf;

public class pregunta1obj extends JFrame{
    private JPanel pregunta;
    public pregunta1obj(){
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(500, 500));
        this.setMinimumSize(new Dimension(400, 400));

        primeraPreguntaDAO obj=new primeraPreguntaDAO();
        List<pregunta1> listaPregunta=obj.obtenerPregunta1();
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        if(listaPregunta.isEmpty()){
            System.out.println("no hay cosas");
        }else {
            for(pregunta1 datosLista: listaPregunta){
                System.out.println(datosLista.getCantidad());
                datos.setValue(datosLista.getCantidad(),
                valueOf(datosLista.getEmpleadoID()),
                valueOf(datosLista.getYear()));
            }
        }

        JFreeChart graficoBarras = ChartFactory.createBarChart(
                "Ventas totales en el anio 72 por empleado",
                "anio de venta",
                "Ventas totales",
                datos,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );
        ChartPanel panel=new ChartPanel(graficoBarras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(400,200));

        pregunta.setLayout(new BorderLayout());
        pregunta.setSize(new Dimension(500,500));
        pregunta.add(panel,BorderLayout.NORTH);
        pack();
        repaint();
        this.add(pregunta);
        this.setVisible(true);

    }

}
