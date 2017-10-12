package me.tulus.recipeapps.Data;

import java.util.ArrayList;

import me.tulus.recipeapps.Adapter.RecipeAdapter;

public class RecipeData {
    public static String[][] data = new String[][]{
            {"Pecel", "Makanan Rumah",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/Pecel_Solo.JPG/220px-Pecel_Solo.JPG",
                    "Bahan\n\n- 250 gr bayam, siangi, buang batangnya\n" +
                            "- 250 gr tauge, bersihkan akarnya\n" +
                            "- 250 gr kacang panjang, potong 5 cm\n" +
                            "- 250 gr bunga turi, buang putiknya"+
                            "\n\n Bumbu\n\n1. 350 gr kacang tanah, goreng, haluskan\n" +
                            "2. 4 lembar daun jeruk, iris halus\n" +
                            "3. 2 sdm air asam\n" +
                            "4. 300 ml air\n" +
                            "5. 4 buah cabai rawit merah\n" +
                            "6. 1 siung bawang putih\n" +
                            "7. 0.5 cm kencur\n" +
                            "8. ½ sdt terasi bakar\n" +
                            "9. 3 sdm gula merah iris\n" +
                            "10. 1 sdm makan garam"+
                            "\n\nCara Membuat\n\nRebus bayam, bunga turi, kacang panjang, dan tauge bergantian dengan air mendidih. Tiriskan, sisihkan.\n" +
                            "Campur kacang tanah halus dengan bumbu lainnya, haluskan kembali. Campur dengan air asam. Uleni dengan sendok hingga tercampur rata.\n" +
                            "Siapkan piring saji, susun sayuran rebus.\n" +
                            "Siapkan mangkok sambal, cairkan bumbu sambal dengan air. Sajikan."
            },
            {
                    "Gado Gado","Masakan Rumah",
                    "http://www.bango.co.id/gfx/recipes/1366624520.jpg",
                    "Bahan\n" +
                            "350 gram kentang, rebus, goreng, potong-potong \n" +
                            "350 gram tahu putih \n" +
                            "350 gram tempe \n" +
                            "7 lembar daun selada, sobek-sobek \n" +
                            "2 buah ketimun, iris tipis \n" +
                            "100 gram taoge, rebus \n" +
                            "200 gram kol, iris kasar, rebus \n" +
                            "Minyak untuk menggoreng\n" +
                            "Bahan Perendam Tahu Tempe (aduk Rata):\n" +
                            "3 siung bawang putih, haluskan \n" +
                            "1 sendok teh ketumbar bubuk \n" +
                            "1 sendok teh garam \n" +
                            "200 ml air\n" +
                            "Bahan Saus:\n" +
                            "200 gram kacang tanah kulit, goreng, haluskan \n" +
                            "3 lembar daun jeruk, buang tulang daunnya \n" +
                            "2 sendok makan kecap manis Bango \n" +
                            "1 sendok teh garam \n" +
                            "3 sendok teh gula merah, sisir halus \n" +
                            "600 ml santan dari 1/4 butir kelapa \n" +
                            "3 1/2 sendok teh air asam, jawa dari 1 sendok teh asam jawa dan 2 sendok makan air, larutkan \n" +
                            "2 sendok makan minyak untuk menumis\n" +
                            "Bumbu Halus:\n" +
                            "5 buah cabai merah besar, buang bijinya \n" +
                            "3 buah cabai merah keriting \n" +
                            "5 cm kencur \n" +
                            "4 siung bawang putih \n" +
                            "1/2 sendok teh terasi goreng\n" +
                            "Bahan Pelengkap:\n" +
                            "3 sendok makan bawang merah goreng untuk taburan \n" +
                            "100 gram kerupuk kanji \n" +
                            "100 gram emping goreng \n" +
                            "2 buah tomat, iris-iris \n" +
                            "4 butir telur rebus, potong-potong"
            },
            {
                    "Nasi Goreng","Sarapan Sehat",
                    "https://www.bbcgoodfood.com/sites/default/files/styles/recipe/public/recipe/recipe-image/2016/05/nasi-goreng.jpg?itok=f6_VrVGC",
                    "Bahan Utama\n" +
                            "Blue Band  1 sdm\n" +
                            "Telur 2 butir\n" +
                            "Daun bawang, Potong 1 batang\n" +
                            "Wortel, Potong dadu. Rebus sebentar 50 gr\n" +
                            "Nasi 600 gr\n" +
                            "Royco ayam 1 sdm\n" +
                            "Bawang merah, Iris tipis 5 butir\n" +
                            "Bawang putih, Cincang halus 3 siung\n" +
                            "Kecap manis Bango 1/2 sdm\n" +
                            "Garam 1/2 sdt / secukupnya\n" +
                            "lada 1/4 sdt\n" +
                            "Gula 1/2 sdt"
            }
    };

    public static ArrayList<RecipeAdapter> getListData() {
        RecipeAdapter bg = null;
        ArrayList<RecipeAdapter> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            bg = new RecipeAdapter();
            bg.setName(data[i][0]);
            bg.setDesc(data[i][1]);
            bg.setPhoto(data[i][2]);
            bg.setRecipe(data[i][3]);


            list.add(bg);
        }

        return list;
    }

}
