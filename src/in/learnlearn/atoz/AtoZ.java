package in.learnlearn.atoz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.graphics.Color;
import java.util.Random;
//import java.lang.String;

public class AtoZ extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        changeColor();
        TextView alpha = (TextView) findViewById(R.id.alpha);
        alpha.setOnClickListener (new View.OnClickListener() {
        public void onClick(View view){
        TextView alpha = (TextView) findViewById(R.id.alpha);
        //String nextL = String(nextLetter(alpha.getText().charAt(0)));
        //alpha.setText(nextLetter(alpha.getText().charAt(0)).toString());
        //alpha.setText(nextL);
      //alpha.setText('B'.toString());
        changeText(alpha.getText().charAt(0));
        changeColor();
        }
        });
    }
    public void changeColor(){
    TextView alpha=(TextView)findViewById(R.id.alpha);
    
    int color;
    Random rnd = new Random(); 
    color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));   
//    view.setBackgroundColor(color);
    alpha.setBackgroundColor(color);
    color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    alpha.setTextColor(color);
    }
public void changeText(char curLetter){
TextView alpha= (TextView) findViewById(R.id.alpha);
switch (curLetter){
case 'A':
  alpha.setText("B");   return; 
  
case 'B':
  alpha.setText("C"); 
return; 
  case 'C':
  alpha.setText("D"); 
return; 
  case 'D':
  alpha.setText("E"); 
return; 
  case 'E':
  alpha.setText("F"); 
return; 
  case 'F':
  alpha.setText("G"); 
return; 
  case 'G':
  alpha.setText("H"); 
return; 
  case 'H':
  alpha.setText("I"); 
return; 
  case 'I':
  alpha.setText("J"); 
return; 
  case 'J':
  alpha.setText("K"); 
return; 
  case 'K':
  alpha.setText("L"); 
return; 
  case 'L':
  alpha.setText("M"); 
return; 
  case 'M':
  alpha.setText("N"); 
return; 
  case 'N':
  alpha.setText("O"); 
return; 
  case 'O':
  alpha.setText("P"); 
return; 
  case 'P':
  alpha.setText("Q"); 
return; 
  case 'Q':
  alpha.setText("R"); 
return; 
  case 'R':
  alpha.setText("S"); 
return; 
  case 'S':
  alpha.setText("T"); 
return; 
  case 'T':
  alpha.setText("U"); 
return; 
  case 'U':
  alpha.setText("V"); 
return; 
  case 'V':
  alpha.setText("W"); 
return; 
  case 'W':
  alpha.setText("X"); 
return; 
  case 'X':
  alpha.setText("Y"); 
return; 
  case 'Y':
  alpha.setText("Z"); 
return; 
  case 'Z':
  alpha.setText("A"); 
return; 
  
}
return;
}
}
