package org.example.vistas;

import org.example.controller.Usuario;
import org.example.dao.usuariosDAO;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class graficoCircular extends JFrame{
    private JPanel jpanel;
    public graficoCircular(){
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(500, 500));
        this.setMinimumSize(new Dimension(400, 400));

        usuariosDAO usuariosDAO=new usuariosDAO();
        List<Usuario> usuarios=usuariosDAO.obtenerUsuariosXGenero();
        DefaultPieDataset datos = new DefaultPieDataset<>();
        if(usuarios.isEmpty()){
            System.out.println("no hay cosas");
        }else {
            for(Usuario usuario: usuarios){
                datos.setValue(usuario.getGenero(),usuario.getCantidad());
            }
        }

        JFreeChart grafico = ChartFactory.createPieChart(
                "Grafico de Genero en la empresa",
                datos,
                true,
                true,
                false
        );
        ChartPanel panel=new ChartPanel(grafico);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(400,200));

        jpanel.setLayout(new BorderLayout());
        jpanel.setSize(new Dimension(500,500));
        jpanel.add(panel,BorderLayout.NORTH);
        pack();
        repaint();
        this.add(jpanel);
        this.setVisible(true);

    }
}
