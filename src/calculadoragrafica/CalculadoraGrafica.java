/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoragrafica;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public final class CalculadoraGrafica extends JFrame
{
    protected JTextField Entrada;
    protected JButton B1,B2,B3,B4,B5,B6,B7,B8,B9,B0,BI,BS,BR,BM,BD,BC;
    private Double Resultado;
    private int Tipo;
    private boolean show;
    
    public CalculadoraGrafica() 
    {
        config();
        Resultado = 0.0;
        show = false;
    }
    public void config()
    {
        this.setSize(310,315);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Color.yellow);
        this.setTitle("Calculadora");
        this.setLayout(null);
        
      Entrada = new JTextField("");
      this.add(this.Entrada);
      Entrada.setBounds(25, 25, 248, 30);
      
      B1 = new JButton("1");
      this.add(this.B1);
      B1.setBounds(25, 70, 50, 35);
      B1.addActionListener((ActionEvent e) ->
      {
          CB1(e);
      });
      B2 = new JButton("2");
      this.add(this.B2);
      B2 .setBounds(90, 70, 50, 35);
      B2.addActionListener((ActionEvent e) ->
      {
          CB2(e);
      });
      
      B3 = new JButton("3");
      this.add(this.B3);
      B3.setBounds(155, 70, 50, 35);
      B3.addActionListener((ActionEvent e) ->
      {
          CB3(e);
      });
      
      BC = new JButton("CE");
      this.add(this.BC);
      BC.setBounds(220, 70, 50, 35);
      BC.addActionListener((ActionEvent e) ->
      {
          CBC(e);
      });
      
      B4 = new JButton("4");
      this.add(this.B4);
      B4.setBounds(25, 121, 50, 35);
      B4.addActionListener((ActionEvent e) ->
      {
          CB4(e);
      });
      
      B5 = new JButton("5");
      this.add(this.B5);
      B5.setBounds(90, 121, 50, 35);
      B5.addActionListener((ActionEvent e) ->
      {
          CB5(e);
      });
      
      B6 = new JButton("6");
      this.add(this.B6);
      B6.setBounds(155, 121, 50, 35);
      B6.addActionListener((ActionEvent e) ->
      {
          CB6(e);
      });
      
      BS = new JButton("+");
      this.add(this.BS);
      BS.setBounds(220, 121, 50, 35);
      BS.addActionListener((ActionEvent e) ->
      {
          CBS(e);
      });
      
      B7 = new JButton("7");
      this.add(this.B7);
      B7.setBounds(25, 172, 50, 35);
      B7.addActionListener((ActionEvent e) ->
      {
          CB7(e);
      });
      
      B8 = new JButton("8");
      this.add(this.B8);
      B8.setBounds(90, 172, 50, 35);
      B8.addActionListener((ActionEvent e) ->
      {
          CB8(e);
      });
      
      B9 = new JButton("9");
      this.add(this.B9);
      B9.setBounds(155, 172, 50, 35);
      B9.addActionListener((ActionEvent e) ->
      {
          CB9(e);
      });
      
      BR = new JButton("-");
      this.add(this.BR);
      BR.setBounds(220, 172, 50, 35);
      BR.addActionListener((ActionEvent e) ->
      {
          CBR(e);
      });
      
      BI = new JButton("=");
      this.add(this.BI);
      BI.setBounds(25, 218, 50, 35);
      BI.addActionListener((ActionEvent e) ->
      {
          CBI(e);
      });
      
      B0 = new JButton("0");
      this.add(this.B0);
      B0.setBounds(90, 218, 50, 35);
      B0.addActionListener((ActionEvent e) ->
      {
          CB0(e);
      });
      
      BM = new JButton("*");
      this.add(this.BM);
      BM.setBounds(155, 218, 50, 35);
      BM.addActionListener((ActionEvent e) ->
      {
          CBM(e);
      });
      
      BD = new JButton("/");
      this.add(this.BD);
      BD.setBounds(220, 218, 50, 35); 
      BD.addActionListener((ActionEvent e) ->
      {
          CBD(e);
      });   
    }
    public void CB1(ActionEvent a)
    { 
        if(this.show==true)
            this.Entrada.setText("");
        String V;
        V = this.Entrada.getText();
        this.Entrada.setText(V+"1");
        this.show=false;
    }
    public void CB2(ActionEvent i)
    {
        if(this.show==true)
            this.Entrada.setText("");
        String V;
        V = this.Entrada.getText();
        this.Entrada.setText(V+"2");
        this.show=false;
    }
    public void CB3(ActionEvent o)
    {
        if(this.show==true)
            this.Entrada.setText("");
        String V;
        V = this.Entrada.getText();
        this.Entrada.setText(V+"3");
        this.show=false;
    }
    public void CB4(ActionEvent u)
    {
        if(this.show==true)
            this.Entrada.setText("");
        String V;
        V = this.Entrada.getText();
        this.Entrada.setText(V+"4");
        this.show=false;
    }
    public void CB5(ActionEvent ae)
    {
        if(this.show==true)
            this.Entrada.setText("");
        String V;
        V = this.Entrada.getText();
        this.Entrada.setText(V+"5");
        this.show=false;
    }
    public void CB6(ActionEvent ai)
    {
        if(this.show==true)
            this.Entrada.setText("");
        String V;
        V = this.Entrada.getText();
        this.Entrada.setText(V+"6");
        this.show=false;
    }
    public void CB7(ActionEvent ao)
    {
        if(this.show==true)
            this.Entrada.setText("");
        String V;
        V = this.Entrada.getText();
        this.Entrada.setText(V+"7");
        this.show=false;
    }
    public void CB8(ActionEvent au)
    {
        if(this.show==true)
            this.Entrada.setText("");
        String V;
        V = this.Entrada.getText();
        this.Entrada.setText(V+"8");
        this.show=false;
    }
    public void CB9(ActionEvent ei)
    {
        if(this.show==true)
            this.Entrada.setText("");
        String V;
        V = this.Entrada.getText();
        this.Entrada.setText(V+"9");
        this.show=false;
    }
    public void CB0(ActionEvent eo)
    {
        if(this.show==true)
            this.Entrada.setText("");
        String V;
        V = this.Entrada.getText();
        this.Entrada.setText(V+"0");
        this.show=false;
    }
    public void CBI(ActionEvent aa)
    {
        String Valor;
        Valor = this.Entrada.getText();
        Double val;
        val = Double.parseDouble(Valor);
        if(this.Tipo == 0 )
        this.Resultado = val;
        else{
            switch (this.Tipo) 
            {
                case 1:
                    this.Resultado=this.Resultado+val;
                    this.Tipo=0;
                    break;
                case 2:
                    this.Resultado = this.Resultado - val;
                    this.Tipo=0;
                    break;
                case 3:
                    this.Resultado = this.Resultado * val;
                    this.Tipo=0;
                    break;
                case 4:
                    this.Resultado = this.Resultado / val;
                    this.Tipo=0;
                    break;
                default:
                    break;
            }
        }
        this.Entrada.setText(""+this.Resultado);
    }
    public void CBS(ActionEvent eu)
    {
        String Valor;
        Valor = this.Entrada.getText();
        Double val;
        val = Double.parseDouble(Valor);
        if(this.Tipo == 0)
        this.Resultado=Double.parseDouble(Valor);
        else 
        {

            switch (this.Tipo) 
            {
                case 1:
                    this.Resultado = this.Resultado + val ;
                    break;
                case 2:
                    this.Resultado = this.Resultado - val ;
                    break;
                case 3:
                    this.Resultado = this.Resultado * val ;
                    break;
                case 4:
                    this.Resultado = this.Resultado / val ;
                    break;
                default:
                    break;
            }
        }
        this.show=true;
        this.Tipo=1;
        this.Entrada.setText(""+this.Resultado); 
    }
    public void CBR(ActionEvent io)
    {
        String Valor;
        Valor = this.Entrada.getText();
        Double val;
        val = Double.parseDouble(Valor);
        if(this.Tipo == 0)
        this.Resultado=Double.parseDouble(Valor);
        else 
        {
            switch (this.Tipo) 
            {
                case 1:
                    this.Resultado = this.Resultado + val ;
                    break;
                case 2:
                    this.Resultado = this.Resultado - val ;
                    break;
                case 3:
                    this.Resultado = this.Resultado * val ;
                    break;
                case 4:
                    this.Resultado = this.Resultado / val ;
                    break;
                default:
                    break;
            }
        }
        this.show=true;
        this.Tipo=2;
        this.Entrada.setText(""+this.Resultado);
    }
    public void CBM(ActionEvent io)
    {
        String Valor;
        Valor = this.Entrada.getText();
        Double val;
        val = Double.parseDouble(Valor);
        if(this.Tipo == 0)
        this.Resultado=Double.parseDouble(Valor);
        else 
        {
            switch (this.Tipo) 
            {
                case 1:
                    this.Resultado = this.Resultado + val ;
                    break;
                case 2:
                    this.Resultado = this.Resultado - val ;
                    break;
                case 3:
                    this.Resultado = this.Resultado * val ;
                    break;
                case 4:
                    this.Resultado = this.Resultado / val ;
                    break;
                default:
                    break;
            }
        }
        this.show=true;
        this.Tipo=3;
        this.Entrada.setText(""+this.Resultado);
    }
    public void CBD(ActionEvent ou)
    {
        String Valor;
        Valor = this.Entrada.getText();
        Double val;
        val = Double.parseDouble(Valor);
        if(this.Tipo == 0)
        this.Resultado=Double.parseDouble(Valor);    
        else 
        {
            switch (this.Tipo) 
            {
                case 1:
                    this.Resultado = this.Resultado + val ;
                    break;
                case 2:
                    this.Resultado = this.Resultado - val ;
                    break;
                case 3:
                    this.Resultado = this.Resultado * val ;
                    break;
                case 4:
                    this.Resultado = this.Resultado / val ;
                    break;
                default:
                    break;
            }
        }
        this.show=true;
        this.Tipo=4;
        this.Entrada.setText(""+this.Resultado);
    }
    public void CBC(ActionEvent uu)
    {
        this.Entrada.setText("");
        this.Resultado=0.0;
        this.Tipo = 0;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        CalculadoraGrafica calculadora = new CalculadoraGrafica();
        calculadora.setVisible(true); 
    }
}
