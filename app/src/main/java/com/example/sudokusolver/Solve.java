package com.example.sudokusolver;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class Solve extends AppCompatActivity {

    EditText no1, no2, no3, no4, no5, no6, no7, no8, no9, no10, no11, no12, no13, no14, no15, no16, no17, no18, no19, no20, no21, no22, no23, no24, no25, no26, no27, no28, no29, no30, no31, no32, no33, no34, no35, no36, no37, no38, no39, no40, no41, no42, no43, no44, no45, no46, no47, no48, no49, no50, no51, no52, no53, no54, no55, no56, no57, no58, no59, no60, no61, no62, no63, no64, no65, no66, no67, no68, no69, no70, no71, no72, no73, no74, no75, no76, no77, no78, no79, no80, no81;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        no1 = findViewById(R.id.no1);
        no2 = findViewById(R.id.no2);
        no3 = findViewById(R.id.no3);
        no4 = findViewById(R.id.no4);
        no5 = findViewById(R.id.no5);
        no6 = findViewById(R.id.no6);
        no7 = findViewById(R.id.no7);
        no8 = findViewById(R.id.no8);
        no9 = findViewById(R.id.no9);
        no10 = findViewById(R.id.no10);
        no11 = findViewById(R.id.no11);
        no12 = findViewById(R.id.no12);
        no13 = findViewById(R.id.no13);
        no14 = findViewById(R.id.no14);
        no15 = findViewById(R.id.no15);
        no16 = findViewById(R.id.no16);
        no17 = findViewById(R.id.no17);
        no18 = findViewById(R.id.no18);
        no19 = findViewById(R.id.no19);
        no20 = findViewById(R.id.no20);
        no21 = findViewById(R.id.no21);
        no22 = findViewById(R.id.no22);
        no23 = findViewById(R.id.no23);
        no24 = findViewById(R.id.no24);
        no25 = findViewById(R.id.no25);
        no26 = findViewById(R.id.no26);
        no27 = findViewById(R.id.no27);
        no28 = findViewById(R.id.no28);
        no29 = findViewById(R.id.no29);
        no30 = findViewById(R.id.no30);
        no31 = findViewById(R.id.no31);
        no32 = findViewById(R.id.no32);
        no33 = findViewById(R.id.no33);
        no34 = findViewById(R.id.no34);
        no35 = findViewById(R.id.no35);
        no36 = findViewById(R.id.no36);
        no37 = findViewById(R.id.no37);
        no38 = findViewById(R.id.no38);
        no39 = findViewById(R.id.no39);
        no40 = findViewById(R.id.no40);
        no41 = findViewById(R.id.no41);
        no42 = findViewById(R.id.no42);
        no43 = findViewById(R.id.no43);
        no44 = findViewById(R.id.no44);
        no45 = findViewById(R.id.no45);
        no46 = findViewById(R.id.no46);
        no47 = findViewById(R.id.no47);
        no48 = findViewById(R.id.no48);
        no49 = findViewById(R.id.no49);
        no50 = findViewById(R.id.no50);
        no51 = findViewById(R.id.no51);
        no52 = findViewById(R.id.no52);
        no53 = findViewById(R.id.no53);
        no54 = findViewById(R.id.no54);
        no55 = findViewById(R.id.no55);
        no56 = findViewById(R.id.no56);
        no57 = findViewById(R.id.no57);
        no58 = findViewById(R.id.no58);
        no59 = findViewById(R.id.no59);
        no60 = findViewById(R.id.no60);
        no61 = findViewById(R.id.no61);
        no62 = findViewById(R.id.no62);
        no63 = findViewById(R.id.no63);
        no64 = findViewById(R.id.no64);
        no65 = findViewById(R.id.no65);
        no66 = findViewById(R.id.no66);
        no67 = findViewById(R.id.no67);
        no68 = findViewById(R.id.no68);
        no69 = findViewById(R.id.no69);
        no70 = findViewById(R.id.no70);
        no71 = findViewById(R.id.no71);
        no72 = findViewById(R.id.no72);
        no73 = findViewById(R.id.no73);
        no74 = findViewById(R.id.no74);
        no75 = findViewById(R.id.no75);
        no76 = findViewById(R.id.no76);
        no77 = findViewById(R.id.no77);
        no78 = findViewById(R.id.no78);
        no79 = findViewById(R.id.no79);
        no80 = findViewById(R.id.no80);
        no81 = findViewById(R.id.no81);
        Button button = findViewById(R.id.submit);
        int[][] grid = new int[9][9];
        button.setOnClickListener(view -> {
            Toast.makeText(this, "Kiya bhai", Toast.LENGTH_SHORT).show();
            grid[0][0] = Integer.parseInt(no1.getText().toString());
            grid[0][1] = Integer.parseInt(no2.getText().toString());
            grid[0][2] = Integer.parseInt(no3.getText().toString());
            grid[0][3] = Integer.parseInt(no4.getText().toString());
            grid[0][4] = Integer.parseInt(no5.getText().toString());
            grid[0][5] = Integer.parseInt(no6.getText().toString());
            grid[0][6] = Integer.parseInt(no7.getText().toString());
            grid[0][7] = Integer.parseInt(no8.getText().toString());
            grid[0][8] = Integer.parseInt(no9.getText().toString());
            grid[1][0] = Integer.parseInt(no10.getText().toString());
            grid[1][1] = Integer.parseInt(no11.getText().toString());
            grid[1][2] = Integer.parseInt(no12.getText().toString());
            grid[1][3] = Integer.parseInt(no13.getText().toString());
            grid[1][4] = Integer.parseInt(no14.getText().toString());
            grid[1][5] = Integer.parseInt(no15.getText().toString());
            grid[1][6] = Integer.parseInt(no16.getText().toString());
            grid[1][7] = Integer.parseInt(no17.getText().toString());
            grid[1][8] = Integer.parseInt(no18.getText().toString());
            grid[2][0] = Integer.parseInt(no19.getText().toString());
            grid[2][1] = Integer.parseInt(no20.getText().toString());
            grid[2][2] = Integer.parseInt(no21.getText().toString());
            grid[2][3] = Integer.parseInt(no22.getText().toString());
            grid[2][4] = Integer.parseInt(no23.getText().toString());
            grid[2][5] = Integer.parseInt(no24.getText().toString());
            grid[2][6] = Integer.parseInt(no25.getText().toString());
            grid[2][7] = Integer.parseInt(no26.getText().toString());
            grid[2][8] = Integer.parseInt(no27.getText().toString());
            grid[3][0] = Integer.parseInt(no28.getText().toString());
            grid[3][1] = Integer.parseInt(no29.getText().toString());
            grid[3][2] = Integer.parseInt(no30.getText().toString());
            grid[3][3] = Integer.parseInt(no31.getText().toString());
            grid[3][4] = Integer.parseInt(no32.getText().toString());
            grid[3][5] = Integer.parseInt(no33.getText().toString());
            grid[3][6] = Integer.parseInt(no34.getText().toString());
            grid[3][7] = Integer.parseInt(no35.getText().toString());
            grid[3][8] = Integer.parseInt(no36.getText().toString());
            grid[4][0] = Integer.parseInt(no37.getText().toString());
            grid[4][1] = Integer.parseInt(no38.getText().toString());
            grid[4][2] = Integer.parseInt(no39.getText().toString());
            grid[4][3] = Integer.parseInt(no40.getText().toString());
            grid[4][4] = Integer.parseInt(no41.getText().toString());
            grid[4][5] = Integer.parseInt(no42.getText().toString());
            grid[4][6] = Integer.parseInt(no43.getText().toString());
            grid[4][7] = Integer.parseInt(no44.getText().toString());
            grid[4][8] = Integer.parseInt(no45.getText().toString());
            grid[5][0] = Integer.parseInt(no46.getText().toString());
            grid[5][1] = Integer.parseInt(no47.getText().toString());
            grid[5][2] = Integer.parseInt(no48.getText().toString());
            grid[5][3] = Integer.parseInt(no49.getText().toString());
            grid[5][4] = Integer.parseInt(no50.getText().toString());
            grid[5][5] = Integer.parseInt(no51.getText().toString());
            grid[5][6] = Integer.parseInt(no52.getText().toString());
            grid[5][7] = Integer.parseInt(no53.getText().toString());
            grid[5][8] = Integer.parseInt(no54.getText().toString());
            grid[6][0] = Integer.parseInt(no55.getText().toString());
            grid[6][1] = Integer.parseInt(no56.getText().toString());
            grid[6][2] = Integer.parseInt(no57.getText().toString());
            grid[6][3] = Integer.parseInt(no58.getText().toString());
            grid[6][4] = Integer.parseInt(no59.getText().toString());
            grid[6][5] = Integer.parseInt(no60.getText().toString());
            grid[6][6] = Integer.parseInt(no61.getText().toString());
            grid[6][7] = Integer.parseInt(no62.getText().toString());
            grid[6][8] = Integer.parseInt(no63.getText().toString());
            grid[7][0] = Integer.parseInt(no64.getText().toString());
            grid[7][1] = Integer.parseInt(no65.getText().toString());
            grid[7][2] = Integer.parseInt(no66.getText().toString());
            grid[7][3] = Integer.parseInt(no67.getText().toString());
            grid[7][4] = Integer.parseInt(no68.getText().toString());
            grid[7][5] = Integer.parseInt(no69.getText().toString());
            grid[7][6] = Integer.parseInt(no70.getText().toString());
            grid[7][7] = Integer.parseInt(no71.getText().toString());
            grid[7][8] = Integer.parseInt(no72.getText().toString());
            grid[8][0] = Integer.parseInt(no73.getText().toString());
            grid[8][1] = Integer.parseInt(no74.getText().toString());
            grid[8][2] = Integer.parseInt(no75.getText().toString());
            grid[8][3] = Integer.parseInt(no76.getText().toString());
            grid[8][4] = Integer.parseInt(no77.getText().toString());
            grid[8][5] = Integer.parseInt(no78.getText().toString());
            grid[8][6] = Integer.parseInt(no79.getText().toString());
            grid[8][7] = Integer.parseInt(no80.getText().toString());
            grid[8][8] = Integer.parseInt(no81.getText().toString());
            if (solveSuduko(grid, 0, 0)) {
                Toast.makeText(this, "Abe aalsi kabhi toh khud solve kar", Toast.LENGTH_LONG).show();
                for (int i = 0; i < 9; i++) {
                    String temp = "";
                    for (int j = 0; j < 9; j++) {
                        temp += grid[i][j] + " ";
                    }
                    no1.setText(String.valueOf(grid[0][0]));
                    no2.setText(String.valueOf(grid[0][1]));
                    no3.setText(String.valueOf(grid[0][2]));
                    no4.setText(String.valueOf(grid[0][3]));
                    no5.setText(String.valueOf(grid[0][4]));
                    no6.setText(String.valueOf(grid[0][5]));
                    no7.setText(String.valueOf(grid[0][6]));
                    no8.setText(String.valueOf(grid[0][7]));
                    no9.setText(String.valueOf(grid[0][8]));
                    no10.setText(String.valueOf(grid[1][0]));
                    no11.setText(String.valueOf(grid[1][1]));
                    no12.setText(String.valueOf(grid[1][2]));
                    no13.setText(String.valueOf(grid[1][3]));
                    no14.setText(String.valueOf(grid[1][4]));
                    no15.setText(String.valueOf(grid[1][5]));
                    no16.setText(String.valueOf(grid[1][6]));
                    no17.setText(String.valueOf(grid[1][7]));
                    no18.setText(String.valueOf(grid[1][8]));
                    no19.setText(String.valueOf(grid[2][0]));
                    no20.setText(String.valueOf(grid[2][1]));
                    no21.setText(String.valueOf(grid[2][2]));
                    no22.setText(String.valueOf(grid[2][3]));
                    no23.setText(String.valueOf(grid[2][4]));
                    no24.setText(String.valueOf(grid[2][5]));
                    no25.setText(String.valueOf(grid[2][6]));
                    no26.setText(String.valueOf(grid[2][7]));
                    no27.setText(String.valueOf(grid[2][8]));
                    no28.setText(String.valueOf(grid[3][0]));
                    no29.setText(String.valueOf(grid[3][1]));
                    no30.setText(String.valueOf(grid[3][2]));
                    no31.setText(String.valueOf(grid[3][3]));
                    no32.setText(String.valueOf(grid[3][4]));
                    no33.setText(String.valueOf(grid[3][5]));
                    no34.setText(String.valueOf(grid[3][6]));
                    no35.setText(String.valueOf(grid[3][7]));
                    no36.setText(String.valueOf(grid[3][8]));
                    no37.setText(String.valueOf(grid[4][0]));
                    no38.setText(String.valueOf(grid[4][1]));
                    no39.setText(String.valueOf(grid[4][2]));
                    no40.setText(String.valueOf(grid[4][3]));
                    no41.setText(String.valueOf(grid[4][4]));
                    no42.setText(String.valueOf(grid[4][5]));
                    no43.setText(String.valueOf(grid[4][6]));
                    no44.setText(String.valueOf(grid[4][7]));
                    no45.setText(String.valueOf(grid[4][8]));
                    no46.setText(String.valueOf(grid[5][0]));
                    no47.setText(String.valueOf(grid[5][1]));
                    no48.setText(String.valueOf(grid[5][2]));
                    no49.setText(String.valueOf(grid[5][3]));
                    no50.setText(String.valueOf(grid[5][4]));
                    no51.setText(String.valueOf(grid[5][5]));
                    no52.setText(String.valueOf(grid[5][6]));
                    no53.setText(String.valueOf(grid[5][7]));
                    no54.setText(String.valueOf(grid[5][8]));
                    no55.setText(String.valueOf(grid[6][0]));
                    no56.setText(String.valueOf(grid[6][1]));
                    no57.setText(String.valueOf(grid[6][2]));
                    no58.setText(String.valueOf(grid[6][3]));
                    no59.setText(String.valueOf(grid[6][4]));
                    no60.setText(String.valueOf(grid[6][5]));
                    no61.setText(String.valueOf(grid[6][6]));
                    no62.setText(String.valueOf(grid[6][7]));
                    no63.setText(String.valueOf(grid[6][8]));
                    no64.setText(String.valueOf(grid[7][0]));
                    no65.setText(String.valueOf(grid[7][1]));
                    no66.setText(String.valueOf(grid[7][2]));
                    no67.setText(String.valueOf(grid[7][3]));
                    no68.setText(String.valueOf(grid[7][4]));
                    no69.setText(String.valueOf(grid[7][5]));
                    no70.setText(String.valueOf(grid[7][6]));
                    no71.setText(String.valueOf(grid[7][7]));
                    no72.setText(String.valueOf(grid[7][8]));
                    no73.setText(String.valueOf(grid[8][0]));
                    no74.setText(String.valueOf(grid[8][1]));
                    no75.setText(String.valueOf(grid[8][2]));
                    no76.setText(String.valueOf(grid[8][3]));
                    no77.setText(String.valueOf(grid[8][4]));
                    no78.setText(String.valueOf(grid[8][5]));
                    no79.setText(String.valueOf(grid[8][6]));
                    no80.setText(String.valueOf(grid[8][7]));
                    no81.setText(String.valueOf(grid[8][8]));

                }
            } else {
                Toast.makeText(this, "Sol Exsist nahi karta bhaiiiii..", Toast.LENGTH_LONG).show();
            }
        });
        Button clear = findViewById(R.id.clear);
        clear.setOnClickListener(view -> {
            no1.setText("0");
            no2.setText("0");
            no3.setText("0");
            no4.setText("0");
            no5.setText("0");
            no6.setText("0");
            no7.setText("0");
            no8.setText("0");
            no9.setText("0");
            no10.setText("0");
            no11.setText("0");
            no12.setText("0");
            no13.setText("0");
            no14.setText("0");
            no15.setText("0");
            no16.setText("0");
            no17.setText("0");
            no18.setText("0");
            no19.setText("0");
            no20.setText("0");
            no21.setText("0");
            no22.setText("0");
            no23.setText("0");
            no24.setText("0");
            no25.setText("0");
            no26.setText("0");
            no27.setText("0");
            no28.setText("0");
            no29.setText("0");
            no30.setText("0");
            no31.setText("0");
            no32.setText("0");
            no33.setText("0");
            no34.setText("0");
            no35.setText("0");
            no36.setText("0");
            no37.setText("0");
            no38.setText("0");
            no39.setText("0");
            no40.setText("0");
            no41.setText("0");
            no42.setText("0");
            no43.setText("0");
            no44.setText("0");
            no45.setText("0");
            no46.setText("0");
            no47.setText("0");
            no48.setText("0");
            no49.setText("0");
            no50.setText("0");
            no51.setText("0");
            no52.setText("0");
            no53.setText("0");
            no54.setText("0");
            no55.setText("0");
            no56.setText("0");
            no57.setText("0");
            no58.setText("0");
            no59.setText("0");
            no60.setText("0");
            no61.setText("0");
            no62.setText("0");
            no63.setText("0");
            no64.setText("0");
            no65.setText("0");
            no66.setText("0");
            no67.setText("0");
            no68.setText("0");
            no69.setText("0");
            no70.setText("0");
            no71.setText("0");
            no72.setText("0");
            no73.setText("0");
            no74.setText("0");
            no75.setText("0");
            no76.setText("0");
            no77.setText("0");
            no78.setText("0");
            no79.setText("0");
            no80.setText("0");
            no81.setText("0");
        });
        for(int i =0;i<9;i++){
            String temp = "";
            for(int j =0;j<9;j++){
                temp += grid[i][j]+" ";
            }
            Log.d("TheCollected", temp);
        }
//        int grid[][] = {{3, 4, 7, 5, 0, 0, 0, 2, 0}, {9, 0, 8, 0, 0, 6, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1},
//                {0, 0, 0, 7, 0, 0, 0, 0, 3}, {2, 3, 0, 0, 0, 0, 0, 7, 8}, {4, 0, 0, 0, 0, 9, 0, 0, 0},
//                {8, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 9, 0, 0, 6, 0, 2}, {0, 9, 0, 0, 0, 4, 1, 5, 7}};


    }

    static int N = 9;

    /*
     * Takes a partially filled-in grid and attempts to assign values to all
     * unassigned locations in such a way to meet the requirements for Sudoku
     * solution (non-duplication across rows, columns, and boxes)
     */
    static boolean solveSuduko(int[][] grid, int row, int col) {

        if (row == N - 1 && col == N)
            return true;

        if (col == N) {
            row++;
            col = 0;
        }

        if (grid[row][col] != 0)
            return solveSuduko(grid, row, col + 1);

        for (int num = 1; num < 10; num++) {
            if (isSafe(grid, row, col, num)) {
                grid[row][col] = num;
                if (solveSuduko(grid, row, col + 1))
                    return true;
            }
            grid[row][col] = 0;
        }
        return false;
    }

    static void print(int[][] grid) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(grid[i][j] + " ");
            System.out.println();
        }
    }

    static boolean isSafe(int[][] grid, int row, int col, int num) {
        for (int x = 0; x <= 8; x++)
            if (grid[row][x] == num)
                return false;

        for (int x = 0; x <= 8; x++)
            if (grid[x][col] == num)
                return false;

        int startRow = row - row % 3, startCol = col - col % 3;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (grid[i + startRow][j + startCol] == num)
                    return false;

        return true;
    }
}