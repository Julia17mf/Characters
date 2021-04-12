package com.example.kurokonobasket;

import java.util.ArrayList;

public class CharacterData {
    private static String[] title = new String[]{"Kuroko Tetsuya", "Kagami Taiga", "Kise Ryouta",
            "Midorima Shintarou", "Aomine Daiki", "Murasakibara Atsushi", "Akashi Seijuro",
            "Haizaki Shougo", "Izuki Shuun", "Takao Kazunari"};

    private static int[] thumbnail = new
            int[]{R.drawable.kuroko, R.drawable.kagami, R.drawable.kise,
            R.drawable.midorima, R.drawable.aomine, R.drawable.murasakibara,
            R.drawable.akashi, R.drawable.haizaki, R.drawable.izuki, R.drawable.takao};

    public static ArrayList<CharacterModel> getListData(){
        CharacterModel characterModel = null;
        ArrayList<CharacterModel> list = new ArrayList<>();
        for (int i = 0; i <title.length; i++){
            characterModel = new CharacterModel();
            characterModel.setCharProfile(thumbnail[i]);
            characterModel.setCharName(title[i]);
            list.add(characterModel);
        }
        return list;
    }
}
