package com.company.module;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "users")
public class User {
    public static final String BANK = "bank";
    public static final String GAME_CODE = "gameCode";
    public static final String TARGET_NUMBER = "targetNumber";

    @DatabaseField(id = true)
    private String chatId;
    @DatabaseField(columnName = BANK)
    private int bank;
    @DatabaseField(columnName = GAME_CODE)
    private String gameCode;
    @DatabaseField(columnName = TARGET_NUMBER)
    private int targetNumber;

    public User() {
        // ORMLite needs a no-arg constructor
    }

    /**
     *
     * @return
     */
    public String getGameCode() {
        return gameCode;
    }

    /**
     *
     * @param gameCode
     */
    public void setGameCode(String gameCode) {
        this.gameCode = gameCode;
    }


    /**
     * Метод для обращения к банку пользователя.
     *
     * @return банк пользователя.
     */
    public int getBank() {

        return this.bank;
    }

    /**
     * Метод для обращения к логину пользователя.
     *
     * @return логин пользователя.
     */
    public String getChatId() {
        return this.chatId;
    }

    /**
     * Метод для установления банка.
     *
     * @param bank банк пользователя.
     */
    public void setBank(int bank) {
        this.bank = bank;
    }

    /**
     *
     * @param chatId
     */
    public void setChatId(String chatId) {
        this.chatId = chatId;
    }


}
