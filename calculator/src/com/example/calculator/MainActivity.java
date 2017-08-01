package com.example.calculator;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	private EditText edittext1;
	private Button buttonb0,buttonb1,buttonb2,buttonb3,buttonb4,buttonb5,buttonb6,buttonb7,buttonb8,buttonb9,buttonb10,buttonb11,buttonb12,buttonb13,buttonb14,buttonb15,buttonb16;
	float n1,n2,n3;
	int flag;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext1=(EditText)findViewById(R.id.editText1);
        buttonb1=(Button)findViewById(R.id.button1);
        buttonb2=(Button)findViewById(R.id.button2);
        buttonb3=(Button)findViewById(R.id.button3);
        buttonb4=(Button)findViewById(R.id.button4);
        buttonb5=(Button)findViewById(R.id.button5);
        buttonb6=(Button)findViewById(R.id.button6);
        buttonb7=(Button)findViewById(R.id.button7);
        buttonb8=(Button)findViewById(R.id.button8);
        buttonb9=(Button)findViewById(R.id.button9);
        buttonb10=(Button)findViewById(R.id.button10);
        buttonb11=(Button)findViewById(R.id.button11);
        buttonb12=(Button)findViewById(R.id.button12);
        buttonb13=(Button)findViewById(R.id.button13);
        buttonb14=(Button)findViewById(R.id.button14);
        buttonb15=(Button)findViewById(R.id.button15);
        buttonb16=(Button)findViewById(R.id.button16);
        
        buttonb1.setOnClickListener(new OnClickListener()
        {
        	public void onClick(View view)
        	{
        		edittext1.setText(edittext1.getText().toString().trim()+"1");
        		
        	}
        	
        });
        buttonb2.setOnClickListener(new OnClickListener()
        {
        	public void onClick(View view)
        	{edittext1.setText(edittext1.getText().toString().trim()+"2");
        		
        	}
        	
        });
        buttonb3.setOnClickListener(new OnClickListener()
        {
        	public void onClick(View view)
        	{edittext1.setText(edittext1.getText().toString().trim()+"3");
        		
        	}
        	
    
              });
        buttonb4.setOnClickListener(new OnClickListener()
        {
        	public void onClick(View view)
        	{edittext1.setText(edittext1.getText().toString().trim()+"4");
        		
        	}
        	
        });
        buttonb5.setOnClickListener(new OnClickListener()
        {
        	public void onClick(View view)
        	{edittext1.setText(edittext1.getText().toString().trim()+"5");
        		
        	}
        	
        });
        buttonb6.setOnClickListener(new OnClickListener()
        {
        	public void onClick(View view)
        	{edittext1.setText(edittext1.getText().toString().trim()+"6");
        		
        	}
        	
        });
        buttonb7.setOnClickListener(new OnClickListener()
        {
        	public void onClick(View view)
        	{edittext1.setText(edittext1.getText().toString().trim()+"7");
        		
        	}
        	
        });
        buttonb8.setOnClickListener(new OnClickListener()
        {
        	public void onClick(View view)
        	{edittext1.setText(edittext1.getText().toString().trim()+"8");
        		
        	}
        	
        });
        buttonb9.setOnClickListener(new OnClickListener()
        {
        	public void onClick(View view)
        	{
        		edittext1.setText(edittext1.getText().toString().trim()+"9");
        		
        	}
        	
        });
        buttonb10.setOnClickListener(new OnClickListener()
        {
        	public void onClick(View view)
        	{
        		flag=1;
        		n1=Float.parseFloat(edittext1.getText().toString().trim());
        		edittext1.setText("");
        		
        		
        	}
        	
        });
        buttonb11.setOnClickListener(new OnClickListener()
        {
        	public void onClick(View view)
        	{
        		flag=2;
    		    n1=Float.parseFloat(edittext1.getText().toString().trim());
    		    edittext1.setText("");
        		
        	}
        	
        });
        buttonb12.setOnClickListener(new OnClickListener()
        {
        	public void onClick(View view)
        	{
        		flag=3;
        		n1=Float.parseFloat(edittext1.getText().toString().trim());
        		edittext1.setText("");
        		
        	}
        	
        });
        buttonb13.setOnClickListener(new OnClickListener()
        {
        	public void onClick(View view)
        	{
        		flag=4;
        		n1=Float.parseFloat(edittext1.getText().toString().trim());
        		edittext1.setText("");
        		
        	}
        	
        });
   
        buttonb14.setOnClickListener(new OnClickListener()
        {
        	public void onClick(View view)
        	{
        		n2=Float.parseFloat(edittext1.getText().toString().trim());
        		edittext1.setText("");
        		
        		switch(flag)
        		{
        		case 1:
        			n3=n1/n2;
        			break;
        		case 2:
        			n3=n1*n2;
        			break;
        		case 3:
        			n3=n1-n2;
        			break;
        		case 4:
        			n3=n1+n2;
        			break;
        		}
        		
        		edittext1.setText(String.valueOf(n3));
        		
        		
        	}
        	
        });
        buttonb15.setOnClickListener(new OnClickListener()
        {
        	public void onClick(View view)
        	{
        		edittext1.setText(edittext1.getText().toString().trim()+"0");
        		
        	}
        	
        });
        buttonb16.setOnClickListener(new OnClickListener()
        {
        	public void onClick(View view)
        	{
        		edittext1.setText("");
        		n1=n2;
        		n2=n3;
        		flag=0;
        		;
        	}
        	  });
   
   
   
   
   
   
   
   
   
   
   
   
   
            
        		
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
