package webService;


import com.google.gson.Gson;
import model.Hike;


public class WebHikeService {
    public static String getHikeInformation(int distance, String season, int numberOfPeople, int numberOfPets) {
        Gson parser = new Gson();
        int days = 0;
        Hike hike = new Hike();
        if (distance <= 0) {
            return "Atstumas privalo buti didesnis uz 0";
        } else {
            hike.setDistance(distance);
        }
        while (distance > 0) {
            distance -= 30;
            days++;
        }
        hike.setDays(days);
        switch (season) {
            case "Summer":
                hike.setItem("Kepure nuo saules");
                break;
            case "Autumn":
                hike.setItem("Sketis");
                break;
            case "Winter":
                hike.setItem("Pirstines");
                break;
            case "Spring":
                hike.setItem("Kepure");
                break;
            default:
                return "Sezonas privalo buti Summer/Autumn/Winter/Spring";
        }
        if (numberOfPeople < 1) {
            return "Zmoniu skaicius privalo buti 1 arba daugiau";
        } else {
            hike.setNumberoOfPeople(numberOfPeople);
            hike.setFoodSuppliesInDaysForPeople(days * numberOfPeople);
        }
        if (numberOfPets > 0) {
            hike.setFoodSuppliesInDaysForPets(days * numberOfPets);
            hike.setNumberOfPets(numberOfPets);
        } else if (numberOfPets < 0) {
            return "Augintiniu skaicius privalo buti 0 arba daugiau";
        }
        return parser.toJson(hike);
    }
}
