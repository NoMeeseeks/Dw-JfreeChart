package org.example.proyecto.graficos;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.example.proyecto.clases.ProductInventory;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import java.awt.*;
import java.util.ArrayList;

public class GraficoCircular extends JFrame {
    private JPanel jpanel = new JPanel();

    public GraficoCircular() {
        // para perzonalizar el java swing
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(500, 500));
        this.setMinimumSize(new Dimension(400, 400));

        // datos enviados para el grafico
        DefaultPieDataset datos = new DefaultPieDataset<>();

        // Datos de prueba
        ArrayList<ProductInventory> lsProduct = new ArrayList<>();
        ProductInventory objProduct0 = new ProductInventory(10, "Procesadores");
        ProductInventory objProduct1 = new ProductInventory(5, "Laptop");
        ProductInventory objProduct2 = new ProductInventory(89, "PC");
        ProductInventory objProduct3 = new ProductInventory(45, "Mouse");
        ProductInventory objProduct4 = new ProductInventory(34, "Parlantes");
        ProductInventory objProduct5 = new ProductInventory(89, "Microfono");
        ProductInventory objProduct6 = new ProductInventory(23, "Camara");
        ProductInventory objProduct7 = new ProductInventory(4, "Torre");
        lsProduct.add(objProduct0);
        lsProduct.add(objProduct1);
        lsProduct.add(objProduct2);
        lsProduct.add(objProduct3);
        lsProduct.add(objProduct4);
        lsProduct.add(objProduct5);
        lsProduct.add(objProduct6);
        lsProduct.add(objProduct7);

        if (lsProduct.isEmpty()) {
            System.out.println("Aqui se debe llamar a la base");
        } else {
            for (ProductInventory objeto : lsProduct) {
                datos.setValue(objeto.getNombreProducto(), objeto.getQuantity());
            }
        }
        // creacion del grafico
        JFreeChart grafico = ChartFactory.createPieChart(
                "Cantidad de productos", // nombre del grafico
                datos,
                true,
                true,
                false);
        ChartPanel panel = new ChartPanel(grafico);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(400, 200));

        // se agrega el grafico al panel
        jpanel.setLayout(new BorderLayout());
        jpanel.setSize(new Dimension(500, 500));
        jpanel.add(panel, BorderLayout.NORTH);
        pack();
        repaint();
        this.add(jpanel);
        this.setVisible(true);

    }
}
