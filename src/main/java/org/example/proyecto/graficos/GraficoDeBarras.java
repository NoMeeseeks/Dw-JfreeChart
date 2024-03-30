package org.example.proyecto.graficos;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.example.proyecto.clases.ProductInventory;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import java.awt.*;
import java.util.ArrayList;

public class GraficoDeBarras extends JFrame {
    private JPanel pregunta = new JPanel();

    public GraficoDeBarras() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(900, 500));
        this.setMinimumSize(new Dimension(900, 500));
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

        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        for (ProductInventory objeto : lsProduct) {
            datos.setValue(objeto.getQuantity(), "", objeto.getNombreProducto());
        }

        JFreeChart graficoBarras = ChartFactory.createBarChart(
                "Cantidad de productos",
                "Productos",
                "Cantidad",
                datos,
                PlotOrientation.VERTICAL,
                true,
                true,
                false);
        ChartPanel panel = new ChartPanel(graficoBarras);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(900, 500));

        pregunta.setLayout(new BorderLayout());
        pregunta.setSize(new Dimension(900, 500));
        pregunta.add(panel, BorderLayout.NORTH);
        pack();
        repaint();
        this.add(pregunta);
        this.setVisible(true);

    }
}
