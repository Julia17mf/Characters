package com.example.kurokonobasket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Details extends AppCompatActivity {
    private ImageView ivProfile;
    private TextView tvName, tvDetails;
    private String description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ivProfile   = findViewById(R.id.char_profile);
        tvName      = findViewById(R.id.char_name);
        tvDetails   = findViewById(R.id.char_details);

        int profile = getIntent().getIntExtra("profile", 0);
        String name = getIntent().getStringExtra("name");

        if (name.equals("Kuroko Tetsuya")) {
            description = "Tetsuya Kuroko (黒子 テツヤ Kuroko Tetsuya) is the main protagonist of" +
                    "the manga, Kuroko no Basuke. He was the Phantom Sixth Player of the" +
                    "Generation of Miracles at Teikō Junior High. He specialises in misdirection" +
                    "and passes. He now plays as a regular with Seirin with the goal of bringing" +
                    "the team and Taiga Kagami to the top of Japan.";
        } else if (name.equals("Kagami Taiga")) {
            description = "Taiga Kagami (火神 大我 Kagami Taiga) is the deuteragonist of the " +
                    "Kuroko no Basuke series as well as the ace and power forward of Seirin High." +
                    "He is Tetsuya Kuroko's basketball colleague and friend. He is determined to" +
                    "defeat the Generation of Miracles and become the best in Japan." +
                    "Kagami has exceptional basketball talents and has been called \"The Miracle " +
                    "who did not become one of the Miracles\".";
        } else if (name.equals("Kise Ryouta")){
            description = "Ryōta Kise (黄瀬 涼太 Kise Ryōta) was the Generation of Miracles' " +
                    "small forward who now plays at Kaijō High. He is well known for his copying " +
                    "abilities, as he can copy any technique he sees, often with more power than " +
                    "the original. He also works as a model.";
        } else if (name.equals("Midorima Shintarou")) {
            description = "Shintarō Midorima (緑間 真太郎 Midorima Shintarō) was the vice-captain " +
                    "and shooting guard of the Generation of Miracles. He now plays for one of " +
                    "the Three Kings of Tokyo, Shūtoku High. Midorima has dark green hair parted " +
                    "to the left that doesn't reach his eyes. He has light green eyes with " +
                    "prominent lower eyelashes, and wears black-framed glasses that are framed on " +
                    "all sides except the top. He is very tall, being the second tallest from the " +
                    "Generation of Miracles.";
        } else if (name.equals("Aomine Daiki")) {
            description = "Daiki Aomine (青峰 大輝 Aomine Daiki) was the ace player of the " +
                    "renowned Generation of Miracles and was the former partner/light of Kuroko " +
                    "in Teikō. He currently plays as the ace and power forward of Tōō Academy. " +
                    "He and Kagami are sworn rivals after their clashes in the Interhigh " +
                    "preliminaries and in the Winter Cup. He was the main antagonist until the " +
                    "first round of the Winter Cup.";
        } else if (name.equals("Murasakibara Atsushi")) {
            description = "Atsushi Murasakibara (紫原 敦 Murasakibara Atsushi) was the Generation " +
                    "of Miracles' center. He now plays for Yōsen High. Murasakibara is abnormally " +
                    "tall for someone his age. Standing even taller than Papa Mbaye Siki, he is " +
                    "one of the largest players seen in the entire series. He has shoulder " +
                    "length, lavender hair that touches his back and violet eyes. ";
        } else if (name.equals("Akashi Seijuro")) {
            description = "Seijūrō Akashi (赤司 征十郎 Akashi Seijūrō) was the captain of " +
                    "Generation of Miracles. He is the only person that the Generation of " +
                    "Miracles knuckles under. He is the point guard and captain of Rakuzan High " +
                    "and later on for Team Vorpal Swords as well.";
        } else if (name.equals("Haizaki Shougo")) {
            description = "Shōgo Haizaki (灰崎 祥吾 Haizaki Shōgo) is an ex-regular of Teikō " +
                    "Junior High, being replaced by Ryōta Kise. He now plays with Fukuda Sōgō " +
                    "Academy as a small forward and has competed in the Winter Cup. Haizaki is a " +
                    "tall young man with an athletic build. He has dark gray hair, and his " +
                    "hairstyle is cornrows that he keeps in braids to the back.";
        } else if (name.equals("Izuki Shuun")) {
            description = "Shun Izuki (伊月 俊 Idzuki Shun) is a second-year regular point guard " +
                    "and vice-captain at Seirin. His signature ability is the Eagle Eye, which " +
                    "helps him keep track of the court and tailor his team's plays accordingly. " +
                    "Izuki has straight black hair that reaches his eyes. His eyes are narrow " +
                    "and resemble an eagle, which hints to his ability. His eyes are also " +
                    "usually shown without pupils, entirely black.";
        } else {
            description = "Kazunari Takao (高尾 和成 Takao Kazunari ) is Shūtoku's first-year " +
                    "point guard. He is Kuroko's natural enemy, as he has the Hawk-Eye and is " +
                    "able to see Kuroko even if he uses his misdirection. Takao has long, " +
                    "straight black hair. In front, his hair is kept stroked backward, with " +
                    "occasionally a few strands of hair falling down to his eyes. As seen during " +
                    "the training camp, he sometimes keeps his hair out of his eyes by using a hair band.";
        }

        Glide.with(this).load(profile).into(ivProfile);
        tvName.setText(name);
        tvDetails.setText(description);
    }
}