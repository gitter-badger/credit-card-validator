package br.com.moip.creditcard;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class EloCreditCard {

    private static Set<String> ELO_BINS = new TreeSet<String>(Arrays.asList(
            "50670", "50671", "50672", "50673", "50674", "50675", "50676", "50900", "50901", "50902","50903", "50904",
            "50905", "50906", "50907", "401178", "401179", "509807", "431274", "438935", "451416", "457393", "457631",
            "457632", "504175", "506707", "506708", "506715", "506717", "506718", "506719", "506720", "506721", "506724",
            "506725", "506726", "506727", "506728", "506729", "506730", "506731", "506732", "506733", "506739", "506740",
            "506741", "506742", "506743", "506744", "506745", "506746", "506747", "506748", "506750", "506751", "506752",
            "506753", "50676", "509000",  "509001", "509002", "509004", "509005", "509006", "509007", "509008", "509009",
            "509013", "509014", "509015", "509016", "509017", "509018", "509019", "509020", "509021", "509022", "509023",
            "509024", "509025", "509026", "509027", "509028", "509029", "509031", "509032", "509033", "509034", "509035",
            "509036", "509037", "509038", "509039", "509040", "509041", "509042", "509043", "509044", "509045", "509046",
            "509047", "509048", "509049", "509050", "509051", "509052", "509053", "509054", "509055", "509056", "509057",
            "509058", "509059", "509060", "509061", "509062", "509063", "509064", "509066", "509067", "509068", "509069",
            "509070", "509071", "509072", "509074", "509075", "509076", "509077", "509078", "509079", "509080", "509081",
            "509082", "509083", "509084", "509085", "506699", "506770", "506771", "506772", "506773", "506774", "506775",
            "506776", "506777", "506778", "627780", "636297", "636368"
    ));

    public static boolean isBrandElo(final String number) {
        return number != null && number.length() == 16
                && (ELO_BINS.contains(number.substring(0, 5)) || ELO_BINS.contains(number.substring(0, 6)));
    }
}

