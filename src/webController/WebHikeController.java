package webController;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import webService.WebHikeService;

@Controller
public class WebHikeController {
    @RequestMapping(value = "/hike/{distance}/{season}/{numberOfPeople}/{numberOfPets}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    @ResponseBody
    public String getItems(@PathVariable("distance") int distance,
                           @PathVariable("season") String season,
                           @PathVariable("numberOfPeople") int numberOfPeople,
                           @PathVariable("numberOfPets") int numberOfPets) {

        return WebHikeService.getHikeInformation(distance, season, numberOfPeople, numberOfPets);
    }

}
