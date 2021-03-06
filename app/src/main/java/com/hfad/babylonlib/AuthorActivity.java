package com.hfad.babylonlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AuthorActivity extends AppCompatActivity {

    RecyclerView authorRecycler;
    AuthorAdapter authorAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author);

        List<Author> authorList = new ArrayList<>();
        authorList.add(new Author(1, "Александр Сергеевич Пушкин", "pushkin", "Александр Сергеевич Пушкин (26 мая [6 июня] 1799, Москва — 29 января [10 февраля] 1837, Санкт-Петербург) — русский поэт, драматург и прозаик, заложивший основы русского реалистического направления, литературный критик и теоретик литературы, историк, публицист, журналист; один из самых авторитетных литературных деятелей первой трети XIX века. Ещё при жизни Пушкина сложилась его репутация величайшего национального русского поэта. Пушкин рассматривается как основоположник современного русского литературного языка."));
        authorList.add(new Author(2, "Лев Николаевич Толстой", "tolstoy", "Граф Лев Николаевич Толстой (28 августа [9 сентября] 1828, Ясная Поляна, Тульская губерния, Российская империя — 7 [20] ноября 1910, станция Астапово, Рязанская губерния, Российская империя) — один из наиболее известных русских писателей и мыслителей, один из величайших писателей-романистов мира. Участник обороны Севастополя. Просветитель, публицист, религиозный мыслитель, его авторитетное мнение послужило причиной возникновения нового религиозно-нравственного течения. За свои взгляды был отлучён от церкви. Член-корреспондент Императорской Академии наук (1873), почётный академик по разряду изящной словесности (1900). Был номинирован на Нобелевскую премию по литературе (1902, 1903, 1904, 1905). Впоследствии отказался от дальнейших номинаций. Классик мировой литературы."));
        authorList.add(new Author(3, "Александр Романович Беляев", "belyaev", "Александр Романович Беляев (4 (16) марта 1884 — 6 января 1942) — русский и советский писатель-фантаст, журналист и юрист. Один из основоположников советской научно-фантастической литературы, первый из советских писателей, целиком посвятивший себя этому жанру. Среди наиболее известных его романов: «Голова профессора Доуэля», «Человек-амфибия», «Ариэль», «Звезда КЭЦ» и многие другие (всего более 70 научно-фантастических произведений, в том числе 17 романов). За значительный вклад в русскую фантастику и провидческие идеи Беляева называют «русским Жюлем Верном»."));
        authorList.add(new Author(4, "Федор Михайлович Достоевский", "dostoevsky", "Фёдор Михайлович Достоевский (30 октября [11 ноября] 1821, Москва, Российская империя — 28 января [9 февраля] 1881, Санкт-Петербург, Российская империя) — русский писатель, мыслитель, философ и публицист. Член-корреспондент Петербургской академии наук с 1877 года. Классик мировой литературы, по данным ЮНЕСКО, один из самых читаемых писателей в мире. Собрание сочинений Достоевского состоит из 12 романов, четырех новелл, 16 рассказов и множества других произведений."));
        authorList.add(new Author(5, "Александр Васильевич Перышкин", "peryshkin", "Александр Васильевич Пёрышкин (21 августа [3 сентября] 1902, село Деревенское — 21 мая 1983, Москва) — советский русский учёный, физик, кандидат педагогических наук, профессор, член-корреспондент Академии педагогических наук РСФСР (1950 г.), член-корреспондент Академии педагогических наук СССР (1968 г.), лауреат Государственной премии СССР (1978 г.), кавалер ордена Ленина и Октябрьской революции, писатель-составитель учебников по физике."));

        setAuthorRecycler(authorList);
    }

    private void setAuthorRecycler(List<Author> authorList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        authorRecycler = findViewById(R.id.authorRecycler);
        authorRecycler.setLayoutManager(layoutManager);
        authorAdapter = new AuthorAdapter(this, authorList);
        authorRecycler.setAdapter(authorAdapter);
    }
}