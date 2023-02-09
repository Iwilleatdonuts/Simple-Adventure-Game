public class Player {
        int playerHP;
        int playerDEF;
        int playerATK;
    public Player(int playerHP, int playerDEF, int playerATK){
        this.playerHP = playerHP;
        this.playerDEF = playerDEF;
        this.playerATK = playerATK;
    }
    public int getHP(int playerHP){
        return playerHP;
    }
    public int getDEF(int playerDEF){
        return playerDEF;
    }
    public int getATK(int playerATK){
        return playerATK;
    }
    public void setHP(int HPIncrease){
        playerHP = playerHP+HPIncrease;
        if (playerHP>100){
            playerHP = 100;
        }
    }
    public void setDEF(int DEFIncrease){
        playerDEF = DEFIncrease;
    }
    public void setATK(int ATKIncrease){
        playerATK = ATKIncrease;
    }
}
