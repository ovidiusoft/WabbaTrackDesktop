package com.ediposouza.data

/**
 * Created by Edipo on 18/03/2017.
 */
object DHash {

    val SCREEN_MAIN = "Main"
    val SCREEN_MAIN_MODE_CASUAL = "Casual"
    val SCREEN_MAIN_MODE_RANKED = "Ranked"
    val SCREEN_MAIN_MODE_PRATICE = "Pratice"
    val SCREEN_GAME = "Game"

    val SCREEN_ARENA_CLASSES = "ArenaClasses"
    val SCREEN_ARENA_PICK_01 = "ArenaPick01"
    val SCREEN_ARENA_PICK_02 = "ArenaPick02"
    val SCREEN_ARENA_PICK_03 = "ArenaPick03"
    val SCREEN_ARENA_PICK_04 = "ArenaPick04"
    val SCREEN_ARENA_PICK_05 = "ArenaPick05"
    val SCREEN_ARENA_PICK_06 = "ArenaPick06"
    val SCREEN_ARENA_PICK_07 = "ArenaPick07"
    val SCREEN_ARENA_PICK_08 = "ArenaPick08"
    val SCREEN_ARENA_PICK_09 = "ArenaPick09"
    val SCREEN_ARENA_PICK_10 = "ArenaPick10"
    val SCREEN_ARENA_PICK_11 = "ArenaPick11"
    val SCREEN_ARENA_PICK_12 = "ArenaPick12"
    val SCREEN_ARENA_PICK_13 = "ArenaPick13"
    val SCREEN_ARENA_PICK_14 = "ArenaPick14"
    val SCREEN_ARENA_PICK_15 = "ArenaPick15"
    val SCREEN_ARENA_PICK_16 = "ArenaPick16"
    val SCREEN_ARENA_PICK_17 = "ArenaPick17"
    val SCREEN_ARENA_PICK_18 = "ArenaPick18"
    val SCREEN_ARENA_PICK_19 = "ArenaPick19"
    val SCREEN_ARENA_PICK_20 = "ArenaPick20"
    val SCREEN_ARENA_PICK_21 = "ArenaPick21"
    val SCREEN_ARENA_PICK_22 = "ArenaPick22"
    val SCREEN_ARENA_PICK_23 = "ArenaPick23"
    val SCREEN_ARENA_PICK_24 = "ArenaPick24"
    val SCREEN_ARENA_PICK_25 = "ArenaPick25"
    val SCREEN_ARENA_PICK_26 = "ArenaPick26"
    val SCREEN_ARENA_PICK_27 = "ArenaPick27"
    val SCREEN_ARENA_PICK_28 = "ArenaPick28"
    val SCREEN_ARENA_PICK_29 = "ArenaPick29"
    val SCREEN_ARENA_PICK_30 = "ArenaPick30"
    val SCREEN_ARENA_DASHBOARD = "ArenaDashboard"

    val PLAYER_GAME_FIRST = "PlayFirst"
    val PLAYER_GAME_SECOND = "PlaySecond"
    val GAME_WIN = "Win"
    val GAME_WIN2 = "Win2"
    val GAME_LOSS = "Loss"
    val GAME_LOSS2 = "Loss2"
    val GAME_YOUR_TURN = "YourTurn"

    val SCREENS_ARENA_PICK = listOf(
            SCREEN_ARENA_PICK_01, SCREEN_ARENA_PICK_02, SCREEN_ARENA_PICK_03, SCREEN_ARENA_PICK_04, SCREEN_ARENA_PICK_05,
            SCREEN_ARENA_PICK_06, SCREEN_ARENA_PICK_07, SCREEN_ARENA_PICK_08, SCREEN_ARENA_PICK_09, SCREEN_ARENA_PICK_10,
            SCREEN_ARENA_PICK_11, SCREEN_ARENA_PICK_12, SCREEN_ARENA_PICK_13, SCREEN_ARENA_PICK_14, SCREEN_ARENA_PICK_15,
            SCREEN_ARENA_PICK_16, SCREEN_ARENA_PICK_17, SCREEN_ARENA_PICK_18, SCREEN_ARENA_PICK_19, SCREEN_ARENA_PICK_20,
            SCREEN_ARENA_PICK_21, SCREEN_ARENA_PICK_22, SCREEN_ARENA_PICK_23, SCREEN_ARENA_PICK_24, SCREEN_ARENA_PICK_25,
            SCREEN_ARENA_PICK_26, SCREEN_ARENA_PICK_27, SCREEN_ARENA_PICK_28, SCREEN_ARENA_PICK_29, SCREEN_ARENA_PICK_30)

    val SCREENS_LIST = mapOf(
            "0010111001011011010101001010010010110010010110110" to SCREEN_MAIN,
            "1011011101011000101011001010001010011001100101010" to SCREEN_MAIN_MODE_CASUAL,
            "1011010001011011101101011010001111000001011101100" to SCREEN_MAIN_MODE_RANKED,
            "1001001100000011001100101100000100110010111110011" to SCREEN_MAIN_MODE_PRATICE,
            "1100111000101001110000111100001100001111111000011" to SCREEN_GAME,
            "0011111011010111011111010101111111110101111111111" to SCREEN_ARENA_CLASSES,
            "0111010010101011111011111010111111110101011110111" to SCREEN_ARENA_DASHBOARD)

    val SCREENS_PICK_LIST = mapOf(
            "1100001110011000110111100110101100101100001001101" to SCREEN_ARENA_PICK_01,
            "1100001110011000110110011000110110100100111110111" to SCREEN_ARENA_PICK_02,
            "1100001110010000110110110000100111101100101100101" to SCREEN_ARENA_PICK_03,
            "1100001110010000110110110010100110101100101100111" to SCREEN_ARENA_PICK_04,
            "1100001110010000100111100110100100101100111101111" to SCREEN_ARENA_PICK_05,
            "1100001110010000110110110010100110001100101100111" to SCREEN_ARENA_PICK_06,
            "1100001100111100110001001110011001011011010011011" to SCREEN_ARENA_PICK_07,
            "1110001100011001110011001100011001111011010010010" to SCREEN_ARENA_PICK_08,
            "1100001100011001100111001100011000111011110010010" to SCREEN_ARENA_PICK_09,
            "1100001110011000110111100110100110101100001001101" to SCREEN_ARENA_PICK_10,
            "1110001110011001100111001101011000110011000010010" to SCREEN_ARENA_PICK_11,
            "1101001110011001100111101101001101101100001001101" to SCREEN_ARENA_PICK_12,
            "1100001110011001100001100111001001110011010011001" to SCREEN_ARENA_PICK_13,
            "1101001110011101100101100101011001110010010011000" to SCREEN_ARENA_PICK_14,
            "1100001100110001100111001101011001110011100011000" to SCREEN_ARENA_PICK_15,
            "1101001110011101100111101100001001111010110011100" to SCREEN_ARENA_PICK_16,
            "1110001110011001100111001100011000110011110011010" to SCREEN_ARENA_PICK_17,
            "1111001110011101100001100111001001111011010011011" to SCREEN_ARENA_PICK_18,
            "1110001110011001100011001110011001110011010011000" to SCREEN_ARENA_PICK_19,
            "1100001110011001100111001100011000110011110011010" to SCREEN_ARENA_PICK_20,
            "1100111001011011001111001101011000110011000110011" to SCREEN_ARENA_PICK_21,
            "1100001110011001100011101101001001011011010011011" to SCREEN_ARENA_PICK_22,
            "1110001100011001100011101100011000110011000010011" to SCREEN_ARENA_PICK_23,
            "1100001100111101100111101100011000110011000010011" to SCREEN_ARENA_PICK_24,
            "1100101101110011101111001101011001110011000110011" to SCREEN_ARENA_PICK_25,
            "1100001100011101100111001100011000110011010011010" to SCREEN_ARENA_PICK_26,
            "1100111001001011001111001100011000110011000110010" to SCREEN_ARENA_PICK_27,
            "1110001100011101100111001100011000110011010010011" to SCREEN_ARENA_PICK_28,
            "1100111001001011001111001100011001110011000110010" to SCREEN_ARENA_PICK_29,
            "1100111001001111001111001100011000110011100110011" to SCREEN_ARENA_PICK_30
    )

    val CLASS_PICK_LIST = mapOf(
            "0111100110100010101000100111100110111011111110011" to "Archer",
            "1111010111010001100011111011101111110111110011111" to "Assassin",
            "0001110110010111011110111011101101110101111110110" to "Battlemage",
            "0111000001110111010111111011101011101001110001111" to "Crusader",
            "0111000111000011010110110000011111110011110111111" to "Mage",
            "1101110011011001101011111001101101111111111001111" to "Monk",
            "1001100111100001111011100011111101110111111101011" to "Scout",
            "0101100111100011110101011111011011111010111011011" to "Sorcerer",
            "0001101110110011100101010111001101110110011110001" to "Spellsword",
            "1001100111100001110010110001111001110111111110011" to "Warrior"
    )

//    -- Game--

    val GAME_ITEMS_LIST = mapOf(
            "1111100010100011100100100011001101111010110100110" to PLAYER_GAME_FIRST,
            "1000110010010000100110010111110110000100100011001" to PLAYER_GAME_SECOND,
            "1101011100111100000000010110110100000010010000000" to GAME_WIN,
            "0011110001101011001011011010010011110010000110001" to GAME_WIN2,
            "0100011000101100110010000011001010011110100001011" to GAME_LOSS,
            "0000011000001111111100001111101000011000110010000" to GAME_LOSS2,
            "0100000110011000011000100100110000001000101010000" to GAME_YOUR_TURN
    )

    val GAME_PLAYER_CLASS_LIST = mapOf(
            "0101100001001100101110010111111100011010010111110" to "Archer",
            "0110110001100100011010001111011100001001010110110" to "Assassin",
            "0001100001001100101110000111011011010010010111100" to "Battlemage",
            "0001100011001100100110000111111000000110000111100" to "Crusader",
            "0011110010100100110010001101111000000100100110110" to "Mage",
            "0110111001100100011000000111111100011000010010110" to "Monk",
            "0011101010100100101110000111011001000110010011110" to "Scout",
            "0011111011100100111010001101011100001100110110110" to "Sorcerer",
            "0011011001100100111000000101110010001000010111110" to "Spellword",
            "0001100011001100101110000111011110000110010111100" to "Warrior"
    )

    val GAME_OPPONENT_CLASS_LIST = mapOf(
            "0100000011001010011110001011001101011001000111000" to "Archer",
            "0100000011001010011011001111001100011001000110010" to "Assassin",
            "0001100011001000100111001011011001010011000101100" to "Battlemage",
            "0001100010001000100110001111011000010010000101100" to "Crusader",
            "0000000010011010010011001111011000000000110110100" to "Mage",
            "0100001001001010011110001111001110011001000110000" to "Monk",
            "0001000110011001011110001011011001000100110011000" to "Scout",
            "0000000010001010011011001101010110000000000110000" to "Sorcerer",
            "0000000000001010011111001111010011001000000110100" to "Spellword",
            "0001000010001000100110001011011011000000000111100" to "Warrior"
    )

}