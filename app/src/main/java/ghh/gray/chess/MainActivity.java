package ghh.gray.chess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    char grid[][];
    List<String> possibleMoves;
    char initp=';';
    String intind="";
    boolean chance=true;
    boolean isFirstClick=true;
    TextView buttons[][];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grid=new char[8][8];
        buttons=new TextView[8][8];
        //01
        buttons[0][0]=(TextView) findViewById(R.id.button00);
        buttons[0][1]=(TextView) findViewById(R.id.button01);
        buttons[0][2]=(TextView) findViewById(R.id.button02);
        buttons[0][3]=(TextView) findViewById(R.id.button03);
        buttons[0][4]=(TextView) findViewById(R.id.button04);
        buttons[0][5]=(TextView) findViewById(R.id.button05);
        buttons[0][6]=(TextView) findViewById(R.id.button06);
        buttons[0][7]=(TextView) findViewById(R.id.button07);
        buttons[1][0]=(TextView) findViewById(R.id.button10);
        buttons[1][1]=(TextView) findViewById(R.id.button11);
        buttons[1][2]=(TextView) findViewById(R.id.button12);
        buttons[1][3]=(TextView) findViewById(R.id.button13);
        buttons[1][4]=(TextView) findViewById(R.id.button14);
        buttons[1][5]=(TextView) findViewById(R.id.button15);
        buttons[1][6]=(TextView) findViewById(R.id.button16);
        buttons[1][7]=(TextView) findViewById(R.id.button17);

        //23
        buttons[2][0]=(TextView) findViewById(R.id.button20);
        buttons[2][1]=(TextView) findViewById(R.id.button21);
        buttons[2][2]=(TextView) findViewById(R.id.button22);
        buttons[2][3]=(TextView) findViewById(R.id.button23);
        buttons[2][4]=(TextView) findViewById(R.id.button24);
        buttons[2][5]=(TextView) findViewById(R.id.button25);
        buttons[2][6]=(TextView) findViewById(R.id.button26);
        buttons[2][7]=(TextView) findViewById(R.id.button27);
        buttons[3][0]=(TextView) findViewById(R.id.button30);
        buttons[3][1]=(TextView) findViewById(R.id.button31);
        buttons[3][2]=(TextView) findViewById(R.id.button32);
        buttons[3][3]=(TextView) findViewById(R.id.button33);
        buttons[3][4]=(TextView) findViewById(R.id.button34);
        buttons[3][5]=(TextView) findViewById(R.id.button35);
        buttons[3][6]=(TextView) findViewById(R.id.button36);
        buttons[3][7]=(TextView) findViewById(R.id.button37);

        //45
        buttons[4][0]=(TextView) findViewById(R.id.button40);
        buttons[4][1]=(TextView) findViewById(R.id.button41);
        buttons[4][2]=(TextView) findViewById(R.id.button42);
        buttons[4][3]=(TextView) findViewById(R.id.button43);
        buttons[4][4]=(TextView) findViewById(R.id.button44);
        buttons[4][5]=(TextView) findViewById(R.id.button45);
        buttons[4][6]=(TextView) findViewById(R.id.button46);
        buttons[4][7]=(TextView) findViewById(R.id.button47);
        buttons[5][0]=(TextView) findViewById(R.id.button50);
        buttons[5][1]=(TextView) findViewById(R.id.button51);
        buttons[5][2]=(TextView) findViewById(R.id.button52);
        buttons[5][3]=(TextView) findViewById(R.id.button53);
        buttons[5][4]=(TextView) findViewById(R.id.button54);
        buttons[5][5]=(TextView) findViewById(R.id.button55);
        buttons[5][6]=(TextView) findViewById(R.id.button56);
        buttons[5][7]=(TextView) findViewById(R.id.button57);

        //67
        buttons[6][0]=(TextView) findViewById(R.id.button60);
        buttons[6][1]=(TextView) findViewById(R.id.button61);
        buttons[6][2]=(TextView) findViewById(R.id.button62);
        buttons[6][3]=(TextView) findViewById(R.id.button63);
        buttons[6][4]=(TextView) findViewById(R.id.button64);
        buttons[6][5]=(TextView) findViewById(R.id.button65);
        buttons[6][6]=(TextView) findViewById(R.id.button66);
        buttons[6][7]=(TextView) findViewById(R.id.button67);
        buttons[7][0]=(TextView) findViewById(R.id.button70);
        buttons[7][1]=(TextView) findViewById(R.id.button71);
        buttons[7][2]=(TextView) findViewById(R.id.button72);
        buttons[7][3]=(TextView) findViewById(R.id.button73);
        buttons[7][4]=(TextView) findViewById(R.id.button74);
        buttons[7][5]=(TextView) findViewById(R.id.button75);
        buttons[7][6]=(TextView) findViewById(R.id.button76);
        buttons[7][7]=(TextView) findViewById(R.id.button77);

        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                final int r=i,c=j;
                buttons[i][j].setOnClickListener(new TextView.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onClickedLabel(r,c,v);
                        System.out.println("CLICKED "+r+""+c);
                    }
                });
                if(i==1)
                {
                    buttons[i][j].setText("p");
                    grid[i][j]='p';
                }
                else if(i==6)
                {
                    buttons[i][j].setText("P");
                    grid[i][j]='P';
                }
                else {
                    grid[i][j] = ';';
                }
            }
        }
        buttons[0][0].setText("e");
        grid[0][0]='e';
        buttons[0][1].setText("h");
        grid[0][1]='h';
        buttons[0][2].setText("m");
        grid[0][2]='m';
        buttons[0][3].setText("q");
        grid[0][3]='q';
        buttons[0][4].setText("k");
        grid[0][4]='k';
        buttons[0][5].setText("m");
        grid[0][5]='m';
        buttons[0][6].setText("h");
        grid[0][6]='h';
        buttons[0][7].setText("e");
        grid[0][7]='e';

        buttons[7][0].setText("E");
        grid[7][0]='E';
        buttons[7][1].setText("H");
        grid[7][1]='H';
        buttons[7][2].setText("M");
        grid[7][2]='M';
        buttons[7][3].setText("Q");
        grid[7][3]='Q';
        buttons[7][4].setText("K");
        grid[7][4]='K';
        buttons[7][5].setText("M");
        grid[7][5]='M';
        buttons[7][6].setText("H");
        grid[7][6]='H';
        buttons[7][7].setText("E");
        grid[7][7]='E';
    }

    public void onClickedLabel(int r,int c,View v)
    {
        System.out.println(chance);
        System.out.println(r+""+c);
        System.out.println(isFirstClick);
        if(grid[r][c]==';' && isFirstClick)
        {
            return;
        }
        if(chance)
        {
            if(grid[r][c]==';')
            {
                if(!isFirstClick)
                {
                    if(possibleMoves.contains(r+""+c))
                    {
                        grid[r][c]=initp;
                        grid[Integer.parseInt(""+intind.charAt(0))][Integer.parseInt(""+intind.charAt(1))]=';';
                        buttons[r][c].setText(initp);
                        buttons[Integer.parseInt(""+intind.charAt(0))][Integer.parseInt(""+intind.charAt(1))].setText(intind);
                        isFirstClick=true;
                        chance=!chance;
                        return;
                    }
                    else
                    {
                        Toast.makeText(this,"Invalid Move",Toast.LENGTH_SHORT);
                        isFirstClick=true;
                        return;
                    }
                }
            }
            else if(Character.isUpperCase(grid[r][c])) {
                System.out.println("IS UPPER CASE");
                possibleMoves = ValidMoves.getMovesAI(grid, r + "" + c);
                for(String moves:possibleMoves)
                {
                    System.out.println(moves);
                }
                if (possibleMoves.size() > 0) {
                    isFirstClick = false;
                    initp = grid[r][c];
                    intind=r+""+c;
                    return;
                }
                return;
            }
            else
            {
                if(!isFirstClick)
                {
                    if(possibleMoves.contains(r+""+c))
                    {
                        grid[r][c]=initp;
                        grid[Integer.parseInt(""+intind.charAt(0))][Integer.parseInt(""+intind.charAt(1))]=';';
                        buttons[r][c].setText(initp);
                        buttons[Integer.parseInt(""+intind.charAt(0))][Integer.parseInt(""+intind.charAt(1))].setText(intind);
                        isFirstClick=true;
                        return;
                    }
                    else
                    {
                        Toast.makeText(this,"Invalid Move",Toast.LENGTH_SHORT);
                        isFirstClick=true;
                        return;
                    }
                }
            }
        }
        else
        {
            if(grid[r][c]==';')
            {
                if(!isFirstClick)
                {
                    if(possibleMoves.contains(r+""+c))
                    {
                        grid[r][c]=initp;
                        grid[Integer.parseInt(""+intind.charAt(0))][Integer.parseInt(""+intind.charAt(1))]=';';
                        buttons[r][c].setText(initp);
                        buttons[Integer.parseInt(""+intind.charAt(0))][Integer.parseInt(""+intind.charAt(1))].setText(intind);
                        isFirstClick=true;
                        chance=!chance;
                        return;
                    }
                    else {
                        Toast.makeText(this,"Invalid Move",Toast.LENGTH_SHORT);
                        isFirstClick=true;
                        return;
                    }
                }
            }
            else if(Character.isLowerCase(grid[r][c])) {
                possibleMoves = ValidMoves.getMovesUser(grid, r + "" + c);
                for(String moves:possibleMoves)
                {
                    System.out.println(moves);
                }
                if (possibleMoves.size() > 0) {
                    isFirstClick = false;
                    initp = grid[r][c];
                    intind=r+""+c;
                    return;
                }
                return;
            }
            else {
                if(!isFirstClick)
                {
                    if(possibleMoves.contains(r+""+c))
                    {
                        grid[r][c]=initp;
                        grid[Integer.parseInt(""+intind.charAt(0))][Integer.parseInt(""+intind.charAt(1))]=';';
                        buttons[r][c].setText(initp);
                        buttons[Integer.parseInt(""+intind.charAt(0))][Integer.parseInt(""+intind.charAt(1))].setText(intind);
                        isFirstClick=true;
                        return;
                    }
                    else {
                        Toast.makeText(this,"Invalid Move",Toast.LENGTH_SHORT);
                        isFirstClick=true;
                        return;
                    }
                }
            }
        }
    }
}
