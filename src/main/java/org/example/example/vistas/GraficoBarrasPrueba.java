package org.example.example.vistas;

import org.example.example.controller.usuariosController;
import org.example.example.controller.usuariosXsueldo;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.String.valueOf;

public class GraficoBarrasPrueba extends JFrame {
    private JPanel pregunta = new JPanel();

    public GraficoBarrasPrueba() {
        // visualizacion del jframe
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(500, 500));
        this.setMinimumSize(new Dimension(400, 400));

        ArrayList<usuariosXsueldo> listaCantidadXSueldo = new ArrayList<>();
        usuariosXsueldo obj = new usuariosXsueldo(1, 200);
        usuariosXsueldo obj1 = new usuariosXsueldo(1, 300);
        usuariosXsueldo obj2 = new usuariosXsueldo(1, 400);
        usuariosXsueldo obj3 = new usuariosXsueldo(2, 300);
        usuariosXsueldo obj4 = new usuariosXsueldo(2, 300);
        usuariosXsueldo obj5 = new usuariosXsueldo(3, 900);
        usuariosXsueldo obj6 = new usuariosXsueldo(3, 800);
        usuariosXsueldo obj7 = new usuariosXsueldo(4, 900);
        usuariosXsueldo obj8 = new usuariosXsueldo(4, 900);
        usuariosXsueldo obj9 = new usuariosXsueldo(5, 1000);
        listaCantidadXSueldo.add(obj);
        listaCantidadXSueldo.add(obj1);
        listaCantidadXSueldo.add(obj2);
        listaCantidadXSueldo.add(obj3);
        listaCantidadXSueldo.add(obj4);
        listaCantidadXSueldo.add(obj5);
        listaCantidadXSueldo.add(obj6);
        listaCantidadXSueldo.add(obj7);
        listaCantidadXSueldo.add(obj8);
        listaCantidadXSueldo.add(obj9);

        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        for (usuariosXsueldo datosLista : listaCantidadXSueldo) {
            datos.setValue(datosLista.getSueldo(),
                    valueOf(datosLista.getCantidad()),
                    valueOf(2));
        }

        JFreeChart graficoBarras = ChartFactory.createBarChart(
                "Sueldos X Usuarios",
                "Sueldo",
                "Cantidad",
                datos,
                PlotOrientation.VERTICAL,
                true,
                true,
                false);
        ChartPanel panel = new ChartPanel(graficoBarras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(400, 200));

        pregunta.setLayout(new BorderLayout());
        pregunta.setSize(new Dimension(500, 500));
        pregunta.add(panel, BorderLayout.NORTH);
        pack();
        repaint();
        this.add(pregunta);
        this.setVisible(true);

    }
}
