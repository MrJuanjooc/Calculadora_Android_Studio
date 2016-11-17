package com.example.calculadora;



import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View; 
import android.widget.Button; 
import android.widget.EditText; 


public class MainActivity extends Activity {
	
	private EditText _edit; 
	 	private Button _b1; 
	 	private Button _b2; 
	 	private Button _b3; 
	 	private Button _b4; 
	 	private Button _b5; 
	 	private Button _b6; 
	 	private Button _b7; 
	 	private Button _b8; 
    	private Button _b9; 
     	private Button _b0; 
	 	private Button _bMas; 
	 	private Button _bMenos; 
	 	private Button _bMultiplicar; 
	 	private Button _bDividir; 
	 	private Button _bIgual; 
	 	private Button _bC; 
	 	private Button _bSEN; 
	 	private Button _bCOS; 
	 	private Button _bTAN; 
	 	private Button _bLN; 
	 	
	 	private int _valor; 
	 	private double _valor2;
	 	private int _operacion; 
	 	 
	    private boolean _nuevoValor = true;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	

	

	
    _valor = 0; 
          
         _edit = (EditText)findViewById(R.id.editTextos); 
         _b0 = (Button)findViewById(R.id.button0); 
         _b1 = (Button)findViewById(R.id.button1); 
         _b2 = (Button)findViewById(R.id.button2); 
         _b3 = (Button)findViewById(R.id.button3); 
         _b4 = (Button)findViewById(R.id.button4); 
         _b5 = (Button)findViewById(R.id.button5); 
         _b6 = (Button)findViewById(R.id.button6); 
         _b7 = (Button)findViewById(R.id.button7); 
         _b8 = (Button)findViewById(R.id.button8); 
         _b9 = (Button)findViewById(R.id.button9); 
         _bMas = (Button)findViewById(R.id.buttonMas); 
         _bMenos = (Button)findViewById(R.id.buttonResta); 
         _bMultiplicar = (Button)findViewById(R.id.buttonMultiplicar); 
         _bDividir = (Button)findViewById(R.id.buttonDividir); 
         _bIgual = (Button)findViewById(R.id.buttonIgual); 
         _bC = (Button)findViewById(R.id.buttonC);
         _bSEN = (Button)findViewById(R.id.buttonsen);
         _bCOS = (Button)findViewById(R.id.buttoncos);
         _bTAN = (Button)findViewById(R.id.buttontan);
         _bLN = (Button)findViewById(R.id.buttonln);
          
         _edit.setText("0"); 
          
         View.OnClickListener lsBoton = new View.OnClickListener() { 
 			 
 			@Override 
 			public void onClick(View arg0) { 
 				_edit.setTextColor(Color.BLACK); 
 				cambiaValor(); 
 				_edit.setText(_edit.getText()+((Button)arg0).getText().toString()); 
 			} 
 		}; 
 		 
 		View.OnClickListener lsBotonOperacion = new View.OnClickListener() { 
 				 
 			@Override 
 			public void onClick(View arg0) { 
 				opera(); 
 				_operacion = 0; 
 				_nuevoValor = true; 
 				String text = ((Button)arg0).getText().toString(); 
 				if (text.equals("+")) _operacion = 0; 
 				if (text.equals("-")) _operacion = 1; 
 				if (text.equals("*")) _operacion = 2; 
 				if (text.equals("/")) _operacion = 3;
 				if (text.equals("SEN")) _operacion = 4;
 				if (text.equals("COS")) _operacion = 5;
 				if (text.equals("TAN")) _operacion = 4;
 				if (text.equals("LOG")) _operacion = 6;
 				if (text.equals("=")) _operacion = -1; 
 			} 
 		}; 
          
 		_b1.setOnClickListener(lsBoton);         
 		_b2.setOnClickListener(lsBoton); 
 		_b3.setOnClickListener(lsBoton); 
 		_b4.setOnClickListener(lsBoton); 
 		_b5.setOnClickListener(lsBoton);
 		_b6.setOnClickListener(lsBoton);         
 		_b7.setOnClickListener(lsBoton); 
 		_b8.setOnClickListener(lsBoton); 
 		_b9.setOnClickListener(lsBoton); 
 		_b0.setOnClickListener(lsBoton); 
 				 
 		_bMas.setOnClickListener(lsBotonOperacion); 
 		_bMenos.setOnClickListener(lsBotonOperacion); 
 		_bMultiplicar.setOnClickListener(lsBotonOperacion); 
 		_bDividir.setOnClickListener(lsBotonOperacion); 
 		_bIgual.setOnClickListener(lsBotonOperacion);
 		_bSEN.setOnClickListener(lsBotonOperacion);
 		_bCOS.setOnClickListener(lsBotonOperacion);
 		_bTAN.setOnClickListener(lsBotonOperacion);
 		_bLN.setOnClickListener(lsBotonOperacion);
          
         _bC.setOnClickListener(new View.OnClickListener() { 
 	 
         	@Override 
         	public void onClick(View arg0) { 
 				_edit.setText("0"); 
 				_nuevoValor = true; 
 				_operacion = -1; 
 			} 
 		}); 
         
     } 
      
     private void cambiaValor() 
     { 
     	if (_nuevoValor == true) 
     	{ 
     		_edit.setText(""); 
     		_nuevoValor = false; 
     	} 
     } 
      
     private void opera() 
     {  	 
     	switch (_operacion) 
     	{ 
     	case -1: 
     		_valor = Integer.parseInt(_edit.getText().toString()); 
     		break; 
 		case 0:	// suma 
 			try 
 			{ 
 				_valor = _valor + Integer.parseInt(_edit.getText().toString()); 
 				_edit.setText(String.valueOf(_valor)); 
 			} 
 			catch (Exception e) 
 			{ 
 				 
 			} 
 			break; 
 			 
 		case 1:	// resta 
 			try 
 			{ 
 				_valor = _valor - Integer.parseInt(_edit.getText().toString()); 
 				_edit.setText(String.valueOf(_valor)); 
 			} 
 			catch (Exception e) 
 			{ 
 				 
 			} 
 			break; 
 		case 2:	// multiplicar 
 			try 
 			{ 
 				_valor = _valor * Integer.parseInt(_edit.getText().toString()); 
 				_edit.setText(String.valueOf(_valor)); 
 			} 
 			catch (Exception e) 
 			{ 
 				 
 			} 
 			break; 
 			 
 		case 3:	// dividir 
 			try 
 			{ 
 				_valor = _valor / Integer.parseInt(_edit.getText().toString()); 
 				_edit.setText(String.valueOf(_valor)); 
 			} 
 			catch (Exception e) 
 			{ 
 				_edit.setTextColor(Color.RED); 
 				_edit.setText("Err"); 
 			} 
 			break; 
 			
 		case 4:	// seno 
 			try 
 			{ 
 			_valor2 = Math.sin(Double.parseDouble(_edit.getText().toString())); 
 				_edit.setText(String.valueOf(_valor2)) ; 
 			} 
 			catch (Exception e) 
 			{ 
 				_edit.setTextColor(Color.RED); 
 				_edit.setText("Err"); 
 			} 
 			break;
 			
 		case 5:	// coseno
 			try 
 			{ 
 				_valor2 = Math.cos(Integer.parseInt(_edit.getText().toString())); 
 				_edit.setText(String.valueOf(_valor2)) ; 
 			} 
 			catch (Exception e) 
 			{ 
 				_edit.setTextColor(Color.RED); 
 				_edit.setText("Err"); 
 			} 
 			break;
 			
 		case 6:	// tangente 
 			try 
 			{ 
 				_valor2 = Math.tan(Integer.parseInt(_edit.getText().toString())); 
 				_edit.setText(String.valueOf(_valor2)) ; 
 			} 
 			catch (Exception e) 
 			{ 
 				_edit.setTextColor(Color.RED); 
 				_edit.setText("Err"); 
 			} 
 			break;
 			
 		case 7:	// logaritmo 
 			try 
 			{ 
 				_valor2 = Math.log(Integer.parseInt(_edit.getText().toString())); 
 				_edit.setText(String.valueOf(_valor2)) ; 
 			} 
 			catch (Exception e) 
 			{ 
 				_edit.setTextColor(Color.RED); 
 				_edit.setText("Err"); 
 			} 
 			break;
 		} 
     		 
     } 
 }