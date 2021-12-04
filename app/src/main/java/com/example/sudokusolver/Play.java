package com.example.sudokusolver;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;

import java.util.HashMap;
import java.util.Objects;

public class Play extends AppCompatActivity {
    public static final String DIFF = "DIFF";
    public static final String EASY = "EASY";
    public static final String MODERATE = "MODERATE";
    public static final String HARD = "HARD";
    public final int[][] fetchedGrid = new int[9][9];
    public String url = "";
    LinearLayout sudoku_grid;
    ProgressBar progressBar;
    public String val = "";
    TextView[][] arr;
    public int[][] grid;

    TextView[] buttons = new TextView[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        HashMap<String, String> values = new HashMap<>();
        values.put(EASY, "https://sugoku.herokuapp.com/board?difficulty=easy");
        values.put(MODERATE, "https://sugoku.herokuapp.com/board?difficulty=medium");
        values.put(HARD, "https://sugoku.herokuapp.com/board?difficulty=hard");
        String diff = getIntent().getStringExtra(DIFF);
        url = values.get(diff);
        sudoku_grid = findViewById(R.id.sudoku_grid);
        progressBar = findViewById(R.id.progressBar);
        sudoku_grid.setVisibility(View.GONE);
        arr = new TextView[9][9];
        fetchData();

        arr[0][0] = findViewById(R.id.no1);
        arr[0][1] = findViewById(R.id.no2);
        arr[0][2] = findViewById(R.id.no3);
        arr[0][3] = findViewById(R.id.no4);
        arr[0][4] = findViewById(R.id.no5);
        arr[0][5] = findViewById(R.id.no6);
        arr[0][6] = findViewById(R.id.no7);
        arr[0][7] = findViewById(R.id.no8);
        arr[0][8] = findViewById(R.id.no9);
        arr[1][0] = findViewById(R.id.no10);
        arr[1][1] = findViewById(R.id.no11);
        arr[1][2] = findViewById(R.id.no12);
        arr[1][3] = findViewById(R.id.no13);
        arr[1][4] = findViewById(R.id.no14);
        arr[1][5] = findViewById(R.id.no15);
        arr[1][6] = findViewById(R.id.no16);
        arr[1][7] = findViewById(R.id.no17);
        arr[1][8] = findViewById(R.id.no18);
        arr[2][0] = findViewById(R.id.no19);
        arr[2][1] = findViewById(R.id.no20);
        arr[2][2] = findViewById(R.id.no21);
        arr[2][3] = findViewById(R.id.no22);
        arr[2][4] = findViewById(R.id.no23);
        arr[2][5] = findViewById(R.id.no24);
        arr[2][6] = findViewById(R.id.no25);
        arr[2][7] = findViewById(R.id.no26);
        arr[2][8] = findViewById(R.id.no27);
        arr[3][0] = findViewById(R.id.no28);
        arr[3][1] = findViewById(R.id.no29);
        arr[3][2] = findViewById(R.id.no30);
        arr[3][3] = findViewById(R.id.no31);
        arr[3][4] = findViewById(R.id.no32);
        arr[3][5] = findViewById(R.id.no33);
        arr[3][6] = findViewById(R.id.no34);
        arr[3][7] = findViewById(R.id.no35);
        arr[3][8] = findViewById(R.id.no36);
        arr[4][0] = findViewById(R.id.no37);
        arr[4][1] = findViewById(R.id.no38);
        arr[4][2] = findViewById(R.id.no39);
        arr[4][3] = findViewById(R.id.no40);
        arr[4][4] = findViewById(R.id.no41);
        arr[4][5] = findViewById(R.id.no42);
        arr[4][6] = findViewById(R.id.no43);
        arr[4][7] = findViewById(R.id.no44);
        arr[4][8] = findViewById(R.id.no45);
        arr[5][0] = findViewById(R.id.no46);
        arr[5][1] = findViewById(R.id.no47);
        arr[5][2] = findViewById(R.id.no48);
        arr[5][3] = findViewById(R.id.no49);
        arr[5][4] = findViewById(R.id.no50);
        arr[5][5] = findViewById(R.id.no51);
        arr[5][6] = findViewById(R.id.no52);
        arr[5][7] = findViewById(R.id.no53);
        arr[5][8] = findViewById(R.id.no54);
        arr[6][0] = findViewById(R.id.no55);
        arr[6][1] = findViewById(R.id.no56);
        arr[6][2] = findViewById(R.id.no57);
        arr[6][3] = findViewById(R.id.no58);
        arr[6][4] = findViewById(R.id.no59);
        arr[6][5] = findViewById(R.id.no60);
        arr[6][6] = findViewById(R.id.no61);
        arr[6][7] = findViewById(R.id.no62);
        arr[6][8] = findViewById(R.id.no63);
        arr[7][0] = findViewById(R.id.no64);
        arr[7][1] = findViewById(R.id.no65);
        arr[7][2] = findViewById(R.id.no66);
        arr[7][3] = findViewById(R.id.no67);
        arr[7][4] = findViewById(R.id.no68);
        arr[7][5] = findViewById(R.id.no69);
        arr[7][6] = findViewById(R.id.no70);
        arr[7][7] = findViewById(R.id.no71);
        arr[7][8] = findViewById(R.id.no72);
        arr[8][0] = findViewById(R.id.no73);
        arr[8][1] = findViewById(R.id.no74);
        arr[8][2] = findViewById(R.id.no75);
        arr[8][3] = findViewById(R.id.no76);
        arr[8][4] = findViewById(R.id.no77);
        arr[8][5] = findViewById(R.id.no78);
        arr[8][6] = findViewById(R.id.no79);
        arr[8][7] = findViewById(R.id.no80);
        arr[8][8] = findViewById(R.id.no81);


        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int finalI = i;
                int finalJ = j;
                arr[i][j].setOnClickListener(view -> {
                    val = finalI + "" + finalJ;
                    for (int r = 0; r < 9; r++) {
                        for (int c = 0; c < 9; c++) {
                            arr[r][c].setBackgroundColor(ContextCompat.getColor(this, R.color.white));
                        }
                    }

                    //set the background for highlighted rows and columns
                    if(fetchedGrid[finalI][finalJ]==0) {
                        for (int k = 0; k < 9; k++) {
                            arr[finalI][k].setBackgroundColor(ContextCompat.getColor(this, R.color.lighter_grey));
                            arr[k][finalJ].setBackgroundColor(ContextCompat.getColor(this, R.color.lighter_grey));
                        }
                    }

                    //background for the selected cell
                    arr[finalI][finalJ].setBackgroundColor(ContextCompat.getColor(this, R.color.light_grey));


                    //to set the color of same number in the entire grid
                    if(!arr[finalI][finalJ].getText().equals("")) {
                        String text = arr[finalI][finalJ].getText().toString();
                        for (int r = 0; r < 9; r++) {
                            for (int c = 0; c < 9; c++) {
                                if(r!=finalI && c!=finalJ && arr[r][c].getText().equals(text)){
                                    arr[r][c].setBackgroundColor(ContextCompat.getColor(this,R.color.light_grey));
                                }
                            }
                        }
                    }

                });
            }
        }


        Button clear = findViewById(R.id.clear);
        clear.setOnClickListener(view -> {
            putData(true);
        });

        buttons[0] = findViewById(R.id.button1);
        buttons[1] = findViewById(R.id.button2);
        buttons[2] = findViewById(R.id.button3);
        buttons[3] = findViewById(R.id.button4);
        buttons[4] = findViewById(R.id.button5);
        buttons[5] = findViewById(R.id.button6);
        buttons[6] = findViewById(R.id.button7);
        buttons[7] = findViewById(R.id.button8);
        buttons[8] = findViewById(R.id.button9);


        for (int i = 0; i < 9; i++) {
            int finalI = i;
            buttons[i].setOnClickListener(view -> {
                int f = Integer.parseInt(val.charAt(0) + "");
                int s = Integer.parseInt(val.charAt(1) + "");
                if(fetchedGrid[f][s]==0) {
                    arr[f][s].setText(String.valueOf(finalI + 1));
                    grid[f][s] = finalI;
                }

            });
        }


    }

    public void fetchData() {
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(url, baseJsonResponse -> {
            JSONArray completeGrid = baseJsonResponse.optJSONArray("board");
            for (int i = 0; i < Objects.requireNonNull(completeGrid).length(); i++) {
                JSONArray current = completeGrid.optJSONArray(i);
                for (int j = 0; j < 9; j++) {
                    fetchedGrid[i][j] = Integer.parseInt(current.optString(j));
                }
            }
            grid = new int[9][9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    grid[i][j] = fetchedGrid[i][j];
                }
            }
            putData(true);

        }, error -> Log.e("LOG", error.toString()));
        MySingleton.getInstance(this).addToRequestQueue(jsonObjectRequest);
    }


    public void putData(boolean fetched) {
        String p = "";
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                p += fetchedGrid[i][j] + " ";
            }
            p += "\n";
        }
        Log.d("THE_GRID", "\n" + p);


        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int v;
                if (fetched)
                    v = fetchedGrid[i][j];
                else
                    v = grid[i][j];

                if (v != 0) {
                    arr[i][j].setText(String.valueOf(v));
                }
                else
                    arr[i][j].setText("");
//                if (v != 0) {
//                    arr[i][j].setTextColor(ContextCompat.getColor(this, R.color.teal_200));
//                }
            }
        }


        progressBar.setVisibility(View.GONE);
        sudoku_grid.setVisibility(View.VISIBLE);
    }

}