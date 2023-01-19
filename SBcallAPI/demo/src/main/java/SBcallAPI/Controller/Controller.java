package SBcallAPI.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller
{
    @ResponseBody
    @GetMapping("/test")
    public String simpleGET(@RequestParam String name)
    {
        String uri = "https://api.nationalize.io/?name=" + name;

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        System.out.println(result);

        return name + "     " + result;
    }

}

