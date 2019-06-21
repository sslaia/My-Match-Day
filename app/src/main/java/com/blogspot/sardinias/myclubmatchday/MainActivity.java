package com.blogspot.sardinias.myclubmatchday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /* Initialize all global the variables.
     * The local variables such as myClubClPlace are inside the corresponding methods.
     */

    int myClubGoals = 0;
    int myClubPoints = 0;
    int myClubRedCards = 0;
    int myClubYellowCards = 0;
    int myClubPenalties = 0;
    int myClubCorners = 0;
    int opponentGoals = 0;
    int opponentPoints = 0;
    int opponentRedCards = 0;
    int opponentYellowCards = 0;
    int opponentPenalties = 0;
    int opponentCorners = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* This initial value of the variable myClubTablePosition has been set manually.
         * It is placed here, because it changes according to the number of goals scored during the course of the match.
         * In the future the value of this variable would be fetched from the Premier League website, something I haven't learned yet.
         */

        int myClubTablePosition = 5;
        displayMyClubTablePosition(myClubTablePosition);

        /* The initial value of the variable myClubClPlace has been set manually, based on the value of myClubTablePosition.
         * It changes during the course of the match based on myClubTablePosition.
         */

        String myClubClPlace = "NO";
        displayMyClubClPlace(myClubClPlace);

    }

    /* Following methods will be called when a button is clicked
     *
     * My club parts followed by opponent club parts
     */

    public void addMyClubGoal (View view) {
        myClubGoals = myClubGoals + 1;
        displayMyClubGoals(myClubGoals);

        /* Some initial values needed inside the if statement
         * In a future version the values would fetched from official Premier League website
         */

        int myClubTablePosition = 5;
        int opponentTablePosition= 6;

        /* The following values depend on the previous variables' values */

        String myClubClPlace = "NO";
        String opponentClPlace = "NO";

        /* Update myClubPoints, myClubTablePosition, myClubClPlace as well as opponentPoints, opponentTablePosition and opponentClPlace when a goal is scored.
         *
         * If myClubGoals < opponentGoals then myClubPoints = 0 and visa versa.
         */

        if (myClubGoals < opponentGoals) {
            myClubPoints = 0;
            opponentPoints = 3;

            displayMyClubPoints(myClubPoints);
            displayOpponentPoints(opponentPoints);

            /* Update myClubTablePosition and opponentTablePosition.
             * It is calculated by deducting the points earned from the recent myClubTablePosition and opponentTablePosition value respectively.
             */

            myClubTablePosition = myClubTablePosition - myClubPoints;
            displayMyClubTablePosition(myClubTablePosition);

            opponentTablePosition = opponentTablePosition - opponentPoints;
            displayOpponentTablePosition(opponentTablePosition);

            /* Table position affects the Champions League qualification.
             * Update myClubClPlace and opponentClPlace according to table position
             * A club is qualified for Champions League (CL) if its table position value is < 5.
             */

            if (myClubTablePosition < 5) {
                myClubClPlace = "YES";
                displayMyClubClPlace(myClubClPlace);
            }

            else {
                myClubClPlace = "NO";
                displayMyClubClPlace(myClubClPlace);
            }

            if (opponentTablePosition < 5) {
                opponentClPlace = "YES";
                displayOpponentClPlace(opponentClPlace);
            }

            else {
                opponentClPlace = "NO";
                displayOpponentClPlace(opponentClPlace);
            }
        }

        /* If myClubGoals == opponentGoals then myClubPoints = 1, the same rule applies to opponentPoints */

        if (myClubGoals == opponentGoals) {
            myClubPoints = 1;
            opponentPoints = 1;

            displayMyClubPoints(myClubPoints);
            displayOpponentPoints(opponentPoints);

            /* Update myClubTablePosition and opponentTablePosition.
             * It is calculated by deducting the points earned from the recent myClubTablePosition and opponentTablePosition value respectively.
             */

            myClubTablePosition = myClubTablePosition - myClubPoints;
            displayMyClubTablePosition(myClubTablePosition);

            opponentTablePosition = opponentTablePosition - opponentPoints;
            displayOpponentTablePosition(opponentTablePosition);

            /* Table position affects the Champions League qualification.
             * Update myClubClPlace and opponentClPlace according to table position
             * A club is qualified for Champions League (CL) if its table position value is < 5.
             */

            if (myClubTablePosition < 5) {
                myClubClPlace = "YES";
                displayMyClubClPlace(myClubClPlace);
            }

            else {
                myClubClPlace = "NO";
                displayMyClubClPlace(myClubClPlace);
            }

            if (opponentTablePosition < 5) {
                opponentClPlace = "YES";
                displayOpponentClPlace(opponentClPlace);
            }

            else {
                opponentClPlace = "NO";
                displayOpponentClPlace(opponentClPlace);
            }
        }

        /* If myClubGoals > opponentGoals then myClubPoints = 3 */

        if (myClubGoals > opponentGoals) {
            myClubPoints = 3;
            opponentPoints = 0;

            displayMyClubPoints(myClubPoints);
            displayOpponentPoints(opponentPoints);

            /* Update myClubTablePosition and opponentTablePosition.
             * It is calculated by deducting the points earned from the recent myClubTablePosition and opponentTablePosition value respectively.
             */

            myClubTablePosition = myClubTablePosition - myClubPoints;
            displayMyClubTablePosition(myClubTablePosition);

            opponentTablePosition = opponentTablePosition - opponentPoints;
            displayOpponentTablePosition(opponentTablePosition);

            /* Table position affects the Champions League qualification.
             * Update myClubClPlace and opponentClPlace according to table position
             * A club is qualified for Champions League (CL) if its table position value is < 5.
             */

            if (myClubTablePosition < 5) {
                myClubClPlace = "YES";
                displayMyClubClPlace(myClubClPlace);
            }

            else {
                myClubClPlace = "NO";
                displayMyClubClPlace(myClubClPlace);
            }

            if (opponentTablePosition < 5) {
                opponentClPlace = "YES";
                displayOpponentClPlace(opponentClPlace);
            }

            else {
                opponentClPlace = "NO";
                displayOpponentClPlace(opponentClPlace);
            }
        }
    }

    public void addMyClubRedCard (View view) {
        myClubRedCards = myClubRedCards + 1;
        displayMyClubRedCards(myClubRedCards);
    }

    public void addMyClubYellowCard (View view) {
        myClubYellowCards = myClubYellowCards + 1;
        displayMyClubYellowCards(myClubYellowCards);
    }

    public void addMyClubPenalty (View view) {
        myClubPenalties = myClubPenalties + 1;
        displayMyClubPenalties(myClubPenalties);
    }

    public void addMyClubCorner (View view) {
        myClubCorners = myClubCorners + 1;
        displayMyClubCorners(myClubCorners);
    }

    /* The opponent club parts */

    public void addOpponentGoal (View view) {
        opponentGoals = opponentGoals + 1;
        displayOpponentGoals(opponentGoals);

        /* Some initial values needed inside the if statement
         * In a future version the values would fetched from official Premier League website
         */

        int myClubTablePosition = 5;
        int opponentTablePosition= 6;
        String myClubClPlace = "no";
        String opponentClPlace = "no";

        /* Update opponentPoints, opponentTablePosition and opponentClPlace as well as myClubPoints, myClubTablePosition and myClubClPlace */

        if (opponentGoals < myClubGoals) {
            opponentPoints = 0;
            myClubPoints = 3;

            displayOpponentPoints(opponentPoints);
            displayMyClubPoints(myClubPoints);

            /* Update the TablePosition (see above for the calculation rule */

            opponentTablePosition = opponentTablePosition - opponentPoints;
            displayOpponentTablePosition(opponentTablePosition);

            myClubTablePosition = myClubTablePosition - myClubPoints;
            displayMyClubTablePosition(myClubTablePosition);

            /* Update Champions League qualification (see above for the rules  */

            if (myClubTablePosition < 5) {
                myClubClPlace = "YES";
                displayMyClubClPlace(myClubClPlace);
            }

            if (myClubTablePosition >= 5){
                myClubClPlace = "NO";
                displayMyClubClPlace(myClubClPlace);
            }

            if (opponentTablePosition < 5) {
                opponentClPlace = "YES";
                displayOpponentClPlace(opponentClPlace);
            }

            if (opponentTablePosition >= 5) {
                opponentClPlace = "NO";
                displayOpponentClPlace(opponentClPlace);
            }
        }

        /* If opponentGoals == myClubGoals then opponentPoints = 1 */

        if (opponentGoals == myClubGoals) {
            opponentPoints = 1;
            myClubPoints = 1;

            displayOpponentPoints(opponentPoints);
            displayMyClubPoints(myClubPoints);

            /* Update the TablePosition (see above for the calculation rule */

            opponentTablePosition = opponentTablePosition - opponentPoints;
            displayOpponentTablePosition(opponentTablePosition);

            myClubTablePosition = myClubTablePosition - myClubPoints;
            displayMyClubTablePosition(myClubTablePosition);

            /* Update Champions League qualification (see above for the rules  */

            if (myClubTablePosition < 5) {
                myClubClPlace = "YES";
                displayMyClubClPlace(myClubClPlace);
            }

            if (myClubTablePosition >= 5){
                myClubClPlace = "NO";
                displayMyClubClPlace(myClubClPlace);
            }

            if (opponentTablePosition < 5) {
                opponentClPlace = "YES";
                displayOpponentClPlace(opponentClPlace);
            }

            if (opponentTablePosition >= 5) {
                opponentClPlace = "NO";
                displayOpponentClPlace(opponentClPlace);
            }
        }

        /* If opponentGoals > myClubGoals then opponentPoints = 3 */

        if (opponentGoals > myClubGoals) {
            opponentPoints = 3;
            myClubPoints = 0;

            displayOpponentPoints(opponentPoints);
            displayMyClubPoints(myClubPoints);

            /* Update the TablePosition (see above for the calculation rule */

            opponentTablePosition = opponentTablePosition - opponentPoints;
            displayOpponentTablePosition(opponentTablePosition);

            myClubTablePosition = myClubTablePosition - myClubPoints;
            displayMyClubTablePosition(myClubTablePosition);

            /* Update Champions League qualification (see above for the rules  */

            if (myClubTablePosition < 5) {
                myClubClPlace = "YES";
                displayMyClubClPlace(myClubClPlace);
            }

            else {
                myClubClPlace = "NO";
                displayMyClubClPlace(myClubClPlace);
            }

            if (opponentTablePosition < 5) {
                opponentClPlace = "YES";
                displayOpponentClPlace(opponentClPlace);
            }

            else {
                opponentClPlace = "NO";
                displayOpponentClPlace(opponentClPlace);
            }
        }

    }

    public void addOpponentRedCard (View view) {
        opponentRedCards = opponentRedCards + 1;
        displayOpponentRedCards(opponentRedCards);
    }

    public void addOpponentYellowCard (View view) {
        opponentYellowCards = opponentYellowCards + 1;
        displayOpponentYellowCards(opponentYellowCards);
    }

    public void addOpponentPenalty (View view) {
        opponentPenalties = opponentPenalties + 1;
        displayOpponentPenalties(opponentPenalties);
    }

    public void addOpponentCorner (View view) {
        opponentCorners = opponentCorners + 1;
        displayOpponentCorners(opponentCorners);
    }

    public void displayMyClubGoals(int myClubGoals) {
        TextView myClubGoalsView = findViewById(R.id.my_club_goals);
        myClubGoalsView.setText(String.valueOf(myClubGoals));

    }
    public void displayMyClubPoints(int myClubPoints) {
        TextView myClubPointsView = findViewById(R.id.my_club_points);
        myClubPointsView.setText(String.valueOf(myClubPoints));

    }

    public void displayMyClubRedCards(int myClubRedCards) {
        TextView myClubRedCardsView = findViewById(R.id.my_club_red_cards);
        myClubRedCardsView.setText(String.valueOf(myClubRedCards));

    }

    public void displayMyClubYellowCards(int myClubYellowCards) {
        TextView myClubYellowCardsView = findViewById(R.id.my_club_yellow_cards);
        myClubYellowCardsView.setText(String.valueOf(myClubYellowCards));

    }

    public void displayMyClubPenalties(int myClubPenalties) {
        TextView myClubPenaltiesView = findViewById(R.id.my_club_penalty);
        myClubPenaltiesView.setText(String.valueOf(myClubPenalties));

    }

    public void displayMyClubCorners(int myClubCorners) {
        TextView myClubCornersView = findViewById(R.id.my_club_corners);
        myClubCornersView.setText(String.valueOf(myClubCorners));

    }

    public void displayMyClubTablePosition(int myClubTablePosition) {
        TextView myClubTablePositionView = findViewById(R.id.my_table_position);
        myClubTablePositionView.setText(String.valueOf(myClubTablePosition));

    }

    public void displayMyClubClPlace(String myClubClPlace) {
        TextView myClubClPlaceView = findViewById(R.id.my_club_cl_place);
        myClubClPlaceView.setText(String.valueOf(myClubClPlace));

    }

    public void displayOpponentGoals(int opponentGoals) {
        TextView opponentGoalsView = findViewById(R.id.opponent_goals);
        opponentGoalsView.setText(String.valueOf(opponentGoals));

    }

    public void displayOpponentPoints(int opponentPoints) {
        TextView opponentPointsView = findViewById(R.id.opponent_points);
        opponentPointsView.setText(String.valueOf(opponentPoints));

    }

    public void displayOpponentRedCards(int opponentRedCards) {
        TextView opponentRedCardsView = findViewById(R.id.opponent_red_cards);
        opponentRedCardsView.setText(String.valueOf(opponentRedCards));

    }
    public void displayOpponentYellowCards(int opponentYellowCards) {
        TextView opponentYellowCardsView = findViewById(R.id.opponent_yellow_cards);
        opponentYellowCardsView.setText(String.valueOf(opponentYellowCards));

    }
    public void displayOpponentPenalties(int opponentPenalties) {
        TextView opponentPenaltiesView = findViewById(R.id.opponent_penalties);
        opponentPenaltiesView.setText(String.valueOf(opponentPenalties));

    }
    public void displayOpponentCorners(int opponentCorners) {
        TextView opponentCornersView = findViewById(R.id.opponent_corners);
        opponentCornersView.setText(String.valueOf(opponentCorners));

    }

    public void displayOpponentTablePosition(int opponentTablePosition) {
        TextView opponentTablePositionView = findViewById(R.id.opponent_table_position);
        opponentTablePositionView.setText(String.valueOf(opponentTablePosition));

    }

    public void displayOpponentClPlace(String opponentClPlace) {
        TextView opponentClPlaceView = findViewById(R.id.opponent_cl_place);
        opponentClPlaceView.setText(String.valueOf(opponentClPlace));

    }

    /* This method will be called when reset button is clicked */

    public void resetAll(View view) {

        myClubGoals = 0;
        myClubPoints = 0;
        myClubRedCards = 0;
        myClubYellowCards = 0;
        myClubPenalties = 0;
        myClubCorners = 0;
        int myClubTablePosition = 5;
        String myClubClPlace = "NO";

        opponentGoals = 0;
        opponentPoints = 0;
        opponentRedCards = 0;
        opponentYellowCards = 0;
        opponentPenalties = 0;
        opponentCorners = 0;
        int opponentTablePosition = 6;
        String opponentClPlace = "NO";

        displayMyClubGoals(myClubGoals);
        displayMyClubPoints(myClubPoints);
        displayMyClubRedCards(myClubRedCards);
        displayMyClubYellowCards(myClubYellowCards);
        displayMyClubPenalties(myClubPenalties);
        displayMyClubCorners(myClubCorners);
        displayMyClubTablePosition(myClubTablePosition);
        displayMyClubClPlace(myClubClPlace);

        displayOpponentGoals(opponentGoals);
        displayOpponentPoints(opponentPoints);
        displayOpponentRedCards(opponentRedCards);
        displayOpponentYellowCards(opponentYellowCards);
        displayOpponentPenalties(opponentPenalties);
        displayOpponentCorners(opponentCorners);
        displayOpponentTablePosition(opponentTablePosition);
        displayOpponentClPlace(opponentClPlace);

    }


}
