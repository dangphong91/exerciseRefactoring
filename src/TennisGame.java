public class TennisGame {

    public static final String SCORE_0 = "Love";
    public static final String SCORE_1 = "Fifteen";
    public static final String SCORE_2 = "Thirty";
    public static final String SCORE_3 = "Forty";

    public static String getScore(int player1Score, int player2Score) {
        StringBuilder score = new StringBuilder();
        boolean equalScore = player1Score == player2Score;
        if (equalScore)
        {
            switch (player1Score)
            {
                case 0:
                    score = new StringBuilder(SCORE_0 + "-All");
                    break;
                case 1:
                    score = new StringBuilder(SCORE_1 + "-All");
                    break;
                case 2:
                    score = new StringBuilder(SCORE_2 + "-All");
                    break;
                case 3:
                    score = new StringBuilder(SCORE_3 + "-All");
                    break;
                default:
                    score = new StringBuilder("Deuce");
                    break;

            }
        }
        else if (player1Score>=4 || player2Score>=4)
        {
            int minusResult = player1Score-player2Score;
            if (minusResult==1) score = new StringBuilder("Advantage player1");
            else if (minusResult ==-1) score = new StringBuilder("Advantage player2");
            else if (minusResult>=2) score = new StringBuilder("Win for player1");
            else score = new StringBuilder("Win for player2");
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                int tempScore;
                if (i==1) tempScore = player1Score;
                else { score.append("-"); tempScore = player2Score;}
                switch(tempScore)
                {
                    case 0:
                        score.append(SCORE_0);
                        break;
                    case 1:
                        score.append(SCORE_1);
                        break;
                    case 2:
                        score.append(SCORE_2);
                        break;
                    case 3:
                        score.append(SCORE_3);
                        break;
                }
            }
        }
        return score.toString();
    }
}
