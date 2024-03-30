package org.example.proyecto.graficos;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.example.example.controller.usuariosXsueldo;
import org.example.example.dao.usuariosDAO;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class GraficoDeBarras extends JFrame {
    private JPanel jpanel = new JPanel();

    public GraficoDeBarras() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(500, 500));
        this.setMinimumSize(new Dimension(400, 400));

        // usuariosDAO usuariosDAO = new usuariosDAO();
        // List<usuariosXsueldo> usuariosXsueldos =
        // usuariosDAO.obtenerUsuariosPorSueldo();

        DefaultPieDataset datos = new DefaultPieDataset<>();

        // if (usuariosXsueldos.isEmpty()) {
        // System.out.println("no se genero la lista de usuarios x sueldo");
        // } else {
        // for (usuariosXsueldo usuario : usuariosXsueldos) {
        // datos.setValue("Sueldo:" + usuario.getSueldo(), usuario.getCantidad());
        // // datos.setValue("Sueldo "+usuario.getCantidad(),usuario.getSueldo());

        // }
        // }

        JFreeChart grafico = ChartFactory.createPieChart(
                "Cantidad de usuarios con ese sueldo",
                datos,
                true,
                true,
                false);
        ChartPanel panel = new ChartPanel(grafico);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(400, 200));

        jpanel.setLayout(new BorderLayout());
        jpanel.setSize(new Dimension(500, 500));
        jpanel.add(panel, BorderLayout.NORTH);
        pack();
        repaint();
        this.add(jpanel);
        this.setVisible(true);

    }
}
